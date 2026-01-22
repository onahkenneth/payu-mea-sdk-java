
package co.za.payu.ws;

import co.za.payu.api.IRequest;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for doDeleteTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="doDeleteTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Safekey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deleteTransactionType" type="{http://soap.api.controller.web.payjar.com/}deleteTransactionType" minOccurs="0"/>
 *         &lt;element name="Customfield" type="{http://soap.api.controller.web.payjar.com/}customField" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "doDeleteTransaction", propOrder = {
    "api",
    "safekey",
    "deleteTransactionType",
    "customfield"
})
public class DoDeleteTransaction implements IRequest {

    @XmlElement(name = "Api")
    protected String api = "";
    @XmlElement(name = "Safekey")
    protected String safekey = "";
    @XmlSchemaType(name = "string")
    protected DeleteTransactionType deleteTransactionType;
    @XmlElement(name = "Customfield")
    protected List<CustomField> customfield;

    /**
     * Gets the value of the api property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApi() {
        return api;
    }

    /**
     * Sets the value of the api property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return DoDeleteTransaction    
     */
    public DoDeleteTransaction setApi(String value) {
        this.api = value;

        return this;
    }

    /**
     * Gets the value of the safekey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafekey() {
        return safekey;
    }

    /**
     * Sets the value of the safekey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return DoDeleteTransaction    
     */
    public DoDeleteTransaction setSafekey(String value) {
        this.safekey = value;

        return this;
    }

    /**
     * Gets the value of the deleteTransactionType property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteTransactionType }
     *     
     */
    public DeleteTransactionType getDeleteTransactionType() {
        return deleteTransactionType;
    }

    /**
     * Sets the value of the deleteTransactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteTransactionType }
     * @return DoDeleteTransaction    
     */
    public DoDeleteTransaction setDeleteTransactionType(DeleteTransactionType value) {
        this.deleteTransactionType = value;

        return this;
    }

    /**
     * Gets the value of the customfield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customfield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomfield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomField }
     * 
     * 
     */
    public List<CustomField> getCustomfield() {
        if (customfield == null) {
            customfield = new ArrayList<CustomField>();
        }
        return this.customfield;
    }

    @Override
    public String getSupportedPaymentMethods() {
        return null;
    }

    @Override
    public DoDeleteTransaction setSupportedPaymentMethods(String value) {
        return this;
    }

}
