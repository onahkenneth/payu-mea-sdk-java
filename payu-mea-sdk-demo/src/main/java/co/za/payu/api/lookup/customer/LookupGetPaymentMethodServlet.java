package co.za.payu.api.lookup.customer;

import java.io.IOException;
import java.util.UUID;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import co.za.payu.api.IResponse;
import co.za.payu.api.LookupTransaction;
import co.za.payu.api.Payment;
import co.za.payu.api.redirect.BaseSample;
import co.za.payu.base.soap.APIContext;
import co.za.payu.base.soap.JSONFormatter;
import co.za.payu.base.exception.PayUSOAPException;
import co.za.payu.util.SampleConstants;
import co.za.payu.ws.*;
import co.za.payu.util.ResultPrinter;
import org.apache.log4j.Logger;

/**
 * Created by kenny on 4/20/17.
 */
public class LookupGetPaymentMethodServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(LookupGetPaymentMethodServlet.class);

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
        lookupGetPaymentMethod(req, resp);
        req.getRequestDispatcher("../../response.jsp").forward(req, resp);
    }

    @SuppressWarnings("Duplicates")
    private IResponse lookupGetPaymentMethod(HttpServletRequest req, HttpServletResponse resp) {

        String baseUrl = BaseSample.getBaseUrl(req);

        APIContext apiContext = new APIContext(SampleConstants.apiUsername, SampleConstants.apiPassword,
                SampleConstants.safeKey, SampleConstants.mode, SampleConstants.account7);

        createCreditCard(req, resp, apiContext, baseUrl);

        CustomField customField = objectFactory.createCustomField()
                .setKey("MerchantUserId")
                .setValue("890");

        // ###GetLookupTransaction
        // A transaction information lookup request object
        GetLookupTransaction getLookupTransaction = objectFactory.createGetLookupTransaction()
                .setLookupTransactionType(LookupTransactionType.TOKEN);
        getLookupTransaction.getCustomfield().add(customField);

        // ###LookupTransaction
        // A LookupTransaction defines what information you want to retrieve.
        // LookupTransaction is created with a `GetLookupTransaction`
        LookupTransaction lookupTransaction = new LookupTransaction();
        lookupTransaction.setRequest(getLookupTransaction);

        LookupTransactionResponseMessage lookupTransactionResponseMessage = null;

        try {

            lookupTransactionResponseMessage = (LookupTransactionResponseMessage) lookupTransaction.lookup(apiContext);

            LOGGER.info("Lookup transaction request with id = " + lookupTransactionResponseMessage.getPayUReference()
                    + " and result code = " + lookupTransactionResponseMessage.getResultCode());

            ResultPrinter.addResult(req, resp, "Lookup Transactions", LookupTransaction.getLastRequest(),
                    LookupTransaction.getLastResponse(), null);

        } catch (PayUSOAPException ex) {
            ResultPrinter.addResult(req, resp, "Lookup Transactions", JSONFormatter.toJSON(getLookupTransaction),
                    JSONFormatter.toJSON(lookupTransactionResponseMessage), ex.getMessage());
        }

        return lookupTransactionResponseMessage;
    }

    private IResponse createCreditCard(HttpServletRequest req, HttpServletResponse resp, APIContext apiContext, String baseUrl) {

        // ###CreditCard
        // A resource representing a credit card that can be
        // used to fund a payment.
        CreditCard creditCard = objectFactory.createCreditCard()
                .setCvv("123")
                .setCardExpiry("112019")
                .setNameOnCard("Joe Shopper")
                .setCardNumber("5100011063555010")
                .setInformation("mastercard")
                .setAmountInCents("10000");

        // ###Customer
        // A resource representing a Basket/Cart belonging to a customer
        Basket basket = objectFactory.createBasket()
                .setDescription("My payment")
                .setCurrencyCode("ZAR")
                .setAmountInCents("10000");

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
                .setAddress1("21 Main Road")
                .setAddress2("Cape Town")
                .setAddressCity("Cape Town")
                .setStateCode("WC")
                .setPostCode("2000")
                .setCountryOfResidence("ZAF");

        // ###AdditionalInfo
        // A resource representing AdditionalInfo about the transaction
        AdditionalInfo additionalInfo = objectFactory.createAdditionalInfo()
                .setNotificationUrl(baseUrl + "reserve/payment/return")
                .setMerchantReference(UUID.randomUUID().toString())
                .setStorePaymentMethod("true");

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

            LOGGER.info("Created and save credit card with id = " + doTransactionResponseMessage.getPayUReference()
                    + " and result code = " + doTransactionResponseMessage.getResultCode());

            ResultPrinter.addResult(req, resp, "Create Payment and Save Credit Card", Payment.getLastRequest(),
                    Payment.getLastResponse(), null);

        } catch(Exception ex) {
            ResultPrinter.addResult(req, resp, "Create Payment and Save Credit Card", JSONFormatter.toJSON(doTransactionResponseMessage),
                    JSONFormatter.toJSON(doTransactionResponseMessage), ex.getMessage());
        }

        return doTransactionResponseMessage;
    }
}