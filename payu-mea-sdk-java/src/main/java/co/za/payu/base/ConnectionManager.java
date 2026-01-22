package co.za.payu.base;

import javax.net.ssl.SSLContext;

/**
 * ConnectionManager acts as a interface to retrieve {@link Connection}
 * objects used by API service
 *
 */
public final class ConnectionManager {
    /**
     * Singleton instance
     */
    private static ConnectionManager instance;

    private SSLContext customSslContext;

    // Private Constructor
    private ConnectionManager() {
    }

    /**
     * Singleton accessor method
     *
     * @return {@link ConnectionManager} singleton object
     */
    public static ConnectionManager getInstance() {
        synchronized (ConnectionManager.class) {
            if (instance == null) {
                instance = new ConnectionManager();
            }
        }
        return instance;
    }

    /**
     * @return HttpConnection object
     */
    public Connection getConnection() {
        if(customSslContext != null) {
            return new DefaultConnection(customSslContext);
        } else {
            return new DefaultConnection();
        }
    }

    /**
     *
     * @param sslContext an custom {@link SSLContext} to set to all new connections.
     * 		If null, the default SSLContext will be recovered each new connection.<br>
     *<pre>
     *
     * {@literal // On application startup...}
     * public static void main({@link String}[] args) {
     * 	{@link SSLContext} sslContext = {@link SSLContext}.getDefault();
     * 	{@literal // Or provide your custom context.}
     *
     * 	{@link ConnectionManager}.getInstance().configureCustomSslContext(sslContext);
     * 	{@literal // Now all connections will use this ssl context except if the authentication method is with certificate credential.}
     * }
     *
     *</pre>
     */
    public void configureCustomSslContext(SSLContext sslContext) {
        customSslContext = sslContext;
    }
}
