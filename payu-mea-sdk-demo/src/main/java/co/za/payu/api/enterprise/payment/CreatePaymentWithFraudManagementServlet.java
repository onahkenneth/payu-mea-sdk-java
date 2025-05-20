package co.za.payu.api.enterprise.payment;

import java.io.IOException;
import java.util.UUID;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import co.za.payu.api.IResponse;
import co.za.payu.api.redirect.BaseSample;
import co.za.payu.base.soap.APIContext;
import co.za.payu.base.soap.JSONFormatter;
import co.za.payu.base.exception.PayUSOAPException;
import co.za.payu.util.SampleConstants;
import co.za.payu.ws.*;
import co.za.payu.api.Payment;
import co.za.payu.util.ResultPrinter;
import org.apache.log4j.Logger;

/**
 * Created by kenny on 4/20/17.
 */
public class CreatePaymentWithFraudManagementServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(CreatePaymentWithFraudManagementServlet.class);

    private ObjectFactory objectFactory = new ObjectFactory();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

    // ##Create
    // Sample showing to create a Payment using
    // CreditCard as a FundingInstrument
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        createPaymentWithFraudManagement(req, resp);
        req.getRequestDispatcher("../../response.jsp").forward(req, resp);
    }

    @SuppressWarnings("Duplicates")
    private IResponse createPaymentWithFraudManagement(HttpServletRequest req, HttpServletResponse resp) {

        String baseUrl = BaseSample.getBaseUrl(req);

        APIContext apiContext = new APIContext(SampleConstants.apiUsername, SampleConstants.apiPassword,
                SampleConstants.safeKey, SampleConstants.mode, SampleConstants.account3);

        // ###CreditCard
        // A resource representing a credit card that can be
        // used to fund a payment.
        CreditCard creditCard = objectFactory.createCreditCard()
                .setCvv("123")
                .setCardExpiry("112019")
                .setNameOnCard("Joe Shopper")
                .setCardNumber("4000015372250142")
                .setInformation("visa")
                .setAmountInCents("7500");

        // ###ProductLineItem
        // A resource representing product line items. prices are in cents/integer
        ProductLineItem productLineItem = objectFactory.createProductLineItem()
                .setRecipientFirstName("Joe")
                .setRecipientLastName("Shopper")
                .setRecipientEmail("approve@test.com")
                .setRecipientPhone("27827777777")
                .setRecipientAddress1("80 Main Road")
                .setRecipientAddress2("Cnr Burg, Castle and Strand Street")
                .setRecipientCity("Cape Town")
                .setRecipientStateCode("WC")
                .setRecipientPostalCode("8000")
                .setRecipientCountryCode("ZAF")
                .setProductCode("GCF0011")
                .setDescription("Ground Coffee 40 oz")
                .setSku("GCF0011")
                .setQuantity("10")
                .setCostAmount("750")
                .setAmount("7500");

        // ###ShippingDetails
        // A resource representing shipping details
        ShippingDetails shippingDetails = objectFactory.createShippingDetails()
                .setShippingId("344")
                .setShppingFirstName("Joe")
                .setShippingLastName("Shopper")
                .setShippingEmail("approve@test.com")
                .setShippingPhone("27827777777")
                .setShippingMethod("N")
                .setShippingAddress1("80 Main Road")
                .setShippingAddress2("Cnr Burg, Castle and Strand Street")
                .setShippingAddressCity("Cape Town")
                .setShippingStateCode("WC")
                .setShippingPostCode("8000")
                .setShippingCountryCode("ZAF");

        // ###Basket
        // A resource representing a Basket/Cart belonging to a customer
        Basket basket = objectFactory.createBasket()
                .setDescription("My payment")
                .setCurrencyCode("ZAR")
                .setAmountInCents("7500")
                .setShippingDetails(shippingDetails);
        basket.getProductLineItem().add(productLineItem);

        // ###Customer
        // A resource representing a Customer that funds a payment
        Customer customer = objectFactory.createCustomer()
                .setIp("127.0.0.1")
                .setFirstName("Joe")
                .setLastName("Shopper")
                .setEmail("approve@test.com")
                .setMobile("0827777777")
                .setCountryCode("27")
                .setMerchantUserId("890")
                .setAddress1("80 Main Road")
                .setAddress2("Cnr Burg, Castle and Strand Street")
                .setAddressCity("Cape Town")
                .setStateCode("WC")
                .setPostCode("8000")
                .setCountryOfResidence("ZAF")
                .setCountryCode("27");

        // ###Fraud
        // A resource representing Fraud management details
        Fraud fraud = objectFactory.createFraud()
                .setCheckFraudOverride("false")
                .setMerchantWebSite("http://example.com")
                .setPcFingerPrint("owhjiflkwhefqwoaef");

        // ###AdditionalInfo
        // A resource representing AdditionalInfo about the transaction
        AdditionalInfo additionalInfo = objectFactory.createAdditionalInfo()
                .setDeviceId("TERM003")
                .setNotificationUrl(baseUrl + "reserve/payment/return")
                .setMerchantReference(UUID.randomUUID().toString());

        // ###DoTransaction
        // A DoTransaction defines the Request payload of a
        // payment - DoTransaction is created with
        // a `Customer`, `Basket`, `Creditcard` and other types
        DoTransaction doTransaction = objectFactory.createDoTransaction()
                .setTransactionType(TransactionType.PAYMENT)
                .setAdditionalInformation(additionalInfo)
                .setBasket(basket)
                .setCustomer(customer)
                .setFraud(fraud);
        doTransaction.getCreditcard().add(creditCard);

        // ###Payment
        // A Payment defines the contract of a
        // payment - what is the payment for and who
        // is fulfilling it. Payment is created with
        // a `DoTransaction`
        Payment payment = new Payment();
        payment.setRequest(doTransaction);

        DoTransactionResponseMessage doTransactionResponseMessage = null;

        try {

            doTransactionResponseMessage = (DoTransactionResponseMessage) payment.create(apiContext);

            LOGGER.info("Created payment with id = " + doTransactionResponseMessage.getPayUReference() +
                    " and status = " + doTransactionResponseMessage.getResultCode());
            ResultPrinter.addResult(req, resp, "Create Payment with Fraud Management",
                    Payment.getLastRequest(), Payment.getLastResponse(), null);
        } catch (PayUSOAPException ex) {
            ResultPrinter.addResult(req, resp, "Create Payment with Fraud Management. If Exception, " +
                            "check response for details.", JSONFormatter.toJSON(doTransaction),
                    JSONFormatter.toJSON(doTransactionResponseMessage), ex.getMessage());
        }

        return doTransactionResponseMessage;
    }
}
