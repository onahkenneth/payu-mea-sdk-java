package co.za.payu.api.partnerapi.eft;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import co.za.payu.api.IResponse;
import co.za.payu.api.SmartEFT;
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
public class SmartEFTPaymentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(SmartEFTPaymentServlet.class);

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
        smartEFTPayment(req, resp);
        req.getRequestDispatcher("../../response.jsp").forward(req, resp);
    }

    @SuppressWarnings("Duplicates")
    private IResponse smartEFTPayment(HttpServletRequest req, HttpServletResponse resp) {

        String baseUrl = BaseSample.getBaseUrl(req);

        List<String> banks = new ArrayList<String>();
        banks.add(SmartEFT.ABSA);
        banks.add(SmartEFT.FNB);
        banks.add(SmartEFT.NEDBANK);
        banks.add(SmartEFT.STANDARD_BANK);
        Collections.shuffle(banks);

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
                .setMerchantReference(UUID.randomUUID().toString());

        Collections.shuffle(banks);

        // ###Eft
        // A resource representing EFT bank transfer information
        Eft eft = objectFactory.createEft();
        eft.setBankName(banks.get(0));
        eft.setAmountInCents("10000");

        // ###DoTransaction
        // A DoTransaction defines the Request payload of a
        // payment - DoTransaction is created with
        // a `Customer`, `Basket`, `Creditcard` and other types
        DoTransaction doTransaction = objectFactory.createDoTransaction()
                .setTransactionType(TransactionType.PAYMENT)
                .setAdditionalInformation(additionalInfo)
                .setBasket(basket)
                .setCustomer(customer);
        doTransaction.getEft().add(eft);

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

            LOGGER.info("Create payment using smart EFT with id = " + doTransactionResponseMessage.getPayUReference()
                    + " and result code = " + doTransactionResponseMessage.getResultCode());

            ResultPrinter.addResult(req, resp, "Create Payment Using Smart EFT", Payment.getLastRequest(),
                    Payment.getLastResponse(), null);
        } catch (PayUSOAPException ex) {
            ResultPrinter.addResult(req, resp, "Create Payment Using Smart EFT", JSONFormatter.toJSON(doTransaction),
                    JSONFormatter.toJSON(doTransactionResponseMessage), ex.getMessage());
        }

        return doTransactionResponseMessage;
    }
}