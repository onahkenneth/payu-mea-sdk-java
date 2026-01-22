package co.za.payu.api.redirect.reserve;

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
public class GetRedirectServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(GetRedirectServlet.class);

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
        getRedirect(req, resp);
        req.getRequestDispatcher("../../response.jsp").forward(req, resp);
    }

    @SuppressWarnings("Duplicates")
    private IResponse getRedirect(HttpServletRequest req, HttpServletResponse resp) {

        String baseUrl = BaseSample.getBaseUrl(req);

        APIContext apiContext = new APIContext(SampleConstants.apiUsername, SampleConstants.apiPassword,
                SampleConstants.safeKey, SampleConstants.mode, SampleConstants.account2);

        SetTransactionResponseMessage createdRedirect = (SetTransactionResponseMessage) setupStandardRedirect(req, resp, apiContext, baseUrl);

        AdditionalInfo additionalInfo = objectFactory.createAdditionalInfo()
                .setPayUReference(createdRedirect.getPayUReference());

        // ###Transaction
        // A transaction defines the contract of a
        // payment - what is the payment for and who
        // is fulfilling it. Transaction is created with
        // a `Customer` and `Creditcard` types
        GetTransaction getTransaction = objectFactory.createGetTransaction()
                .setAdditionalInformation(additionalInfo);

        // ###Payment
        // A Payment Resource
        Redirect redirect= new Redirect();
        redirect.setRequest(getTransaction);

        GetTransactionResponseMessage getTransactionResponseMessage = null;

        try {

            getTransactionResponseMessage = (GetTransactionResponseMessage) redirect.get(apiContext);

            LOGGER.info("Get redirect authorize/reserve details with id = " + getTransactionResponseMessage.getPayUReference()
                    + " and result code = " + getTransactionResponseMessage.getResultCode());
            ResultPrinter.addResult(req, resp, "Get Redirect Authorize/Reserve details", JSONFormatter.toJSON(getTransaction),
                    JSONFormatter.toJSON(getTransactionResponseMessage), null);
        } catch (PayUSOAPException ex) {
            ResultPrinter.addResult(req, resp, "Get Redirect Authorize/Reserve details. If Exception, check response details",
                    JSONFormatter.toJSON(getTransaction), JSONFormatter.toJSON(getTransactionResponseMessage), ex.getMessage());
        }

        return getTransactionResponseMessage;
    }

    @SuppressWarnings("Duplicates")
    private IResponse setupStandardRedirect(HttpServletRequest req, HttpServletResponse resp, APIContext apiContext, String baseUrl) {

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
                .setMerchantUserId("890")
                .setAddress1("3909 Witmer Road")
                .setAddress2("Niagara Falls")
                .setAddressCity("Cape Town")
                .setStateCode("WC")
                .setPostCode("8000")
                .setCountryOfResidence("ZAF");

        // ###AdditionalInfo
        // A resource representing AdditionalInfo about the transaction
        AdditionalInfo additionalInfo = objectFactory.createAdditionalInfo()
                .setNotificationUrl(baseUrl + "reserve/payment/return")
                .setReturnUrl(baseUrl + "reserve/payment/return?accountPrefix="+SampleConstants.account2)
                .setCancelUrl(baseUrl + "reserve/payment/return?accountPrefix="+SampleConstants.account2+"&cancel=true")
                .setMerchantReference(UUID.randomUUID().toString());

        // ###SetTransaction
        // A SetTransaction defines the Request payload of a
        // payment redirect - SetTransaction is created with
        // a `Customer`, `Basket`, and other types
        SetTransaction setTransaction = objectFactory.createSetTransaction()
                .setTransactionType(TransactionType.RESERVE)
                .setAdditionalInformation(additionalInfo)
                .setBasket(basket)
                .setCustomer(customer);

        // ###Redirect
        // A Redirect defines the contract of a
        // payment setup - what is the payment for and who
        // is fulfilling it. Redirect is created with
        // a `SetTransaction`.
        Redirect redirect= new Redirect();
        redirect.setRequest(setTransaction);

        SetTransactionResponseMessage setTransactionResponseMessage = null;

        try {

            setTransactionResponseMessage = (SetTransactionResponseMessage) redirect.setup(apiContext);

            LOGGER.info("Setup redirect payment with id = " + setTransactionResponseMessage.getPayUReference()
                    + " and result code = " + setTransactionResponseMessage.getResultCode());

            req.setAttribute("redirectURL", redirect.getPayURedirectUrl());

            ResultPrinter.addResult(req, resp, "Setup Redirect Payment", JSONFormatter.toJSON(setTransaction),
                    JSONFormatter.toJSON(setTransactionResponseMessage), null);
        } catch (PayUSOAPException ex) {
            ResultPrinter.addResult(req, resp, "Setup Redirect Payment. If Exception, check response details",
                    JSONFormatter.toJSON(setTransaction), JSONFormatter.toJSON(setTransactionResponseMessage), ex.getMessage());
        }

        return setTransactionResponseMessage;
    }
}