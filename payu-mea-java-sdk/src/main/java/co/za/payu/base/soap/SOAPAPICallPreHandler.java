package co.za.payu.base.soap;

import co.za.payu.api.IRequest;
import co.za.payu.base.APICallPreHandler;
import co.za.payu.base.Constants;
import co.za.payu.base.SDKUtil;
import co.za.payu.base.SDKVersion;
import co.za.payu.base.codec.binary.Base64;
import co.za.payu.base.exception.ActionRequiredException;
import co.za.payu.base.util.UserAgentHeader;

import co.za.payu.ws.*;

import javax.xml.namespace.QName;

import jakarta.xml.soap.*;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * SOAPAPICallPreHandler acts as a {@link APICallPreHandler} for SOAP API calls.
 * The implementation is PayU specific, To do custom implementation override
 * the protected methods.
 * SOAPAPICallPreHandler requires a configuration system to function
 * properly. The configuration is initialized to default in PayUResource
 * class if no configuration methods initConfig(...) was attempted before
 * making the API call. The users can override this default file
 * 'sdk_config.properties' by choosing different version of
 * initConfig(...) and passing their custom configuration.
 * Initializing to default means the system looks for a file specifically
 * named 'sdk_config.properties' in the classpath and reads the
 * configuration from there. 'Dynamic Configuration' enables the users to
 * pass custom configuration (per call basis) as a Map object to override
 * the default behavior for the system to function. For Dynamic
 * configuration to take effect create a Map of custom configuration and set
 * it in APIContext object, choose the overloaded method of the Resource
 * class that takes APIContext object as a parameter and pass the APIContext
 * object.
 */
public class SOAPAPICallPreHandler implements APICallPreHandler {
    /**
     * Configuration Map used for dynamic configuration
     */
    private final Map<String, String> configurationMap;

    /**
     * Base URL for the service
     */
    private URL url;

    /**
     * Resource URI as defined in the WSDL
     */
    private String resourcePath;

    /**
     * SOAP action to call
     */
    private String soapAction;

    /**
     * Request Id
     */
    private String requestId;

    /**
     * Account prefix
     */
    private String accountPrefix;

    /**
     * Custom headers Map
     */
    private Map<String, String> headersMap;

    /**
     * Request object
     */
    private IRequest request;

    /**
     * {@link SDKVersion} instance
     */
    private SDKVersion sdkVersion;

    /**
     * Constructor using configurations dynamically
     *
     * @param configurationMap Map used for dynamic configuration
     */
    public SOAPAPICallPreHandler(Map<String, String> configurationMap) {
        this.configurationMap = SDKUtil.combineDefaultMap(configurationMap);
    }

    /**
     * Constructor using a Map of headers for forming custom headers
     *
     * @param configurationMap Map used for dynamic configuration
     * @param headersMap       Headers Map
     */
    public SOAPAPICallPreHandler(Map<String, String> configurationMap, Map<String, String> headersMap) {
        this(configurationMap);
        this.headersMap = (headersMap == null) ? Collections.emptyMap() : headersMap;
    }

    /**
     * @param resourcePath the resourcePath to set
     * @return SOAPAPICallPreHandler
     */
    public SOAPAPICallPreHandler setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;

        return this;
    }

    /**
     * @param soapAction the SOAP action to call
     * @return SOAPAPICallPreHandler
     */
    public SOAPAPICallPreHandler setSoapAction(String soapAction) {
        this.soapAction = soapAction;

        return this;
    }

    /**
     * @param requestId the requestId to set
     * @return SOAPAPICallPreHandler
     */
    public SOAPAPICallPreHandler setRequestId(String requestId) {
        this.requestId = requestId;

        return this;
    }

    /**
     * @param request the request object
     * @return SOAPAPICallPreHandler
     */
    public SOAPAPICallPreHandler setRequestPayload(IRequest request) {
        this.request = request;

        return this;
    }

    /**
     * @param sdkVersion the sdkVersion to set
     * @return SOAPAPICallPreHandler
     */
    public SOAPAPICallPreHandler setSdkVersion(SDKVersion sdkVersion) {
        this.sdkVersion = sdkVersion;

        return this;
    }

    /**
     * @param accountPrefix the API account prefix
     * @return SOAPAPICallPreHandler
     */
    public SOAPAPICallPreHandler setAccountPrefix(String accountPrefix) {
        this.accountPrefix = accountPrefix;

        return this;
    }

    /**
     * Returns HTTP headers as a {@link Map}
     *
     * @return {@link Map} of Http headers
     */
    public Map<String, String> getHeaderMap() {
        return getProcessedHeaderMap();
    }

    /**
     * Returns SOAP action to call
     *
     * @return String of SOAP action to call
     */
    public String getSoapAction() {
        return soapAction;
    }

    /**
     * Returns request
     *
     * @return Object of request
     */
    public IRequest getRequestPayload() {
        return request;
    }

    public String getServiceEndPoint() {
        /*
         * Process the EndPoint to append the resourcePath sent as a part of the
         * method call with the base endPoint retrieved from configuration
         * system
         */
        String endPoint = null;
        try {
            endPoint = getBaseURL().toURI().resolve(Constants.WSDL_PATH).toString();
        } catch (MalformedURLException | URISyntaxException e) {
            //
        }
        return endPoint;
    }

    public void validate() throws ActionRequiredException {
    }

    /**
     * Returns the base URL configured in application resources or {@link Map}
     * passed for dynamic configuration
     *
     * @return BaseUrl ending with a '/' character {@link URL}
     * @throws MalformedURLException if endpoint cannot be found or formed
     */
    public URL getBaseURL() throws MalformedURLException {

        /*
         * Check for property 'mode' in the configuration, if not
         * found, check for 'service.EndPoint' property in the configuration and default
         * endpoint to PayU sandbox or live endpoints. Throw exception if the
         * above rules fail
         */
        if (url == null) {
            String mode = this.configurationMap.get(Constants.MODE);
            // Default to Endpoint param.
            String urlString = this.configurationMap.get(Constants.ENDPOINT);
            if (Constants.SANDBOX.equalsIgnoreCase(mode)) {
                urlString = Constants.SOAP_SANDBOX_ENDPOINT;
            } else if (Constants.LIVE.equalsIgnoreCase(mode)) {
                urlString = Constants.SOAP_LIVE_ENDPOINT;
            } else if (urlString == null || urlString.isEmpty()) {
                throw new MalformedURLException(
                        "service.EndPoint not set (OR) mode not configured to sandbox/live ");
            }
            if (!urlString.endsWith("/")) {
                urlString += "/";
            }
            url = new URL(urlString);
        }
        return url;
    }

    /**
     * @param urlString the url to set
     */
    public void setUrl(String urlString) throws MalformedURLException {
        if (urlString != null && !urlString.isEmpty()) {
            String uString = urlString.endsWith("/") ? urlString : urlString + "/";
            this.url = new URL(uString);
        } else {
            this.url = getBaseURL();
        }
    }

    /**
     * Returns User-Agent header
     *
     * @return {@link Map} storing the User-Agent header
     */
    protected Map<String, String> formUserAgentHeader() {
        UserAgentHeader userAgentHeader = new UserAgentHeader(
                sdkVersion != null ? sdkVersion.getSDKId() : null,
                sdkVersion != null ? sdkVersion.getSDKVersion() : null);
        return userAgentHeader.getHeader();
    }

    /*
     * Return API username from configuration Map
     */
    private String getAPIUsername() {
        String accountPrefix = Constants.ACCOUNT_PREFIX + getAccountPrefix() + '.';
        return this.configurationMap.get(accountPrefix + Constants.API_USERNAME);
    }

    /*
     * Returns API password from configuration Map
     */
    private String getAPIPassword() {
        String accountPrefix = Constants.ACCOUNT_PREFIX + getAccountPrefix() + '.';
        return this.configurationMap.get(accountPrefix + Constants.API_PASSWORD);
    }

    /*
     * Returns API safekey from configuration Map
     */
    private String getAPISafekey() {
        String accountPrefix = Constants.ACCOUNT_PREFIX + getAccountPrefix() + '.';
        return this.configurationMap.get(accountPrefix + Constants.API_SAFEKEY);
    }

    /*
     * Returns API safekey from configuration Map or instance variable
     */
    private String getAccountPrefix() {
        if (accountPrefix != null)
            return accountPrefix;

        return this.configurationMap.get(Constants.ACCOUNT_PREFIX);
    }

    /*
     * Returns payment methods from configuration Map
     */
    private String getPaymentMethods() {
        String accountPrefix = Constants.ACCOUNT_PREFIX + getAccountPrefix() + '.';
        return this.configurationMap.get(accountPrefix + Constants.PAYMENT_METHODS);
    }

    /*
     * Encodes Client ID and Client Secret in Base 64
     */
    private String encodeToBase64(String username, String password) throws UnsupportedEncodingException {
        return generateBase64String(username + ":" + password);
    }

    /*
     * Generate a Base64 encoded String from clientID & clientSecret
     */
    private String generateBase64String(String clientID) {
        String base64ClientID;
        byte[] encoded;
        encoded = Base64.encodeBase64(clientID.getBytes(StandardCharsets.UTF_8));
        base64ClientID = new String(encoded, StandardCharsets.UTF_8);
        return base64ClientID;
    }

    /**
     * Override this method to return a {@link Map} of HTTP headers
     *
     * @return {@link Map} of HTTP headers
     */
    protected Map<String, String> getProcessedHeaderMap() {

        /*
         * The implementation is PayPal specific. The Authorization header is
         * formed for OAuth or Basic, for OAuth system the authorization token
         * passed as a parameter is used in creation of HTTP header, for Basic
         * Authorization the ClientID and ClientSecret passed as parameters are
         * used after a Base64 encoding.
         */
        Map<String, String> headers = new HashMap<>();
        // Add any custom headers
        if (headersMap != null && !headersMap.isEmpty()) {
            headers.putAll(headersMap);
        }

        if (getAPIUsername() != null && !getAPIUsername().trim().isEmpty()
                && getAPIPassword() != null
                && !getAPIPassword().trim().isEmpty()) {
            try {
                headers.put(Constants.AUTHORIZATION_HEADER, "Basic "
                        + encodeToBase64(getAPIUsername(), getAPIPassword()));
            } catch (UnsupportedEncodingException e) {
                // TODO
            }
        }

        /*
         * Appends request ID which is used by PayU API service for Idempotent
         */
        if (requestId != null && !requestId.isEmpty()) {
            headers.put(Constants.PAYU_REQUEST_ID_HEADER, requestId);
        }

        /*
         * Add User-Agent header for tracking in PayU system
         */
        headers.putAll(formUserAgentHeader());

        return headers;
    }

    /**
     * Sets API version string and Safekey if not explicitly configured
     */
    public void addAPIParameters() {
        if (request != null) {
            if (request.getApi().isEmpty()) {
                request.setApi(Constants.API_VERSION);
            }
            if (request.getSafekey().isEmpty()) {
                request.setSafekey(this.getAPISafekey());
            }
        }

    }

    /**
     * Sets API version string and Safekey if not explicitly configured
     */
    public void addSupportedPaymentMethods() {
        if (request != null && !soapAction.equals("getTransaction")) {
            if (request instanceof DoTransaction doTransaction) {
                if (doTransaction.getTransactionType() != TransactionType.RESERVE_CANCEL
                        && doTransaction.getTransactionType() != TransactionType.CREDIT
                        && doTransaction.getTransactionType() != TransactionType.FINALIZE
                        && doTransaction.getEft().isEmpty()) {
                    request.setSupportedPaymentMethods(this.getPaymentMethods());
                }
            }
        }
        if (request != null && soapAction.equals("setTransaction")) {
            if (request instanceof SetTransaction setTransaction) {
                if (setTransaction.getTransactionType() != TransactionType.RESERVE_CANCEL
                        && setTransaction.getTransactionType() != TransactionType.CREDIT
                ) {
                    List<CustomField> customFields = setTransaction.getCustomfield();
                    if (!customFields.isEmpty()) {
                        for (CustomField c : customFields) {
                            if (!c.getKey().equals("processingType")) {
                                request.setSupportedPaymentMethods(this.getPaymentMethods());
                            }
                        }
                    } else {
                        request.setSupportedPaymentMethods(this.getPaymentMethods());
                    }
                }
            }
        }

    }

    /**
     * Return configurationMap
     *
     * @return configurationMap in this call pre-handler
     */
    public Map<String, String> getConfigurationMap() {
        return this.configurationMap;
    }

    /**
     * @return Set<QName>
     */
    public Set<QName> getHeaders() {
        return new TreeSet<>();
    }

    /**
     * @param context SOAP message context
     */
    @Override
    public boolean handleMessage(SOAPMessageContext context) {

        String prefixUri = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-";
        String uri = prefixUri + "wssecurity-secext-1.0.xsd";
        String uta = prefixUri + "wssecurity-utility-1.0.xsd";
        String ta = prefixUri + "username-token-profile-1.0#PasswordText";
        Boolean outboundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        if (outboundProperty) {
            try {
                String prefix = "wsse";
                SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
                SOAPFactory factory = SOAPFactory.newInstance();
                SOAPElement securityElem = factory.createElement("Security", prefix, uri);
                SOAPElement tokenElem = factory.createElement("UsernameToken", prefix, uri);

                tokenElem.addAttribute(QName.valueOf("wsu:Id"), "UsernameToken-9");
                tokenElem.addAttribute(QName.valueOf("xmlns:wsu"), uta);

                SOAPElement usernameElement = factory.createElement("Username", prefix, uri);
                usernameElement.addTextNode(getAPIUsername());

                SOAPElement passwordElement = factory.createElement("Password", prefix, uri);
                passwordElement.addTextNode(getAPIPassword());
                passwordElement.addAttribute(QName.valueOf("Type"), ta);

                tokenElem.addChildElement(usernameElement);
                tokenElem.addChildElement(passwordElement);

                securityElem.addChildElement(tokenElem);
                SOAPHeader header = envelope.getHeader();
                header.addChildElement(securityElem);
            } catch (Exception e) {
                System.out.println("Exception in handler: " + e.getMessage());
            }
        }

        return true;
    }

    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    public void close(MessageContext context) {
        //
    }
}
