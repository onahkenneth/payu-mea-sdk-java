package co.za.payu.base.exception;

/**
 * InvalidResponseException used to denote errors in response data
 *
 */
public class InvalidResponseDataException extends BaseException {
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -4382275642096725866L;

    public InvalidResponseDataException(String msg) {
        super(msg);
    }

    public InvalidResponseDataException(String msg, Throwable exception) {
        super(msg, exception);
    }
}
