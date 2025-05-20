
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for autoPay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="autoPay">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.api.controller.web.payjar.com/}iPaymentMethod">
 *       &lt;sequence>
 *         &lt;element name="amountInCents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoPayBeneficiaryRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoPayCardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoPayErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoPayNotificationHashedSignature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoPayPaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoPayPaymentrecordId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoPayRandomSeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoPayReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoPayStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoPayTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoPayTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autoPay", propOrder = {
    "amountInCents",
    "autoPayBeneficiaryRef",
    "autoPayCardNumber",
    "autoPayErrorCode",
    "autoPayNotificationHashedSignature",
    "autoPayPaymentDate",
    "autoPayPaymentrecordId",
    "autoPayRandomSeed",
    "autoPayReference",
    "autoPayStatus",
    "autoPayTotalAmount",
    "autoPayTransactionId"
})
public class AutoPay
    extends IPaymentMethod
{

    protected String amountInCents;
    protected String autoPayBeneficiaryRef;
    protected String autoPayCardNumber;
    protected String autoPayErrorCode;
    protected String autoPayNotificationHashedSignature;
    protected String autoPayPaymentDate;
    protected String autoPayPaymentrecordId;
    protected String autoPayRandomSeed;
    protected String autoPayReference;
    protected String autoPayStatus;
    protected String autoPayTotalAmount;
    protected String autoPayTransactionId;

    /**
     * Gets the value of the amountInCents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountInCents() {
        return amountInCents;
    }

    /**
     * Sets the value of the amountInCents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return AutoPay
     */
    public AutoPay setAmountInCents(String value) {
        this.amountInCents = value;

        return this;
    }

    /**
     * Gets the value of the autoPayBeneficiaryRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoPayBeneficiaryRef() {
        return autoPayBeneficiaryRef;
    }

    /**
     * Sets the value of the autoPayBeneficiaryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return AutoPay
     */
    public AutoPay setAutoPayBeneficiaryRef(String value) {
        this.autoPayBeneficiaryRef = value;

        return this;
    }

    /**
     * Gets the value of the autoPayCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoPayCardNumber() {
        return autoPayCardNumber;
    }

    /**
     * Sets the value of the autoPayCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return AutoPay
     */
    public AutoPay setAutoPayCardNumber(String value) {
        this.autoPayCardNumber = value;

        return this;
    }

    /**
     * Gets the value of the autoPayErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoPayErrorCode() {
        return autoPayErrorCode;
    }

    /**
     * Sets the value of the autoPayErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return AutoPay
     */
    public AutoPay setAutoPayErrorCode(String value) {
        this.autoPayErrorCode = value;

        return this;
    }

    /**
     * Gets the value of the autoPayNotificationHashedSignature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoPayNotificationHashedSignature() {
        return autoPayNotificationHashedSignature;
    }

    /**
     * Sets the value of the autoPayNotificationHashedSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return AutoPay
     */
    public AutoPay setAutoPayNotificationHashedSignature(String value) {
        this.autoPayNotificationHashedSignature = value;

        return this;
    }

    /**
     * Gets the value of the autoPayPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoPayPaymentDate() {
        return autoPayPaymentDate;
    }

    /**
     * Sets the value of the autoPayPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return AutoPay
     */
    public AutoPay setAutoPayPaymentDate(String value) {
        this.autoPayPaymentDate = value;

        return this;
    }

    /**
     * Gets the value of the autoPayPaymentrecordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoPayPaymentrecordId() {
        return autoPayPaymentrecordId;
    }

    /**
     * Sets the value of the autoPayPaymentrecordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return AutoPay
     */
    public AutoPay setAutoPayPaymentrecordId(String value) {
        this.autoPayPaymentrecordId = value;

        return this;
    }

    /**
     * Gets the value of the autoPayRandomSeed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoPayRandomSeed() {
        return autoPayRandomSeed;
    }

    /**
     * Sets the value of the autoPayRandomSeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return AutoPay
     */
    public AutoPay setAutoPayRandomSeed(String value) {
        this.autoPayRandomSeed = value;

        return this;
    }

    /**
     * Gets the value of the autoPayReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoPayReference() {
        return autoPayReference;
    }

    /**
     * Sets the value of the autoPayReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return AutoPay
     */
    public AutoPay setAutoPayReference(String value) {
        this.autoPayReference = value;

        return this;
    }

    /**
     * Gets the value of the autoPayStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoPayStatus() {
        return autoPayStatus;
    }

    /**
     * Sets the value of the autoPayStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return AutoPay
     */
    public AutoPay setAutoPayStatus(String value) {
        this.autoPayStatus = value;

        return this;
    }

    /**
     * Gets the value of the autoPayTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoPayTotalAmount() {
        return autoPayTotalAmount;
    }

    /**
     * Sets the value of the autoPayTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return AutoPay
     */
    public AutoPay setAutoPayTotalAmount(String value) {
        this.autoPayTotalAmount = value;

        return this;
    }

    /**
     * Gets the value of the autoPayTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoPayTransactionId() {
        return autoPayTransactionId;
    }

    /**
     * Sets the value of the autoPayTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return AutoPay
     */
    public AutoPay setAutoPayTransactionId(String value) {
        this.autoPayTransactionId = value;

        return this;
    }

}
