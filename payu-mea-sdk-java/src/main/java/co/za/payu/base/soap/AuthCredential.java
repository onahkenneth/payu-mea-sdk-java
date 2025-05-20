package co.za.payu.base.soap;

import co.za.payu.base.*;
import co.za.payu.base.sdk.info.SDKVersionImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * AuthCredential is used for storing of Authentication credentials used by PayU
 * SOAP API service. Username, password and Safekey are required by the class to. The
 * class has two constructors, one of it taking an additional configuration map
 * used for dynamic configuration. When using the constructor with out
 * configuration map the endpoint is fetched from the configuration that is used
 * during initialization. See {@link PayUResource} for configuring the system.
 * When using a configuration map the class expects an entry by the name
 * "service.EndPoint" to retrieve the value of the endpoint
 * for the API. If either are not present the configuration should
 * have a entry by the name "mode" with values sandbox or live wherein the
 * corresponding endpoints are default to PayU endpoints.
 */
public class AuthCredential {
    private static final Logger log = LoggerFactory.getLogger(AuthCredential.class);

    /**
     * Username for API
     */
    private String username;

    /**
     * Password for API
     */
    private String password;

    /**
     * Password for API
     */
    private String safekey;

    /**
     * Headers
     */
    private Map<String, String> headers = new HashMap<String, String>();

    /**
     * Map used for dynamic configuration
     */
    private Map<String, String> configurationMap;

    /**
     * {@link SDKVersion} instance
     */
    private SDKVersion sdkVersion;

    /**
     * Pass API user, password and safekey to AuthCredential.
     *
     * @param username Username for API
     * @param password Password for API
     * @param safekey Safekey for API
     */
    public AuthCredential(String username, String password, String safekey) {
        super();
        this.username = username;
        this.password = password;
        this.safekey = safekey;
        this.configurationMap = SDKUtil.combineDefaultMap(ConfigManager.getInstance().getConfigurationMap());
        this.sdkVersion = new SDKVersionImpl();
    }

    /**
     * Configuration Constructor for dynamic configuration
     *
     * @param username Username for API
     * @param password Password for API
     * @param safekey Safekey for API
     * @param configurationMap
     *            Dynamic configuration map which should have an entry for
     *            'service.EndPoint'. If either are not
     *            present then there should be entry for 'mode' with values
     *            sandbox/live, wherein PayUs endpoints are used.
     */
    public AuthCredential(String username, String password, String safekey, Map<String, String> configurationMap) {
        super();
        this.username = username;
        this.password = password;
        this.safekey = safekey;
        this.configurationMap = SDKUtil.combineDefaultMap(configurationMap);
        this.sdkVersion = new SDKVersionImpl();
    }

    /**
     * Checks if username, password and safekey are set.
     *
     * @return {@link Boolean}
     */
    public boolean hasCredentials() {
        return (this.username != null) && (this.password != null) && (this.safekey != null);
    }

    /**
     * Sets Headers for every calls.
     *
     * @param headers
     * @return {@link AuthCredential}
     */
    public AuthCredential setHeaders(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Adds headers.
     *
     * @param headers
     * @return {@link AuthCredential}
     */
    public AuthCredential addHeaders(Map<String, String> headers) {
        this.headers.putAll(headers);
        return this;
    }

    /**
     * Adds header to existing list of headers.
     *
     * @param key
     * @param value
     * @return {@link AuthCredential}
     */
    public AuthCredential addHeader(String key, String value) {
        this.headers.put(key, value);
        return this;
    }

    /**
     * Returns the list of headers
     *
     * @return {@link Map} of headers
     */
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * Returns the header value
     *
     * @return {@link String} value of header
     */
    public String getHeader(String key) {
        return this.headers.get(key);
    }

    /**
     * Returns username
     *
     * @return {@link String} containing username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Returns password
     *
     * @return {@link String} containing password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Returns safekey
     *
     * @return {@link String} containing safe key
     */
    public String getSafekey() {
        return this.safekey;
    }

    /**
     * Adds configuration to list of configurations.
     *
     * @param key
     * @param value
     * @return {@link AuthCredential}
     */
    public AuthCredential addConfiguration(String key, String value) {
        if (this.configurationMap == null) {
            this.configurationMap = new HashMap<String, String>();
        }
        this.configurationMap.put(key, value);
        return this;
    }

    /**
     * Adds configurations to list of configurations.
     * @param configurations
     * @return {@link AuthCredential}
     */
    public AuthCredential addConfigurations(Map<String, String> configurations) {
        if (this.configurationMap == null) {
            this.configurationMap = new HashMap<String, String>();
        }
        this.configurationMap.putAll(configurations);
        return this;
    }

    /**
     * Replaces existing configurations with provided map of configurations.
     *
     * @param configurations
     * @return {@link AuthCredential}
     */
    public AuthCredential setConfigurations(Map<String, String> configurations) {
        this.configurationMap = configurations;
        return this;
    }

    /**
     * Returns list of configurations.
     *
     * @return {@link Map} of configurations
     */
    public Map<String, String> getConfigurations() {
        return this.configurationMap;
    }

    /**
     * Returns specific configuration.
     *
     * @param key
     * @return {@link String} value of configuration
     */
    public String getConfiguration(String key) {
        if (this.configurationMap != null) {
            return this.configurationMap.get(key);
        }
        return null;
    }
}
