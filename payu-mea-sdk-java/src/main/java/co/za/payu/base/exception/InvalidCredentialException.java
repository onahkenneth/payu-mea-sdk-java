package co.za.payu.base.exception;

/**
 * InvalidCredentialException used to denote errors in credentials used in API
 * call
 *
 */
public class InvalidCredentialException extends BaseException {
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = 7280238855425131793L;

    public InvalidCredentialException(String msg) {
        super(msg);
    }

    public InvalidCredentialException(String msg, Throwable exception) {
        super(msg, exception);
    }
}
