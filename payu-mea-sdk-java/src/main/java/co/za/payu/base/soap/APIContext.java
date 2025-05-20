package co.za.payu.base.soap;

import co.za.payu.base.Constants;
import co.za.payu.base.SDKVersion;

import java.util.Map;
import java.util.UUID;

/**
 * <code>APIContext</code> wraps wire-level parameters for the API call.
 * AuthCredential, is treated as a mandatory
 * parameter for (PayU SOAP APIs). RequestId is generated if not supplied for
 * marking Idempotency of the API call. The Application Header property may be used by
 * clients to access application level headers. The clients are responsible to
 * cast the Application Header property to appropriate type.
 */
public class APIContext {
    /**
     * Request Id
     */
    private String requestId;

    /**
     * Parameter to mask RequestId
     */
    private boolean maskRequestId;

    /**
     * {@link SDKVersion} instance
     */
    private SDKVersion sdkVersion;

    /**
     * {@link AuthCredential} credential instance
     */
    private AuthCredential credential;

    /**
     * Pass the clientID, secret and mode. The easiest, and most widely used
     * option.
     *
     * @param username API username
     * @param password API password
     */
    public APIContext(String username, String password) {
        this(username, password, null);
    }

    /**
     * Pass the clientID, secret and mode. The easiest, and most widely used
     * option.
     *
     * @param username API username
     * @param password API password
     * @param safekey API safekey
     */
    public APIContext(String username, String password, String safekey) {
        this(username, password, safekey, null);
    }

    /**
     * Pass the clientID, secret and mode. The easiest, and most widely used
     * option.
     *
     * @param username API username
     * @param password API password
     * @param safekey API safekey
     * @param mode API mode
     */
    public APIContext(String username, String password, String safekey, String mode) {
        this(username, password, safekey, mode, null);
    }

    /**
     * Pass the clientID, secret and mode. The easiest, and most widely used
     * option.
     *
     * @param username API username
     * @param password API password
     * @param safekey API safekey
     * @param mode API mode
     * @param accountPrefix API account prefix
     */
    public APIContext(String username, String password, String safekey, String mode, String accountPrefix) {
        this(username, password, safekey, mode, accountPrefix,null);
    }

    /**
     * Pass the clientID, secret and mode along with additional configurations.
     *
     * @param username
     * @param password
     * @param safekey
     * @param mode
     * @param configurations
     */
    public APIContext(String username, String password, String safekey, String mode, String accountPrefix, Map<String, String> configurations) {
        this.credential = new AuthCredential(username, password, safekey);
        if (configurations != null && configurations.size() > 0) {
            this.credential.addConfigurations(configurations);
        }
        this.setAccountPrefix(accountPrefix);
        this.setMode(mode);
    }

    /**
     * Sets account prefix.
     * @param accountPrefix account prefix
     * @return {@link APIContext}
     */
    public APIContext setAccountPrefix(String accountPrefix) {
        if (accountPrefix != null && !accountPrefix.equals("")) {
            this.credential.addConfiguration(Constants.ACCOUNT_PREFIX, accountPrefix);
        }


        return this;
    }

    /**
     * Sets mode to either `live` or `sandbox`.
     * @param mode
     * @return {@link APIContext}
     */
    public APIContext setMode(String mode) {
        if (mode == null || !(mode.equals(Constants.LIVE) || mode.equals(Constants.SANDBOX))) {
            throw new IllegalArgumentException("Mode needs to be either `sandbox` or `live`.");
        }
        this.credential.addConfiguration(Constants.MODE, mode);
        return this;
    }

    /**
     * Returns HTTP Headers.
     *
     * @return the hTTPHeaders
     */
    public Map<String, String> getHTTPHeaders() {
        return this.credential.getHeaders();
    }


    public String getHTTPHeader(String key) {
        return this.credential.getHeader(key);
    }
    /**
     * Replaces existing headers with provided one.
     *
     * @param httpHeaders
     *            the httpHeaders to set
     */
    public APIContext setHTTPHeaders(Map<String, String> httpHeaders) {
        this.credential.setHeaders(httpHeaders);
        return this;
    }

    /**
     * Adds HTTP Headers to existing list
     *
     * @param httpHeaders
     *            the httpHeaders to set
     */
    public APIContext addHTTPHeaders(Map<String, String> httpHeaders) {
        this.credential.addHeaders(httpHeaders);
        return this;
    }


    /**
     * Adds HTTP Header to existing list
     *
     * @param key
     * @param value
     */
    public APIContext addHTTPHeader(String key, String value) {
        this.credential.addHeader(key, value);
        return this;
    }

    /**
     * Returns Configuration Map
     *
     * @return {@link Map} of configurations
     */
    public Map<String, String> getConfigurationMap() {
        return this.credential.getConfigurations();
    }

    /**
     * Replaces the existing configurations with provided one
     *
     * @param configurationMap
     *            the configurationMap to set
     * @return {@link APIContext}
     */
    public APIContext setConfigurationMap(Map<String, String> configurationMap) {
        this.credential.setConfigurations(configurationMap);
        return this;
    }

    /**
     * Adds configurations
     *
     * @param configurations {@link Map} of configurations.
     * @return {@link APIContext}
     */
    public APIContext addConfigurations(Map<String, String> configurations) {
        this.credential.addConfigurations(configurations);
        return this;
    }

    /**
     * Adds configuration
     *
     * @param key key
     * @param value value
     * @return {@link APIContext}
     */
    public APIContext addConfiguration(String key, String value) {
        this.credential.addConfiguration(key, value);
        return this;
    }

    /**
     * Returns string value of specific configuration.
     *
     * @param key key
     * @return {@link String} value of specific configuration.
     */
    public String getConfiguration(String key) {
        return this.credential.getConfiguration(key);
    }

    /**
     * Returns the unique requestId set during creation, if not available and if
     * maskRequestId is set to false returns a generated one, else returns null.
     *
     * @return requestId
     */
    public String getRequestId() {
        String reqId = null;
        if (!maskRequestId) {
            if (requestId == null || requestId.length() <= 0) {
                requestId = UUID.randomUUID().toString();
            }
            reqId = requestId;
        }
        return reqId;
    }

    /**
     * Sets the requestId to be sent on each request. Used for idempotency purposes.
     * requestId is auto generated if not passed explicitly.
     *
     * @param requestId request Id
     * @return APIContext
     */
    public APIContext setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * @param maskRequestId the maskRequestId to set
     */
    public void setMaskRequestId(boolean maskRequestId) {
        this.maskRequestId = maskRequestId;
    }

    /**
     * @return the sdkVersion
     */
    public SDKVersion getSdkVersion() {
        return sdkVersion;
    }

    /**
     * @param sdkVersion the sdkVersion to set
     */
    public void setSdkVersion(SDKVersion sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public String getUsername() {
        if (this.credential == null) {
            throw new IllegalArgumentException(
                    "Username is required. Please use APIContext(String username, String password, " +
                            "String safekey, String accountPrefix, String mode)");
        }
        return this.credential.getUsername();
    }

    public String getPassword() {
        if (this.credential == null) {
            throw new IllegalArgumentException(
                    "Password is required. Please use APIContext(String username, String password, " +
                            "String safekey, String accountPrefix, String mode)");
        }
        return this.credential.getPassword();
    }

    public String getSafekey() {
        if (this.credential == null) {
            throw new IllegalArgumentException(
                    "Safekey is required. Please use APIContext(String username, String password, " +
                            "String safekey, String accountPrefix, String mode)");
        }
        return this.credential.getSafekey();
    }

    public String getAccountPrefix() {
        if (this.credential == null) {
            throw new IllegalArgumentException(
                    "Account prefix is required. Please use APIContext(String username, String password, " +
                            "String safekey, String accountPrefix, String mode)");
        }
        return this.credential.getConfiguration(Constants.ACCOUNT_PREFIX);
    }
}
