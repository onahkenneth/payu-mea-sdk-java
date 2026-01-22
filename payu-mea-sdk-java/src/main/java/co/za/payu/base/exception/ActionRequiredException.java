package co.za.payu.base.exception;

/**
 * ActionRequiredException, encapsulates instances where client has to
 * take actions based or errors in API call.
 *
 */
public class ActionRequiredException extends HttpErrorException {
    /**
     * Serial version UID
     */
    private static final long serialVersionUID = 1065686733686986767L;

    public ActionRequiredException(String message) {
        super(message);
    }

    public ActionRequiredException(String message, Throwable exception) {
        super(message, exception);
    }

    public ActionRequiredException(int responsecode, String errorResponse, String msg, Throwable exception) {
        super(responsecode, errorResponse, msg, exception);
    }

    public String toString() {
        return "HTTP response code: " + this.getResponsecode() + "\n"
                + "error message: " + this.getErrorResponse();
    }
}
