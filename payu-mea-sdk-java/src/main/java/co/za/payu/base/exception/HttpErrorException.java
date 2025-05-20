package co.za.payu.base.exception;

/**
 * HttpErrorException denotes errors that occur during SOAP call
 *
 */
public class HttpErrorException extends BaseException {
    private int responseCode;
    private String errorResponse;
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = 5705200623916284935L;

    public HttpErrorException(String msg) {
        super(msg);
    }

    public HttpErrorException(String msg, Throwable exception) {
        super(msg, exception);
    }

    public HttpErrorException(int responsecode, String errorResponse, String msg, Throwable exception) {
        super(msg, exception);
        this.responseCode = responsecode;
        this.errorResponse = errorResponse;
    }

    public int getResponsecode() {
        return responseCode;
    }

    public String getErrorResponse() {
        return errorResponse;
    }
}
