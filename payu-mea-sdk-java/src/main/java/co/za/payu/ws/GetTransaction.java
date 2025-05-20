
package co.za.payu.ws;

import co.za.payu.api.IRequest;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Safekey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation" type="{http://soap.api.controller.web.payjar.com/}additionalInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTransaction", propOrder = {
    "api",
    "safekey",
    "additionalInformation"
})
public class GetTransaction implements IRequest {

    @XmlElement(name = "Api")
    protected String api = "";
    @XmlElement(name = "Safekey")
    protected String safekey = "";
    @XmlElement(name = "AdditionalInformation")
    protected AdditionalInfo additionalInformation;

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
     * @return GetTransaction    
     */
    public GetTransaction setApi(String value) {
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
     * @return GetTransaction    
     */
    public GetTransaction setSafekey(String value) {
        this.safekey = value;

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
     * @return GetTransaction    
     */
    public GetTransaction setAdditionalInformation(AdditionalInfo value) {
        this.additionalInformation = value;

        return this;
    }

    @Override
    public String getSupportedPaymentMethods() {
        if(getAdditionalInformation() != null)
            return getAdditionalInformation().getSupportedPaymentMethods();

        return null;
    }

    @Override
    public GetTransaction setSupportedPaymentMethods(String value) {
        if(getAdditionalInformation() == null) {
            additionalInformation = new AdditionalInfo();
        }
        additionalInformation.setSupportedPaymentMethods(value);

        return this;
    }
}
