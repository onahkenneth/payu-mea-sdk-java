
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eWallet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eWallet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.api.controller.web.payjar.com/}iPaymentMethod">
 *       &lt;sequence>
 *         &lt;element name="amountInCents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentInstrumentType" type="{http://soap.api.controller.web.payjar.com/}paymentInstrumentType" minOccurs="0"/>
 *         &lt;element name="receiptNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vendorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eWallet", propOrder = {
    "amountInCents",
    "country",
    "currency",
    "customerNumber",
    "date",
    "paymentInstrumentType",
    "receiptNumber",
    "status",
    "transactionId",
    "vendorCode",
    "vendorName"
})
public class EWallet
    extends IPaymentMethod
{

    protected String amountInCents;
    protected String country;
    protected String currency;
    protected String customerNumber;
    protected String date;
    @XmlSchemaType(name = "string")
    protected PaymentInstrumentType paymentInstrumentType;
    protected String receiptNumber;
    protected String status;
    protected String transactionId;
    protected String vendorCode;
    protected String vendorName;

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
     * @return EWallet
     */
    public EWallet setAmountInCents(String value) {
        this.amountInCents = value;

        return this;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return EWallet
     */
    public EWallet setCountry(String value) {
        this.country = value;

        return this;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return EWallet
     */
    public EWallet setCurrency(String value) {
        this.currency = value;

        return this;
    }

    /**
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return EWallet
     */
    public EWallet setCustomerNumber(String value) {
        this.customerNumber = value;

        return this;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return EWallet
     */
    public EWallet setDate(String value) {
        this.date = value;

        return this;
    }

    /**
     * Gets the value of the paymentInstrumentType property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrumentType }
     *     
     */
    public PaymentInstrumentType getPaymentInstrumentType() {
        return paymentInstrumentType;
    }

    /**
     * Sets the value of the paymentInstrumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrumentType }
     * @return EWallet
     */
    public EWallet setPaymentInstrumentType(PaymentInstrumentType value) {
        this.paymentInstrumentType = value;

        return this;
    }

    /**
     * Gets the value of the receiptNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptNumber() {
        return receiptNumber;
    }

    /**
     * Sets the value of the receiptNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return EWallet
     */
    public EWallet setReceiptNumber(String value) {
        this.receiptNumber = value;

        return this;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return EWallet
     */
    public EWallet setStatus(String value) {
        this.status = value;

        return this;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return EWallet
     */
    public EWallet setTransactionId(String value) {
        this.transactionId = value;

        return this;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return EWallet
     */
    public EWallet setVendorCode(String value) {
        this.vendorCode = value;

        return this;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * Sets the value of the vendorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return EWallet
     */
    public EWallet setVendorName(String value) {
        this.vendorName = value;

        return this;
    }

}
