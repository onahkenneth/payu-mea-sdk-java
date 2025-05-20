package co.za.payu.base.exception;

public class PayUException extends Exception {
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -6772045289087259993L;

    /**
     * Default constructor
     */
    public PayUException() {
        super();
    }

    /**
     * Constructs a new exception with the specified detail message.
     */
    public PayUException(String message) {
        super(message);
    }

    /**
     * Constructs a new exception with the specified detail message and cause.
     */
    public PayUException(String message, Throwable cause) {
        super(message, cause);
    }
}
