package co.za.payu.base;

import co.za.payu.api.IRequest;
import co.za.payu.base.exception.ActionRequiredException;
import co.za.payu.base.exception.AuthorizationException;

import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;
import java.util.Map;

/**
 * <code>APICallPreHandler</code> defines a high level abstraction for call
 * specific operations. PayPal REST API is provided by {@link co.za.payu.base.soap.SOAPAPICallPreHandler}
 */
public interface APICallPreHandler extends SOAPHandler<SOAPMessageContext> {

    /**
     * Returns headers for HTTP call
     *
     * @return Map of headers with name and value
     * @throws AuthorizationException
     */
    Map<String, String> getHeaderMap() throws AuthorizationException;

    /**
     * Returns the endpoint for the API call. If no endpoint is found
     * in configuration, then SANDBOX endpoints (hardcoded in
     * {@link Constants})are taken to be default for the API call.
     *
     * @return Endpoint String.
     */
    String getServiceEndPoint();

    /**
     * Returns the SOAP action call.
     *
     * @return String.
     */
    String getSoapAction();

    /**
     * Returns request object.
     *
     * @return IRequest.
     */
    IRequest getRequestPayload();

    /**
     * Validates settings and integrity before call
     */
    void validate() throws ActionRequiredException;

    /**
     * Return configurationMap
     *
     * @return configurationMap in this call pre-handler
     */
    Map<String, String> getConfigurationMap();
}

