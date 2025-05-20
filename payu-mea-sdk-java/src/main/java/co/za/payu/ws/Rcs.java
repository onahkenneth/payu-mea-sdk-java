
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rcs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rcs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.api.controller.web.payjar.com/}iPaymentMethod">
 *       &lt;sequence>
 *         &lt;element name="amountInCents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tenderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vspTrxId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wiCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wiTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rcs", propOrder = {
    "amountInCents",
    "cardType",
    "tenderType",
    "vspTrxId",
    "wiCode",
    "wiTransactionId"
})
public class Rcs
    extends IPaymentMethod
{

    protected String amountInCents;
    protected String cardType;
    protected String tenderType;
    protected String vspTrxId;
    protected String wiCode;
    protected String wiTransactionId;

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
     * @return Rcs    
     */
    public Rcs setAmountInCents(String value) {
        this.amountInCents = value;

        return this;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Rcs    
     */
    public Rcs setCardType(String value) {
        this.cardType = value;

        return this;
    }

    /**
     * Gets the value of the tenderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTenderType() {
        return tenderType;
    }

    /**
     * Sets the value of the tenderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Rcs    
     */
    public Rcs setTenderType(String value) {
        this.tenderType = value;

        return this;
    }

    /**
     * Gets the value of the vspTrxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVspTrxId() {
        return vspTrxId;
    }

    /**
     * Sets the value of the vspTrxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Rcs    
     */
    public Rcs setVspTrxId(String value) {
        this.vspTrxId = value;

        return this;
    }

    /**
     * Gets the value of the wiCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiCode() {
        return wiCode;
    }

    /**
     * Sets the value of the wiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Rcs    
     */
    public Rcs setWiCode(String value) {
        this.wiCode = value;

        return this;
    }

    /**
     * Gets the value of the wiTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiTransactionId() {
        return wiTransactionId;
    }

    /**
     * Sets the value of the wiTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Rcs    
     */
    public Rcs setWiTransactionId(String value) {
        this.wiTransactionId = value;

        return this;
    }

}
