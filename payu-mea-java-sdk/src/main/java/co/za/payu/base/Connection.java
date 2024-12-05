package co.za.payu.base;

import co.za.payu.api.IRequest;
import co.za.payu.api.IResponse;
import co.za.payu.base.exception.ActionRequiredException;
import co.za.payu.base.exception.HttpErrorException;
import co.za.payu.base.exception.InvalidResponseDataException;
import co.za.payu.base.exception.SSLConfigurationException;
import co.za.payu.ws.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.handler.Handler;
import jakarta.xml.ws.handler.HandlerResolver;
import jakarta.xml.ws.handler.PortInfo;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.*;
import java.util.ArrayList;

/**
 * Base HttpConnection class
 *
 */
public abstract class Connection {
    private static final Logger log = LoggerFactory.getLogger(Connection.class);

    /**
     * Subclasses must set the http configuration in the
     * createAndconfigureHttpConnection() method.
     */
    protected ConnectionConfiguration config;

    /**
     * Subclasses must create and set the connection in the
     * createAndconfigureHttpConnection() method.
     */
    protected HttpURLConnection connection;

    public Connection() {

    }

    public Map<String, List<String>> getResponseHeaderMap() {
        return connection.getHeaderFields();
    }

    /**
     * Executes HTTP request
     *
     * @param handler
     * @return Response IResponse
     */
    public IResponse execute(final APICallPreHandler handler) throws IOException {
        URL wsdlUrl;
        IResponse response = null;
        String endPoint = handler.getServiceEndPoint();

        try {
            wsdlUrl = new URL(endPoint);
        } catch (MalformedURLException ex) {
            throw new WebServiceException(ex);
        }

        EnterpriseAPISoapService enterpriseAPISoapService = new EnterpriseAPISoapService(wsdlUrl);
        enterpriseAPISoapService.setHandlerResolver(new HandlerResolver() {
            @Override
            public List<Handler> getHandlerChain(PortInfo portInfo) {
                List<Handler> handlerList = new ArrayList<Handler>();
                handlerList.add(handler);

                return handlerList;
            }
        });

        IRequest request = handler.getRequestPayload();
        String soapAction = handler.getSoapAction();
        EnterpriseAPISoap enterpriseAPISoap = enterpriseAPISoapService.getEnterpriseAPISoapPort();

        if(soapAction.equals("doTransaction")) {
            response = doTransactionSOAPCall(enterpriseAPISoap, request);
        } else if(soapAction.equals("managePaymentMethod")) {
            response = managePaymentMethodSOAPCall(enterpriseAPISoap, request);
        } else if(soapAction.equals("getTransaction")) {
            response = getTransactionSOAPCAll(enterpriseAPISoap, request);
        } else if(soapAction.equals("doDeleteTransaction")) {
            response = doDeleteTransactionSOAPCall(enterpriseAPISoap, request);
        } else if(soapAction.equals("setTransaction")) {
            response = setTransactionSOAPCall(enterpriseAPISoap, request);
        } else if(soapAction.equals("getLookupTransaction")) {
            response = getLookupTransactionSOAPCall(enterpriseAPISoap, request);
        }

        return response;
    }

    /**
     * Executes doTransaction SOAP action
     *
     * @param enterpriseAPISoap SOAP web service
     * @param iRequest Request payload
     * @return IResponse transaction response
     */
    private IResponse doTransactionSOAPCall(EnterpriseAPISoap enterpriseAPISoap, IRequest iRequest) {
        DoTransaction doTransaction = (DoTransaction) iRequest;
        return enterpriseAPISoap.doTransaction(
                doTransaction.getApi(),
                doTransaction.getSafekey(),
                doTransaction.getTransactionType(),
                doTransaction.getAuthenticationType(),
                doTransaction.getAdditionalInformation(),
                doTransaction.getCustomer(),
                doTransaction.getBasket(),
                doTransaction.getFraud(),
                doTransaction.getCreditcard(),
                doTransaction.getEft(),
                doTransaction.getDiscoveryMiles(),
                doTransaction.getPayPal(),
                doTransaction.getDebitcard(),
                doTransaction.getLoyalty(),
                doTransaction.getBankTransfer(),
                doTransaction.getWallet(),
                doTransaction.getThirdParty(),
                doTransaction.getEbucks(),
                doTransaction.getAutopay(),
                doTransaction.getSoulstace(),
                doTransaction.getGlobalpay(),
                doTransaction.getCustomfield(),
                doTransaction.getCredit(),
                doTransaction.getTransactionRecord(),
                doTransaction.getSbux(),
                doTransaction.getRCS(),
                doTransaction.getBankAccount(),
                doTransaction.getEWallet(),
                doTransaction.getMobicred(),
                doTransaction.getEWalletMpesa(),
                doTransaction.getEftBankTransfer()
        );
    }

    /**
     * Executes managePaymentMethod SOAP action
     *
     * @param enterpriseAPISoap SOAP web service
     * @param iRequest Request payload
     * @return IResponse transaction response
     */
    private IResponse managePaymentMethodSOAPCall(EnterpriseAPISoap enterpriseAPISoap, IRequest iRequest) {
        ManagePaymentMethod managePaymentMethod = (ManagePaymentMethod) iRequest;
        return enterpriseAPISoap.managePaymentMethod(
                managePaymentMethod.getApi(),
                managePaymentMethod.getSafekey(),
                managePaymentMethod.getManagePaymentMethodType(),
                managePaymentMethod.getAdditionalInformation(),
                managePaymentMethod.getCustomer(),
                managePaymentMethod.getCustomfield()
        );
    }

    /**
     * Executes getTransaction SOAP action
     *
     * @param enterpriseAPISoap SOAP web service
     * @param iRequest Request payload
     * @return IResponse transaction response
     */
    private IResponse getTransactionSOAPCAll(EnterpriseAPISoap enterpriseAPISoap, IRequest iRequest) {
        GetTransaction getTransaction = (GetTransaction) iRequest;
        return enterpriseAPISoap.getTransaction(
                getTransaction.getApi(),
                getTransaction.getSafekey(),
                getTransaction.getAdditionalInformation()
        );
    }

    /**
     * Executes doDeleteTransaction SOAP action
     *
     * @param enterpriseAPISoap SOAP web service
     * @param iRequest Request payload
     * @return IResponse transaction response
     */
    private IResponse doDeleteTransactionSOAPCall(EnterpriseAPISoap enterpriseAPISoap, IRequest iRequest) {
        DoDeleteTransaction doDeleteTransaction = (DoDeleteTransaction) iRequest;
        return enterpriseAPISoap.doDeleteTransaction(
                doDeleteTransaction.getApi(),
                doDeleteTransaction.getSafekey(),
                doDeleteTransaction.getDeleteTransactionType(),
                doDeleteTransaction.getCustomfield()
        );
    }

    /**
     * Executes setTransaction SOAP action
     *
     * @param enterpriseAPISoap SOAP web service
     * @param iRequest Request payload
     * @return IResponse transaction response
     */
    private IResponse setTransactionSOAPCall(EnterpriseAPISoap enterpriseAPISoap, IRequest iRequest) {
        SetTransaction setTransaction = (SetTransaction) iRequest;
        return enterpriseAPISoap.setTransaction(
                setTransaction.getApi(),
                setTransaction.getSafekey(),
                setTransaction.getTransactionType(),
                setTransaction.isStage(),
                setTransaction.getAdditionalInformation(),
                setTransaction.getCustomer(),
                setTransaction.getBasket(),
                setTransaction.getFraud(),
                setTransaction.getCreditcard(),
                setTransaction.getEft(),
                setTransaction.getLoyalty(),
                setTransaction.getBankTransfer(),
                setTransaction.getEbucks(),
                setTransaction.getAutopay(),
                setTransaction.getSoulstace(),
                setTransaction.getGlobalpay(),
                setTransaction.getCustomfield(),
                setTransaction.getTransactionRecord(),
                setTransaction.getEWallet(),
                setTransaction.getMobicred()
        );
    }

    /**
     * Executes getLookupTransaction SOAP action
     *
     * @param enterpriseAPISoap SOAP web service
     * @param iRequest Request payload
     * @return IResponse transaction response
     */
    private IResponse getLookupTransactionSOAPCall(EnterpriseAPISoap enterpriseAPISoap, IRequest iRequest) {
        GetLookupTransaction getLookupTransaction = (GetLookupTransaction) iRequest;
        return enterpriseAPISoap.getLookupTransaction(
                getLookupTransaction.getApi(),
                getLookupTransaction.getSafekey(),
                getLookupTransaction.getLookupTransactionType(),
                getLookupTransaction.getCustomfield()
        );
    }

    /**
     * Executes HTTP request
     *
     * @param url URL for the connection
     * @param payload Request payload
     * @param headers Headers map
     * @return String response
     * @throws InvalidResponseDataException
     * @throws IOException
     * @throws InterruptedException
     * @throws HttpErrorException
     * @throws ActionRequiredException
     */
    public InputStream executeWithStream(String url, String payload,
                                         Map<String, String> headers) throws InvalidResponseDataException,
            IOException, InterruptedException, HttpErrorException {
        InputStream successResponse = null;
        String errorResponse = null;
        int responseCode = -1;
        BufferedReader reader = null;
        OutputStreamWriter writer = null;
        connection.setRequestProperty("Content-Length", String.valueOf(payload.trim().length()));
        try {
            setHttpHeaders(headers);
            String mode = ConfigManager.getInstance().getConfigurationMap()
                    .get(Constants.MODE);
            // Print if on live
            if (!Constants.LIVE.equalsIgnoreCase(mode)) {
                logCurlRequest(payload, headers);
            }

            // This exception is used to make final log more explicit
            Exception lastException = null;
            int retry = 0;
            retryLoop: do {
                try {
                    if (Arrays.asList("POST", "PUT", "PATCH").contains(connection.getRequestMethod().toUpperCase())) {
                        writer = new OutputStreamWriter(
                                this.connection.getOutputStream(),
                                Charset.forName(Constants.ENCODING_FORMAT));
                        writer.write(payload);
                        writer.flush();
                    }

                    responseCode = connection.getResponseCode();

                    // SUCCESS
                    if (responseCode >= 200 && responseCode < 300) {

                        try {
                            successResponse = connection.getInputStream();
                        } catch (IOException e) {
                            successResponse = connection.getErrorStream();
                        }
                        break retryLoop;
                    }

                    // FAILURE
                    reader = new BufferedReader(new InputStreamReader(
                            connection.getInputStream(),
                            Constants.ENCODING_FORMAT));
                    errorResponse = read(reader);
                    String msg = "Response code: " + responseCode + "\tError response: " + errorResponse;

                    if (responseCode >= 300 && responseCode < 500) {
                        // CLIENT SIDE EXCEPTION
                        throw new ActionRequiredException(responseCode, errorResponse, msg, new IOException(msg));
                    } else if (responseCode >= 500) {
                        // SERVER SIDE EXCEPTION
                        throw new HttpErrorException(responseCode, errorResponse, msg, new IOException(msg));
                    }
                } catch (IOException e) {
                    lastException = e;
                    try {
                        responseCode = connection.getResponseCode();
                        if (connection.getErrorStream() != null) {
                            reader = new BufferedReader(new InputStreamReader(
                                    connection.getErrorStream(),
                                    Constants.ENCODING_FORMAT));
                            errorResponse = read(reader);
                            log.error("Response code: " + responseCode
                                    + "\tError response: " + errorResponse);
                        }
                        if ((errorResponse == null)
                                || (errorResponse.length() == 0)) {
                            errorResponse = e.getMessage();
                        }
                        if (responseCode <= 500) {
                            String msg = "Response code: " + responseCode + "\tError response: " + errorResponse;
                            throw new HttpErrorException(responseCode,
                                    errorResponse, msg, e);
                        }
                    } catch (HttpErrorException ex) {
                        throw ex;
                    } catch (Exception ex) {
                        lastException = ex;
                        log.error(
                                "Caught exception while handling error response",
                                ex);
                    }
                }
                // RETRY LOGIC
                retry++;
                if (retry > 0) {
                    log.error(" Retry  No : " + retry + "...");
                    Thread.sleep(this.config.getRetryDelay());
                }
            } while (retry < this.config.getMaxRetry());

            if (successResponse == null
                    || (successResponse.available() <= 0 && !(responseCode >= 200 && responseCode < 300))) {
                throw new HttpErrorException(
                        "retry fails..  check log for more information",
                        lastException);
            }
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } finally {
                reader = null;
                writer = null;
            }
        }
        return successResponse;
    }

    /**
     * Logs the curl format based request, which could be helpful for debugging purposes.
     *
     * @param payload Payload Data
     * @param headers Headers Map
     */
    private void logCurlRequest(String payload, Map<String, String> headers) {
        String cmd = "SOAP command: \n";
        cmd += "curl -v '" + connection.getURL().toString() + "' \\\n";
        if (headers != null) {
            for (String key : headers.keySet()) {
                String value = headers.get(key);
                cmd += "-H \"" + key + ": " + value + "\" \\\n";
            }
        }
        cmd += "-d '" + payload + "'";
        log.debug(cmd);
    }

    /**
     * Set ssl parameters for client authentication
     *
     * @param certPath
     * @param certKey
     * @throws SSLConfigurationException
     */
    public abstract void setupClientSSL(String certPath, String certKey) throws SSLConfigurationException;

    /**
     * create and configure HttpsURLConnection object
     *
     * @param clientConfiguration
     * @throws IOException
     */
    public abstract void createAndconfigureConnection(ConnectionConfiguration clientConfiguration) throws IOException;

    protected String read(BufferedReader reader) throws IOException {
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = reader.readLine()) != null) {
            response.append(inputLine);
        }
        return response.toString();
    }

    /**
     * Set headers for HttpsURLConnection object
     *
     * @param headers
     */
    protected void setHttpHeaders(Map<String, String> headers) {
        if (headers != null && !headers.isEmpty()) {
            Iterator<Map.Entry<String, String>> itr = headers.entrySet().iterator();
            while (itr.hasNext()) {
                Map.Entry<String, String> pairs = itr.next();
                String key = pairs.getKey();
                String value = pairs.getValue();
                this.connection.setRequestProperty(key, value);
            }
        }
    }
}
