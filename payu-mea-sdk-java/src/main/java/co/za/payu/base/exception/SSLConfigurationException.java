package co.za.payu.base.exception;

/**
 * SSLConfigurationException is thrown for error caused during SSL connection
 *
 */
public class SSLConfigurationException extends BaseException {
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -9046082028412292027L;

    public SSLConfigurationException(String message) {
        super(message);
    }

    public SSLConfigurationException(String message, Throwable exception) {
        super(message, exception);
    }
}
