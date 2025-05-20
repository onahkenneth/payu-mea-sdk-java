package co.za.payu.base;

/**
 * <code>ClientCredentials</code> holds Client webservice Username, Password and Safekey
 */
public class ClientCredentials {
    /**
     * Client Username
     */
    private String username;

    /**
     * Client Password
     */
    private String password;

    /**
     * Client Safekey
     */
    private String safekey;

    public ClientCredentials() {
        super();
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the clientSecret
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the clientSecret to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the clientSecret
     */
    public String getSafekey() {
        return password;
    }

    /**
     * @param safekey the clientSecret to set
     */
    public void setSafekey(String safekey) {
        this.safekey = safekey;
    }
}
