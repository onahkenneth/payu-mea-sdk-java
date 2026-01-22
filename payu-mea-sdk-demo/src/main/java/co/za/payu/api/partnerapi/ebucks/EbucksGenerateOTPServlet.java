package co.za.payu.api.partnerapi.ebucks;

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
public class EbucksGenerateOTPServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(EbucksGenerateOTPServlet.class);

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
        ebucksPayment(req, resp);
        req.getRequestDispatcher("../../response.jsp").forward(req, resp);
    }

    @SuppressWarnings("Duplicates")
    private IResponse ebucksPayment(HttpServletRequest req, HttpServletResponse resp) {

        String baseUrl = BaseSample.getBaseUrl(req);

        APIContext apiContext = new APIContext(SampleConstants.apiUsername, SampleConstants.apiPassword,
                SampleConstants.safeKey, SampleConstants.mode, SampleConstants.account2);

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
                .setMerchantUserId("890");

        // ###AdditionalInfo
        // A resource representing AdditionalInfo about the transaction
        AdditionalInfo additionalInfo = objectFactory.createAdditionalInfo()
                .setNotificationUrl(baseUrl + "reserve/payment/return")
                .setReturnUrl(baseUrl + "reserve/payment/return?accountPrefix="+SampleConstants.account2)
                .setCancelUrl(baseUrl + "reserve/payment/return?accountPrefix="+SampleConstants.account2+"&cancel=true")
                .setMerchantReference(UUID.randomUUID().toString());

        // ###CustomField
        // A resource representing CustomField consisting of key-value pair
        CustomField customField1 = objectFactory.createCustomField()
                .setKey("action")
                .setValue("GENERATE_OTP");
        CustomField customField2 = objectFactory.createCustomField()
                .setKey("generateOTPType")
                .setValue("EBUCKS");
        CustomField customField3 = objectFactory.createCustomField()
                .setKey("payUReference")
                .setValue("31305412143");
        CustomField customField4 = objectFactory.createCustomField()
                .setKey("ebucksAmount")
                .setValue("10000");
        CustomField customField5 = objectFactory.createCustomField()
                .setKey("amountInCents")
                .setValue("10000");

        // ###SetTransaction
        // A SetTransaction defines the Request payload of a
        // payment redirect - SetTransaction is created with
        // a `Customer`, `Basket`, and other types
        SetTransaction setTransaction = objectFactory.createSetTransaction()
                .setTransactionType(TransactionType.PAYMENT)
                .setAdditionalInformation(additionalInfo)
                .setBasket(basket)
                .setCustomer(customer);
        setTransaction.getCustomfield().add(customField1);
        setTransaction.getCustomfield().add(customField2);
        setTransaction.getCustomfield().add(customField3);
        setTransaction.getCustomfield().add(customField4);
        setTransaction.getCustomfield().add(customField5);

        // ###Redirect
        // A Redirect defines the contract of a
        // payment setup - what is the payment for and who
        // is fulfilling it. Payment is created with
        // a `SetTransaction`.
        Redirect redirect= new Redirect();
        redirect.setRequest(setTransaction);

        SetTransactionResponseMessage setTransactionResponseMessage = null;

        try {

            setTransactionResponseMessage = (SetTransactionResponseMessage) redirect.setup(apiContext);

            LOGGER.info("eBucks generate OTP with id = " + setTransactionResponseMessage.getPayUReference()
                    + " and result code = " + setTransactionResponseMessage.getResultCode());

            req.setAttribute("redirectURL", redirect.getPayURedirectUrl());

            ResultPrinter.addResult(req, resp, "eBucks Generate OTP",
                    Redirect.getLastRequest(),
                    Redirect.getLastResponse(), null);
        } catch (PayUSOAPException ex) {
            ResultPrinter.addResult(req, resp, "eBucks Generate OTP",
                    JSONFormatter.toJSON(setTransaction),
                    JSONFormatter.toJSON(setTransactionResponseMessage), ex.getMessage());
        }

        return setTransactionResponseMessage;
    }
}