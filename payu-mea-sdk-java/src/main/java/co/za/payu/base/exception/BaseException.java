package co.za.payu.base.exception;

/**
 * BaseException for SDK
 */
public class BaseException extends Exception {
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = -1601968121482238076L;

    public BaseException(String msg) {
        super(msg);
    }

    public BaseException(String msg, Throwable exception) {
        super(msg, exception);
    }
}
