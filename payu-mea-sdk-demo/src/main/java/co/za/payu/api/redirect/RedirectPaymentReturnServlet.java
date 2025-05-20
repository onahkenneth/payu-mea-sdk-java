package co.za.payu.api.redirect;

import co.za.payu.api.IResponse;
import co.za.payu.api.Redirect;
import co.za.payu.api.Payment;
import co.za.payu.api.redirect.reserve.StandardRedirectServlet;
import co.za.payu.base.exception.PayUSOAPException;
import co.za.payu.base.soap.APIContext;
import co.za.payu.base.soap.JSONFormatter;
import co.za.payu.util.ResultPrinter;
import co.za.payu.util.SampleConstants;
import co.za.payu.ws.*;
import org.apache.log4j.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RedirectPaymentReturnServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final Logger LOGGER = Logger.getLogger(StandardRedirectServlet.class);

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
        handleReturn(req, resp);
        req.getRequestDispatcher("../../response.jsp").forward(req, resp);
    }

    private void handleReturn(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String payuReference = req.getParameter("PayUReference");

        if(payuReference == null || payuReference.equals("")) {
            payuReference = req.getParameter("payUReference");
        }

        if(payuReference != null) {
            String cancel = req.getParameter("cancel");
            String accountPrefix = req.getParameter("accountPrefix");

            APIContext apiContext = new APIContext(SampleConstants.apiUsername, SampleConstants.apiPassword,
                    SampleConstants.safeKey, SampleConstants.mode, accountPrefix);

            AdditionalInfo additionalInfo = objectFactory.createAdditionalInfo()
                    .setPayUReference(payuReference);

            GetTransaction getTransaction = objectFactory.createGetTransaction()
                    .setAdditionalInformation(additionalInfo);

            // ###Redirect
            // A Redirect defines the contract of a
            // payment setup - what is the payment for and who
            // is fulfilling it. Payment is created with
            // a `SetTransaction`. Call the `getPayURedirectUrl` method
            // to get the redirect url.
            Redirect redirect = new Redirect();
            redirect.setRequest(getTransaction);

            GetTransactionResponseMessage getTransactionResponseMessage = null;

            try {

                getTransactionResponseMessage = (GetTransactionResponseMessage) redirect.get(apiContext);

                LOGGER.info("Setup redirect payment with id = " + getTransactionResponseMessage.getPayUReference()
                        + " and result code = " + getTransactionResponseMessage.getResultCode());
                if(cancel != null && cancel.equals("true")) {
                    ResultPrinter.addResult(req, resp, "User Cancelled the Capturing of Payment Details.",
                            JSONFormatter.toJSON(getTransaction), JSONFormatter.toJSON(getTransactionResponseMessage), null);
                    return;
                }

                ResultPrinter.addResult(req, resp, "Redirected from PayU.",
                            JSONFormatter.toJSON(getTransaction), JSONFormatter.toJSON(getTransactionResponseMessage), null);

                if(getTransactionResponseMessage.isSuccessful()
                        && getTransactionResponseMessage.getTransactionType().equals(TransactionType.RESERVE)
                ) {
                    doFinalizeTransaction(req, resp, apiContext, getTransactionResponseMessage);
                }

            } catch (PayUSOAPException ex) {
                ResultPrinter.addResult(req, resp, "PayU Redirect Error. If Exception, check response details",
                        JSONFormatter.toJSON(getTransaction), JSONFormatter.toJSON(getTransactionResponseMessage), ex.getMessage());
            }
        } else {
            PrintWriter out = resp.getWriter();
            resp.setContentType("text/plain");

            out.write("Parameter: PayUReference not found");
            out.close();
        }
    }

    private IResponse doFinalizeTransaction(HttpServletRequest req, HttpServletResponse resp, APIContext apiContext, IResponse response) {

        GetTransactionResponseMessage responseMessage = (GetTransactionResponseMessage) response;

        Basket b = responseMessage.getBasket();

        // ###Basket
        // A resource representing a Basket/Cart belonging to a customer
        Basket basket = objectFactory.createBasket()
                .setDescription(b.getDescription())
                .setCurrencyCode(b.getCurrencyCode())
                .setAmountInCents(b.getAmountInCents());

        // ###AdditionalInfo
        // A resource representing AdditionalInfo about the transaction
        AdditionalInfo additionalInfo = objectFactory.createAdditionalInfo()
                .setPayUReference(responseMessage.getPayUReference())
                .setMerchantReference(responseMessage.getMerchantReference());

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

        // ###SetTransaction
        // A SetTransaction defines the Request payload of a
        // payment redirect - SetTransaction is created with
        // a `Customer`, `Basket`, and other types
        DoTransaction doTransaction = objectFactory.createDoTransaction()
                .setTransactionType(TransactionType.FINALIZE)
                .setAdditionalInformation(additionalInfo)
                .setBasket(basket)
                .setCustomer(customer);

        // ###Redirect
        // A Redirect defines the contract of a
        // payment setup - what is the payment for and who
        // is fulfilling it. Payment is created with
        // a `SetTransaction`. Call the `getPayURedirectUrl` method
        // to get the redirect url.
        Payment payment = new Payment();
        payment.setRequest(doTransaction);

        DoTransactionResponseMessage doTransactionResponseMessage = null;

        try {

            doTransactionResponseMessage = (DoTransactionResponseMessage) payment.create(apiContext);

            LOGGER.info("Do finalize after reserve payment details captured with id = " + doTransactionResponseMessage.getPayUReference()
                    + " and result code = " + doTransactionResponseMessage.getResultCode());

            ResultPrinter.addResult(req, resp, "Do Finalize after Reserve Payment Details Captured",
                    JSONFormatter.toJSON(doTransaction), JSONFormatter.toJSON(doTransactionResponseMessage), null);

        } catch (PayUSOAPException ex) {
            ResultPrinter.addResult(req, resp, "Do Finalize after Reserve Payment Details Captured. If Exception, check response details",
                    JSONFormatter.toJSON(doTransaction), JSONFormatter.toJSON(doTransactionResponseMessage), ex.getMessage());
        }

        return doTransactionResponseMessage;
    }
}
