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
public class GetPaymentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(GetPaymentServlet.class);

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
        getPayment(req, resp);

        req.getRequestDispatcher("../../response.jsp").forward(req, resp);
    }

    @SuppressWarnings("Duplicates")
    private IResponse getPayment(HttpServletRequest req, HttpServletResponse resp) {

        String baseUrl = BaseSample.getBaseUrl(req);

        APIContext apiContext = new APIContext(SampleConstants.apiUsername, SampleConstants.apiPassword,
                SampleConstants.safeKey, SampleConstants.mode, SampleConstants.account7);

        DoTransactionResponseMessage createdPayment = (DoTransactionResponseMessage) createPayment(req, resp, apiContext, baseUrl);

        // ###AdditionalInfo
        // A resource representing AdditionalInfo about the transaction
        AdditionalInfo additionalInfo = objectFactory.createAdditionalInfo()
                .setPayUReference(createdPayment.getPayUReference());

        // ###GetTransaction
        // A GetTransaction defines the Request payload to get
        // payment details - GetTransaction is created with
        // a `payUReference`
        GetTransaction getTransaction = objectFactory.createGetTransaction()
                .setAdditionalInformation(additionalInfo);

        // ###Payment
        // A Payment defines the contract of a
        // payment - what is the payment for and who
        // is fulfilling it. This Payment is created with
        // a `GetTransaction`
        Payment payment = new Payment();
        payment.setRequest(getTransaction);

        GetTransactionResponseMessage getTransactionResponseMessage = null;

        try {

            getTransactionResponseMessage = (GetTransactionResponseMessage) payment.get(apiContext);

            LOGGER.info("Get payment id = " + getTransactionResponseMessage.getPayUReference() + " and result code = "
                    + getTransactionResponseMessage.getResultCode());
            ResultPrinter.addResult(req, resp, "Get Payment details", JSONFormatter.toJSON(getTransaction),
                    JSONFormatter.toJSON(getTransactionResponseMessage), null);
        } catch (PayUSOAPException ex) {
            ResultPrinter.addResult(req, resp, "Get Payment details", JSONFormatter.toJSON(getTransaction),
                    JSONFormatter.toJSON(getTransactionResponseMessage), ex.getMessage());
        }

        return getTransactionResponseMessage;
    }

    private IResponse createPayment(HttpServletRequest req, HttpServletResponse resp, APIContext apiContext, String baseUrl) {
        // ###CreditCard
        // A resource representing a credit card that can be
        // used to fund a payment.
        CreditCard creditCard = objectFactory.createCreditCard()
                .setCvv("123")
                .setCardExpiry("112019")
                .setNameOnCard("Joe Shopper")
                .setCardNumber("4000015372250142")
                .setInformation("visa")
                .setAmountInCents("1750");

        // ###ProductLineItem
        // A resource representing product line items. prices are in cents/integer
        ProductLineItem productLineItem1 = objectFactory.createProductLineItem();
        ProductLineItem productLineItem2 = objectFactory.createProductLineItem();
        productLineItem1.setDescription("Ground Coffee 40 oz")
                .setSku("GCF0011")
                .setQuantity("10")
                .setCostAmount("750")
                .setAmount("7500");
        productLineItem2.setDescription("Granola Bars with Peanuts")
                .setSku("GCF0022")
                .setQuantity("5")
                .setCostAmount("200")
                .setAmount("1000");


        // ###Basket
        // A resource representing a Basket/Cart belonging to a customer
        Basket basket = objectFactory.createBasket()
                .setDescription("My payment")
                .setCurrencyCode("ZAR")
                .setAmountInCents("1750");
        basket.getProductLineItem().add(productLineItem1);
        basket.getProductLineItem().add(productLineItem2);

        // ###Customer
        // A resource representing a Customer that funds a payment
        Customer customer = objectFactory.createCustomer()
                .setIp("127.0.0.1")
                .setFirstName("Joe")
                .setLastName("Shopper")
                .setEmail("joe.shopper@example.com")
                .setMobile("0748523695")
                .setCountryCode("27")
                .setMerchantUserId("890")
                .setAddress1("80 Main Road")
                .setAddress2("Cape Town")
                .setAddressCity("Cape Town")
                .setStateCode("WC")
                .setPostCode("8000")
                .setCountryOfResidence("ZAF");

        AdditionalInfo additionalInfo = objectFactory.createAdditionalInfo()
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
                .setCustomer(customer);
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

            LOGGER.info("Created payment with id = " + doTransactionResponseMessage.getPayUReference() + " and result code = "
                    + doTransactionResponseMessage.getResultCode());
            ResultPrinter.addResult(req, resp, "Create Payment With Credit Card",
                    Payment.getLastRequest(), Payment.getLastResponse(), null);
        } catch (PayUSOAPException ex) {
            ResultPrinter.addResult(req, resp, "Create Payment With Credit Card. If 500 Exception, check " +
                            "response details", JSONFormatter.toJSON(doTransaction),
                    JSONFormatter.toJSON(doTransactionResponseMessage), ex.getMessage());
        }

        return doTransactionResponseMessage;
    }
}
