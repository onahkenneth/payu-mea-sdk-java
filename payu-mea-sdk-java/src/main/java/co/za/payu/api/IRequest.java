package co.za.payu.api;

public interface IRequest {

    /**
     * Gets the value of the api property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApi();

    /**
     * Sets the value of the api property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public IRequest setApi(String value);

    /**
     * Gets the value of the safekey property.
     *
     * @return
     *     possible object is
     *     {@link String }
     * @return IRequest
     */
    public String getSafekey();

    /**
     * Sets the value of the safekey property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     * @return IRequest
     */
    public IRequest setSafekey(String value);

    /**
     * Gets supported payment methods.
     *
     * @return
     *     possible object is comma separated
     *     {@link String } value
     */
    public String getSupportedPaymentMethods();

    /**
     * Sets supported payment methods.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     * @return IRequest
     */
    public IRequest setSupportedPaymentMethods(String value);
}
