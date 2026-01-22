
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for secure3D complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="secure3D">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="secure3DId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secure3DUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "secure3D", propOrder = {
    "secure3DId",
    "secure3DUrl"
})
public class Secure3D {

    protected String secure3DId;
    protected String secure3DUrl;

    /**
     * Gets the value of the secure3DId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecure3DId() {
        return secure3DId;
    }

    /**
     * Sets the value of the secure3DId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Secure3D    
     */
    public Secure3D setSecure3DId(String value) {
        this.secure3DId = value;

        return this;
    }

    /**
     * Gets the value of the secure3DUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecure3DUrl() {
        return secure3DUrl;
    }

    /**
     * Sets the value of the secure3DUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Secure3D    
     */
    public Secure3D setSecure3DUrl(String value) {
        this.secure3DUrl = value;

        return this;
    }

}
