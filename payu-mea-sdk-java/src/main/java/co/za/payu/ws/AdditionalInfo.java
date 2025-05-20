
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additionalInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additionalInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.payu.co.za/PayUMapLoader}PayUMapLoader">
 *       &lt;sequence>
 *         &lt;element name="callCenterRepId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="demoMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deviceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devicePlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notificationUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payUReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="redirectChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secure3d" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showBudget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="storePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="supportedPaymentMethods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traceReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionalMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionalInfo", propOrder = {
    "callCenterRepId",
    "cancelUrl",
    "demoMode",
    "deviceId",
    "devicePlatform",
    "locale",
    "merchantReference",
    "notificationUrl",
    "payUReference",
    "redirectChannel",
    "returnUrl",
    "secure3D",
    "showBudget",
    "storePaymentMethod",
    "supportedPaymentMethods",
    "traceReference",
    "transactionalCode",
    "transactionalMessage",
    "transactionalStatus"
})
public class AdditionalInfo
    extends PayUMapLoader
{

    protected String callCenterRepId;
    protected String cancelUrl;
    protected String demoMode;
    protected String deviceId;
    protected String devicePlatform;
    protected String locale;
    protected String merchantReference;
    protected String notificationUrl;
    protected String payUReference;
    protected String redirectChannel;
    protected String returnUrl;
    @XmlElement(name = "secure3d")
    protected String secure3D;
    protected String showBudget;
    protected String storePaymentMethod;
    protected String supportedPaymentMethods;
    protected String traceReference;
    protected String transactionalCode;
    protected String transactionalMessage;
    protected String transactionalStatus;

    /**
     * Gets the value of the callCenterRepId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallCenterRepId() {
        return callCenterRepId;
    }

    /**
     * Sets the value of the callCenterRepId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setCallCenterRepId(String value) {
        this.callCenterRepId = value;

        return this;
    }

    /**
     * Gets the value of the cancelUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelUrl() {
        return cancelUrl;
    }

    /**
     * Sets the value of the cancelUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setCancelUrl(String value) {
        this.cancelUrl = value;

        return this;
    }

    /**
     * Gets the value of the demoMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemoMode() {
        return demoMode;
    }

    /**
     * Sets the value of the demoMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setDemoMode(String value) {
        this.demoMode = value;

        return this;
    }

    /**
     * Gets the value of the deviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * Sets the value of the deviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setDeviceId(String value) {
        this.deviceId = value;

        return this;
    }

    /**
     * Gets the value of the devicePlatform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicePlatform() {
        return devicePlatform;
    }

    /**
     * Sets the value of the devicePlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setDevicePlatform(String value) {
        this.devicePlatform = value;

        return this;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setLocale(String value) {
        this.locale = value;

        return this;
    }

    /**
     * Gets the value of the merchantReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantReference() {
        return merchantReference;
    }

    /**
     * Sets the value of the merchantReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setMerchantReference(String value) {
        this.merchantReference = value;

        return this;
    }

    /**
     * Gets the value of the notificationUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationUrl() {
        return notificationUrl;
    }

    /**
     * Sets the value of the notificationUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setNotificationUrl(String value) {
        this.notificationUrl = value;

        return this;
    }

    /**
     * Gets the value of the payUReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayUReference() {
        return payUReference;
    }

    /**
     * Sets the value of the payUReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setPayUReference(String value) {
        this.payUReference = value;

        return this;
    }

    /**
     * Gets the value of the redirectChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectChannel() {
        return redirectChannel;
    }

    /**
     * Sets the value of the redirectChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setRedirectChannel(String value) {
        this.redirectChannel = value;

        return this;
    }

    /**
     * Gets the value of the returnUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Sets the value of the returnUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setReturnUrl(String value) {
        this.returnUrl = value;

        return this;
    }

    /**
     * Gets the value of the secure3D property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecure3D() {
        return secure3D;
    }

    /**
     * Sets the value of the secure3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setSecure3D(String value) {
        this.secure3D = value;

        return this;
    }

    /**
     * Gets the value of the showBudget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowBudget() {
        return showBudget;
    }

    /**
     * Sets the value of the showBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setShowBudget(String value) {
        this.showBudget = value;

        return this;
    }

    /**
     * Gets the value of the storePaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorePaymentMethod() {
        return storePaymentMethod;
    }

    /**
     * Sets the value of the storePaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setStorePaymentMethod(String value) {
        this.storePaymentMethod = value;

        return this;
    }

    /**
     * Gets the value of the supportedPaymentMethods property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportedPaymentMethods() {
        return supportedPaymentMethods;
    }

    /**
     * Sets the value of the supportedPaymentMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setSupportedPaymentMethods(String value) {
        this.supportedPaymentMethods = value;

        return this;
    }

    /**
     * Gets the value of the traceReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceReference() {
        return traceReference;
    }

    /**
     * Sets the value of the traceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setTraceReference(String value) {
        this.traceReference = value;

        return this;
    }

    /**
     * Gets the value of the transactionalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionalCode() {
        return transactionalCode;
    }

    /**
     * Sets the value of the transactionalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *
     * @return {@link AdditionalInfo}
     */
    public AdditionalInfo setTransactionalCode(String value) {
        this.transactionalCode = value;

        return this;
    }

    /**
     * Gets the value of the transactionalMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionalMessage() {
        return transactionalMessage;
    }

    /**
     * Sets the value of the transactionalMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setTransactionalMessage(String value) {
        this.transactionalMessage = value;

        return this;
    }

    /**
     * Gets the value of the transactionalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionalStatus() {
        return transactionalStatus;
    }

    /**
     * Sets the value of the transactionalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInfo setTransactionalStatus(String value) {
        this.transactionalStatus = value;

        return this;
    }

}
