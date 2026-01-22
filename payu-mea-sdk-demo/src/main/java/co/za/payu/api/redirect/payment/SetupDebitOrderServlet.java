package co.za.payu.api.redirect.payment;

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
import co.za.payu.api.Redirect;
import co.za.payu.util.ResultPrinter;
import org.apache.log4j.Logger;

/**
 * Created by kenny on 4/20/17.
 */
public class SetupDebitOrderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(SetupDebitOrderServlet.class);

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
        setupDebitOrder(req, resp);
        req.getRequestDispatcher("../../response.jsp").forward(req, resp);
    }

    @SuppressWarnings("Duplicates")
    private IResponse setupDebitOrder(HttpServletRequest req, HttpServletResponse resp) {

        String baseUrl = BaseSample.getBaseUrl(req);

        APIContext apiContext = new APIContext(SampleConstants.apiUsername, SampleConstants.apiPassword,
                SampleConstants.safeKey, SampleConstants.mode, SampleConstants.account4);

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
        // A resource representing AdditionalInfo about the transaction
        AdditionalInfo additionalInfo = objectFactory.createAdditionalInfo()
                .setNotificationUrl(baseUrl + "reserve/payment/return")
                .setReturnUrl(baseUrl + "reserve/payment/return?accountPrefix="+SampleConstants.account4)
                .setCancelUrl(baseUrl + "reserve/payment/return?accountPrefix="+SampleConstants.account4+"&cancel=true")
                .setMerchantReference(UUID.randomUUID().toString());

        // ###TransactionRecord
        // A resource representing a transaction record information
        TransactionRecord transactionRecord = objectFactory.createTransactionRecord()
                .setRecurrences("6")
                .setStartDate("2014/07/26")
                .setStatementDescription("Subscription")
                .setManagedBy("PAYU")
                .setFrequency("W");

        // ###SetTransaction
        // A SetTransaction defines the Request payload of a
        // payment redirect - SetTransaction is created with
        // a `Customer`, `Basket`, and other types
        SetTransaction setTransaction = objectFactory.createSetTransaction()
                .setTransactionType(TransactionType.DEBIT_ORDER)
                .setAdditionalInformation(additionalInfo)
                .setBasket(basket)
                .setCustomer(customer)
                .setTransactionRecord(transactionRecord);

        // ###Redirect
        // A Redirect defines the contract of a
        // payment setup - what is the payment for and who
        // is fulfilling it. Redirect is created with
        // a `SetTransaction`. Call the `getPayURedirectUrl` method
        // to get the redirect url.
        Redirect redirect = new Redirect();
        redirect.setRequest(setTransaction);

        SetTransactionResponseMessage setTransactionResponseMessage = null;

        try {

            setTransactionResponseMessage = (SetTransactionResponseMessage) redirect.setup(apiContext);

            LOGGER.info("Setup debit order with id = " + setTransactionResponseMessage.getPayUReference()
                    + " and result code = " + setTransactionResponseMessage.getResultCode());

            req.setAttribute("redirectURL", redirect.getPayURedirectUrl());

            ResultPrinter.addResult(req, resp, "Setup Debit Order.",
                    Redirect.getLastRequest(), Redirect.getLastResponse(), null);
        } catch (PayUSOAPException ex) {
            ResultPrinter.addResult(req, resp, "Setup Debit Order. If Exception, check response details",
                    JSONFormatter.toJSON(setTransaction), JSONFormatter.toJSON(setTransactionResponseMessage), ex.getMessage());
        }

        return setTransactionResponseMessage;
    }
}