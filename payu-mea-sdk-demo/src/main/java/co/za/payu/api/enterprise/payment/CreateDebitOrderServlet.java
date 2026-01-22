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
import co.za.payu.base.soap.PayUResource;
import co.za.payu.base.exception.PayUSOAPException;
import co.za.payu.util.SampleConstants;
import co.za.payu.ws.*;
import co.za.payu.api.Payment;
import co.za.payu.util.ResultPrinter;
import org.apache.log4j.Logger;

/**
 * Created by kenny on 4/20/17.
 */
public class CreateDebitOrderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(CreateDebitOrderServlet.class);

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
        createDebitOrder(req, resp);
        req.getRequestDispatcher("../../response.jsp").forward(req, resp);
    }

    @SuppressWarnings("Duplicates")
    private IResponse createDebitOrder(HttpServletRequest req, HttpServletResponse resp) {

        String baseUrl = BaseSample.getBaseUrl(req);

        APIContext apiContext = new APIContext(SampleConstants.apiUsername, SampleConstants.apiPassword,
                SampleConstants.safeKey, SampleConstants.mode, SampleConstants.account4);

        // ###CreditCard
        // A resource representing a credit card that can be
        // used to fund a payment.
        CreditCard creditCard = objectFactory.createCreditCard()
                .setCvv("123")
                .setCardExpiry("112019")
                .setNameOnCard("Joe Shopper")
                .setCardNumber("4000015372250142")
                .setInformation("visa")
                .setAmountInCents("10000");

        // ###Basket
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
                .setPostCode("2000");

        // ###AdditionalInfo
        // A resource representing Additional Information about the transaction information
        AdditionalInfo additionalInfo = objectFactory.createAdditionalInfo()
                .setNotificationUrl(baseUrl + "reserve/payment/return")
                .setMerchantReference(UUID.randomUUID().toString())
                .setCallCenterRepId("25,26");

        // ###TransactionRecord
        // A resource representing a debit order transaction record
        TransactionRecord transactionRecord = objectFactory.createTransactionRecord()
                .setRecurrences("6")
                .setStartDate("2014/07/26")
                .setStatementDescription("Subscription")
                .setManagedBy("MERCHANT")
                .setFrequency("W")
                .setAnonymousUser("true");


        // ###DoTransaction
        // A DoTransaction defines the Request payload of a
        // payment - DoTransaction is created with
        // a `Customer`, `Basket`, `Creditcard` and other types
        DoTransaction doTransaction = objectFactory.createDoTransaction()
                .setTransactionType(TransactionType.DEBIT_ORDER)
                .setAdditionalInformation(additionalInfo)
                .setBasket(basket)
                .setCustomer(customer)
                .setTransactionRecord(transactionRecord);
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

            LOGGER.info("Created debit order with token = " + doTransactionResponseMessage.getRecurringDetails().getRecurringPaymentToken()
                    + " and result code = " + doTransactionResponseMessage.getResultCode());
            ResultPrinter.addResult(req, resp, "Create Debit Order Payment.", Payment.getLastRequest(),
                    PayUResource.getLastResponse(), null);
        } catch (PayUSOAPException ex) {
            ResultPrinter.addResult(req, resp, "Create Debit Order Payment. If Exception, check response for details",
                    PayUResource.getLastRequest(), JSONFormatter.toJSON(doTransactionResponseMessage), ex.getMessage());
        }

        return doTransactionResponseMessage;
    }
}