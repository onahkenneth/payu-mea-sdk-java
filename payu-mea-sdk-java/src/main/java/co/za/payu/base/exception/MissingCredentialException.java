package co.za.payu.base.exception;

/**
 * MissingCredentialException is throw when the credential used are wrongly
 * configured or not found in the application properties
 *
 */
public class MissingCredentialException extends BaseException {
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = 7474392466469459651L;

    public MissingCredentialException(String message) {
        super(message);
    }

    public MissingCredentialException(String message, Throwable exception) {
        super(message, exception);
    }
}
