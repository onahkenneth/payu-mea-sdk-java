
package co.za.payu.ws;

import co.za.payu.api.IResponse;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doDeleteTransactionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doDeleteTransactionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{https://www.payu.co.za/DeleteTransactionResponseMessage}DeleteTransactionResponseMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doDeleteTransactionResponse", propOrder = {
    "_return"
})
public class DoDeleteTransactionResponse implements IResponse {

    @XmlElement(name = "return")
    protected DeleteTransactionResponseMessage _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteTransactionResponseMessage }
     *     
     */
    public DeleteTransactionResponseMessage getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteTransactionResponseMessage }
     *     
     */
    public void setReturn(DeleteTransactionResponseMessage value) {
        this._return = value;
    }

}
