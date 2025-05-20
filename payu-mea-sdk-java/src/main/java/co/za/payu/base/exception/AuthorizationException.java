package co.za.payu.base.exception;

/**
 * AuthorizationException used to denote errors in authentication
 * and authorization
 *
 */
public class AuthorizationException extends PayUException {
    private String message;
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -445620325285698085L;

    /**
     * Constructs a new exception with the specified detail message.
     */
    public AuthorizationException(String message)
    {
        super(message);
        this.message = message;
    }

    public AuthorizationException(String message, Throwable throwable) {
        super(message, throwable);
        this.message = message;
    }

    public String getError() {
        return message;
    }
}
