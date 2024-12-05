
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tokenizedPaymentMethodValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tokenizedPaymentMethodValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hashOrder" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="hashParticipant" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sensitiveData" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tokenizedPaymentMethodValue", propOrder = {
    "hashOrder",
    "hashParticipant",
    "sensitiveData",
    "value"
})
public class TokenizedPaymentMethodValue {

    protected int hashOrder;
    protected boolean hashParticipant;
    protected boolean sensitiveData;
    protected String value;

    /**
     * Gets the value of the hashOrder property.
     * 
     */
    public int getHashOrder() {
        return hashOrder;
    }

    /**
     * Sets the value of the hashOrder property.
     * 
     * @return TokenizedPaymentMethodValue
     */
    public TokenizedPaymentMethodValue setHashOrder(int value) {
        this.hashOrder = value;

        return this;
    }

    /**
     * Gets the value of the hashParticipant property.
     * 
     */
    public boolean isHashParticipant() {
        return hashParticipant;
    }

    /**
     * Sets the value of the hashParticipant property.
     * 
     * @return TokenizedPaymentMethodValue
     */
    public TokenizedPaymentMethodValue setHashParticipant(boolean value) {
        this.hashParticipant = value;

        return this;
    }

    /**
     * Gets the value of the sensitiveData property.
     * 
     */
    public boolean isSensitiveData() {
        return sensitiveData;
    }

    /**
     * Sets the value of the sensitiveData property.
     * 
     * @return TokenizedPaymentMethodValue
     */
    public TokenizedPaymentMethodValue setSensitiveData(boolean value) {
        this.sensitiveData = value;

        return this;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return TokenizedPaymentMethodValue    
     */
    public TokenizedPaymentMethodValue setValue(String value) {
        this.value = value;

        return this;
    }

}
