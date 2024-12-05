
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sbux complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sbux">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.api.controller.web.payjar.com/}iPaymentMethod">
 *       &lt;sequence>
 *         &lt;element name="amountInCents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sbuxOldReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sbuxReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sbuxVoucherNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sbux", propOrder = {
    "amountInCents",
    "sbuxOldReference",
    "sbuxReference",
    "sbuxVoucherNo"
})
public class Sbux
    extends IPaymentMethod
{

    protected String amountInCents;
    protected String sbuxOldReference;
    protected String sbuxReference;
    protected String sbuxVoucherNo;

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
     * @return Sbux    
     */
    public Sbux setAmountInCents(String value) {
        this.amountInCents = value;

        return this;
    }

    /**
     * Gets the value of the sbuxOldReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbuxOldReference() {
        return sbuxOldReference;
    }

    /**
     * Sets the value of the sbuxOldReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Sbux    
     */
    public Sbux setSbuxOldReference(String value) {
        this.sbuxOldReference = value;

        return this;
    }

    /**
     * Gets the value of the sbuxReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbuxReference() {
        return sbuxReference;
    }

    /**
     * Sets the value of the sbuxReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Sbux    
     */
    public Sbux setSbuxReference(String value) {
        this.sbuxReference = value;

        return this;
    }

    /**
     * Gets the value of the sbuxVoucherNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbuxVoucherNo() {
        return sbuxVoucherNo;
    }

    /**
     * Sets the value of the sbuxVoucherNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Sbux    
     */
    public Sbux setSbuxVoucherNo(String value) {
        this.sbuxVoucherNo = value;

        return this;
    }

}
