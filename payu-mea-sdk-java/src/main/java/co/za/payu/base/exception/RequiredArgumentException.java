package co.za.payu.base.exception;

/**
 * RequiredArgumentException is thrown for error caused by not providing a
 * required argument
 *
 */
public class RequiredArgumentException extends BaseException {
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = 3943641966421255793L;

    public RequiredArgumentException(String message) {
        super(message);
    }

    public RequiredArgumentException(String message, Throwable exception) {
        super(message, exception);
    }
}
