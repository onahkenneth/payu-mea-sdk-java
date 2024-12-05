package co.za.payu.base.soap;

import co.za.payu.api.IRequest;
import co.za.payu.api.IResponse;
import co.za.payu.base.*;
import co.za.payu.base.exception.PayUSOAPException;
import co.za.payu.base.sdk.info.SDKVersionImpl;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * PayUResource acts as a base class for SOAP enabled resources.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class PayUResource extends PayUModel {

    private static final Logger log = LoggerFactory.getLogger(PayUResource.class);
    /**
     * Last request sent to Service
     */
    private static final ThreadLocal<String> LASTREQUEST = new ThreadLocal<>();

    /**
     * Last response returned form Service
     */
    private static final ThreadLocal<String> LASTRESPONSE = new ThreadLocal<>();
    /**
     * Map used in dynamic configuration
     */
    private static Map<String, String> configurationMap;
    /**
     * APIContext instance
     */
    protected APIContext apiContext;
    /**
     * DoTransaction request payload
     */
    private IRequest iRequest;

    /**
     * Return Username from configuration Map
     */
    public static String getUsername() {
        return configurationMap.get(Constants.API_USERNAME);
    }

    /**
     * Returns Password from configuration Map
     */
    public static String getPassword() {
        return configurationMap.get(Constants.API_PASSWORD);
    }

    /**
     * Returns Safekey from configuration Map
     */
    public static String getSafekey() {
        return configurationMap.get(Constants.API_SAFEKEY);
    }

    /**
     * Initialize to default properties
     */
    public static void initializeToDefault() {
        configurationMap = SDKUtil.combineDefaultMap(ConfigManager
                .getInstance().getConfigurationMap());
    }

    /**
     * Returns the last request sent to the Service
     *
     * @return Last request sent to the server
     */
    public static String getLastRequest() {
        return LASTREQUEST.get();
    }

    /**
     * Returns the last response returned by the Service
     *
     * @return Last response got from the Service
     */
    public static String getLastResponse() {
        return LASTRESPONSE.get();
    }

    /**
     * Configures and executes REST call: Supports JSON
     *
     * @param apiContext {@link APIContext} to be used for the call.
     * @param payload    {@link PayUModel} to be used as request payload for the call.
     * @param soapAction SOAP action to call
     * @return IResponse
     */
    public static IResponse configureAndExecute(APIContext apiContext, IRequest payload, String soapAction)
            throws PayUSOAPException {
        String requestId;
        IResponse response = null;
        Map<String, String> cMap;
        Map<String, String> headersMap;

        if (apiContext != null) {
            if (apiContext.getSdkVersion() == null) {
                apiContext.setSdkVersion(new SDKVersionImpl());
            }

            if (apiContext.getConfigurationMap() != null) {
                cMap = SDKUtil.combineDefaultMap(apiContext.getConfigurationMap());
            } else {
                boolean configInitialized = false;
                if (!configInitialized) {
                    initializeToDefault();
                }

                /*
                 * The Map returned here is already combined with default values
                 */
                cMap = new HashMap<>(configurationMap);
            }
            headersMap = apiContext.getHTTPHeaders();
            requestId = apiContext.getRequestId();

            APICallPreHandler apiCallPreHandler = createAPICallPreHandler(cMap,
                    soapAction, headersMap, requestId, payload, apiContext.getAccountPrefix(), apiContext.getSdkVersion());

            response = execute(apiCallPreHandler);
        }

        return response;
    }

    /**
     * Returns an implementation of {@link APICallPreHandler} for the underlying
     * layer.
     *
     * @param configurationMap configuration Map
     * @param headersMap       Custom HTTP headers map
     * @param requestId        PayU Request Id
     * @param request          request payload
     * @param sdkVersion       {@link SDKVersion} instance
     * @return APICallPreHandler
     */
    public static APICallPreHandler createAPICallPreHandler(
            Map<String, String> configurationMap,
            String soapAction, Map<String, String> headersMap,
            String requestId, IRequest request, String accountPrefix,
            SDKVersion sdkVersion
    ) {
        APICallPreHandler apiCallPreHandler;
        SOAPAPICallPreHandler soapAPICallPreHandler = new SOAPAPICallPreHandler(configurationMap, headersMap);
        soapAPICallPreHandler.setAccountPrefix(accountPrefix)
                .setSoapAction(soapAction)
                .setRequestId(requestId)
                .setRequestPayload(request)
                .setSdkVersion(sdkVersion)
                .addAPIParameters();

        String paymentMethods = request.getSupportedPaymentMethods();
        if (paymentMethods == null || paymentMethods.isEmpty()) {
            soapAPICallPreHandler.addSupportedPaymentMethods();
        }

        apiCallPreHandler = soapAPICallPreHandler;

        return apiCallPreHandler;
    }

    /**
     * Execute the API call and return response
     *
     * @param apiCallPreHandler Implementation of {@link APICallPreHandler}
     * @return Response Type
     */
    private static IResponse execute(APICallPreHandler apiCallPreHandler) throws PayUSOAPException {
        Connection connection;
        String responseString;
        IResponse response;

        Map<String, String> headers;

        ConnectionManager connectionManager;

        try {

            // Headers
            headers = apiCallPreHandler.getHeaderMap();

            // HttpConnection Initialization
            connectionManager = ConnectionManager.getInstance();
            connection = connectionManager.getConnection();

            // capture request and log if conditions are met
            LASTREQUEST.set(JSONFormatter.toJSON(apiCallPreHandler.getRequestPayload()));
            String mode = "";

            if (configurationMap != null) {
                mode = configurationMap.get(Constants.MODE);
            } else if (apiCallPreHandler.getConfigurationMap() != null) {
                mode = apiCallPreHandler.getConfigurationMap().get(Constants.MODE);
            }

            if (Constants.LIVE.equalsIgnoreCase(mode) && log.isDebugEnabled()) {
                log.warn("Log level cannot be set to DEBUG in " + Constants.LIVE + " mode. Skipping request/response logging...");
            }

            if (!Constants.LIVE.equalsIgnoreCase(mode)) {
                log.debug("request header: {}", headers.toString());
                log.debug("request body: {}", LASTREQUEST.get());
            }

            // send request and receive response
            response = connection.execute(apiCallPreHandler);

            responseString = JSONFormatter.toJSON(response);

            // capture response and log if conditions are met
            LASTRESPONSE.set(responseString);
            if (!Constants.LIVE.equalsIgnoreCase(mode)) {
                log.debug("response: {}", LASTRESPONSE.get());
            }

        } catch (Exception e) {
            throw new PayUSOAPException(e.getMessage(), e);
        }

        return response;
    }

    /**
     * Returns request payload for doTransaction SOAP call
     */
    public IRequest getRequest() {
        return this.iRequest;
    }

    /**
     * Sets request payload for doTransaction SOAP call
     */
    public void setRequest(IRequest iRequest) {
        this.iRequest = iRequest;
    }

    /**
     * Gets the details of a transaction. Merchant reference or PayU reference
     * must be provided but not both. Providing both references will cause the
     * request to fail.
     *
     * @param apiContext {@link APIContext } used for the API call.
     * @return IResponse
     * @throws PayUSOAPException an exception in PayU Webservice
     */
    public IResponse get(APIContext apiContext) throws PayUSOAPException {
        String soapAction = "getTransaction";
        this.apiContext = apiContext;

        IResponse response = configureAndExecute(apiContext, this.getRequest(), soapAction);

        apiContext.setRequestId(null);

        return response;
    }

    /**
     * Creates and processes a payment. In the JSON request body, include a `payment` object with the intent, customer,
     * and transactions. Also include a notification URL in the `payment` object.
     *
     * @param apiContext {@link APIContext } used for the API call.
     * @return IResponse
     * @throws PayUSOAPException an exception in PayU Webservice
     */
    public IResponse create(APIContext apiContext) throws PayUSOAPException {
        String soapAction = "doTransaction";
        this.apiContext = apiContext;

        IResponse response = configureAndExecute(apiContext, this.getRequest(), soapAction);

        apiContext.setRequestId(null);

        return response;
    }

    /**
     * Setups a redirect payment before redirecting to PayU. In the JSON request body, include a `payment` object with
     * the intent, customer, and transactions. Also include return and cancel URLs in the `payment` object.
     *
     * @param apiContext {@link APIContext } used for the API call.
     * @return IResponse
     * @throws PayUSOAPException an exception in PayU Webservice
     */
    public IResponse setup(APIContext apiContext) throws PayUSOAPException {
        String soapAction = "setTransaction";
        this.apiContext = apiContext;

        IResponse response = configureAndExecute(apiContext, this.getRequest(), soapAction);

        apiContext.setRequestId(null);

        return response;
    }

    /**
     * Creates and processes a finalized payment. In the JSON request body, include a `payment` object with the intent, customer,
     * and transactions. For PayU payments, include redirect URLs in the `payment` object.
     *
     * @param apiContext {@link APIContext } used for the API call.
     * @return IResponse
     * @throws PayUSOAPException an exception in PayU Webservice
     */
    public IResponse capture(APIContext apiContext) throws PayUSOAPException {

        return this.create(apiContext);
    }

    /**
     * Refunds a captured/finalized payment. The request must include a PayU reference and merchant reference.
     * For PayU payments, include redirect URLs in the `payment` object.
     *
     * @param apiContext {@link APIContext } used for the API call.
     * @return IResponse
     * @throws PayUSOAPException an exception in PayU Webservice
     */
    public IResponse refund(APIContext apiContext) throws PayUSOAPException {

        return this.create(apiContext);
    }

    /**
     * Voids an authorize/reserve payment. The request must include a PayU reference.
     * For PayU payments, include redirect URLs in the `payment` object.
     *
     * @param apiContext {@link APIContext } used for the API call.
     * @return IResponse
     * @throws PayUSOAPException an exception in PayU Webservice
     */
    public IResponse voidTransaction(APIContext apiContext) throws PayUSOAPException {

        return this.create(apiContext);
    }

    /**
     * The lookup transaction method is used to lookup various details regarding users, transactions and services.
     * The core parameters identify the merchant, the lookup type and additional custom fields.
     *
     * @param apiContext {@link APIContext } used for the API call.
     * @return IResponse
     * @throws PayUSOAPException an exception in PayU Webservice
     */
    public IResponse lookup(APIContext apiContext) throws PayUSOAPException {

        String soapAction = "getLookupTransaction";
        this.apiContext = apiContext;

        IResponse response = configureAndExecute(apiContext, this.getRequest(), soapAction);

        apiContext.setRequestId(null);

        return response;
    }
}
