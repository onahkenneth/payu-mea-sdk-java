
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wallet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wallet">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.api.controller.web.payjar.com/}sva">
 *       &lt;sequence>
 *         &lt;element name="acquirerReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentInstrument" type="{http://soap.api.controller.web.payjar.com/}paymentInstrument" minOccurs="0"/>
 *         &lt;element name="paymentInstrumentType" type="{http://soap.api.controller.web.payjar.com/}paymentInstrumentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wallet", propOrder = {
    "acquirerReference",
    "paymentInstrument",
    "paymentInstrumentType"
})
public class Wallet
    extends Sva
{

    protected String acquirerReference;
    @XmlSchemaType(name = "string")
    protected PaymentInstrument paymentInstrument;
    @XmlSchemaType(name = "string")
    protected PaymentInstrumentType paymentInstrumentType;

    /**
     * Gets the value of the acquirerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquirerReference() {
        return acquirerReference;
    }

    /**
     * Sets the value of the acquirerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Wallet     
     */
    public Wallet setAcquirerReference(String value) {
        this.acquirerReference = value;

        return this;
    }

    /**
     * Gets the value of the paymentInstrument property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument }
     *     
     */
    public PaymentInstrument getPaymentInstrument() {
        return paymentInstrument;
    }

    /**
     * Sets the value of the paymentInstrument property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument }
     * @return Wallet    
     */
    public Wallet setPaymentInstrument(PaymentInstrument value) {
        this.paymentInstrument = value;

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
     * @return Wallet    
     */
    public Wallet setPaymentInstrumentType(PaymentInstrumentType value) {
        this.paymentInstrumentType = value;

        return this;
    }

}
