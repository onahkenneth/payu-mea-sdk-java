
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
 * <p>Java class for managePaymentMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="managePaymentMethod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Safekey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="managePaymentMethodType" type="{http://soap.api.controller.web.payjar.com/}managePaymentMethodType" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation" type="{http://soap.api.controller.web.payjar.com/}additionalInfo" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://soap.api.controller.web.payjar.com/}customer" minOccurs="0"/>
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
@XmlType(name = "managePaymentMethod", propOrder = {
    "api",
    "safekey",
    "managePaymentMethodType",
    "additionalInformation",
    "customer",
    "customfield"
})
public class ManagePaymentMethod implements IRequest {

    @XmlElement(name = "Api")
    protected String api = "";
    @XmlElement(name = "Safekey")
    protected String safekey = "";
    @XmlSchemaType(name = "string")
    protected ManagePaymentMethodType managePaymentMethodType;
    @XmlElement(name = "AdditionalInformation")
    protected AdditionalInfo additionalInformation;
    @XmlElement(name = "Customer")
    protected Customer customer;
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
     * @return ManagePaymentMethod    
     */
    public ManagePaymentMethod setApi(String value) {
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
     * @return ManagePaymentMethod    
     */
    public ManagePaymentMethod setSafekey(String value) {
        this.safekey = value;

        return this;
    }

    /**
     * Gets the value of the managePaymentMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link ManagePaymentMethodType }
     *     
     */
    public ManagePaymentMethodType getManagePaymentMethodType() {
        return managePaymentMethodType;
    }

    /**
     * Sets the value of the managePaymentMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagePaymentMethodType }
     * @return ManagePaymentMethod    
     */
    public ManagePaymentMethod setManagePaymentMethodType(ManagePaymentMethodType value) {
        this.managePaymentMethodType = value;

        return this;
    }

    /**
     * Gets the value of the additionalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInfo }
     *     
     */
    public AdditionalInfo getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets the value of the additionalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInfo }
     * @return ManagePaymentMethod    
     */
    public ManagePaymentMethod setAdditionalInformation(AdditionalInfo value) {
        this.additionalInformation = value;

        return this;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     * @return ManagePaymentMethod    
     */
    public ManagePaymentMethod setCustomer(Customer value) {
        this.customer = value;

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
        if(getAdditionalInformation() != null)
            return getAdditionalInformation().getSupportedPaymentMethods();

        return null;
    }

    @Override
    public ManagePaymentMethod setSupportedPaymentMethods(String value) {
        if(getAdditionalInformation() == null) {
            additionalInformation = new AdditionalInfo();
        }
        additionalInformation.setSupportedPaymentMethods(value);

        return this;
    }
}
