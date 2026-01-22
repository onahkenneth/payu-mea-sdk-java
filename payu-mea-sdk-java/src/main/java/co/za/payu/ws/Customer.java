
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customer">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.payu.co.za/PayUMapLoader}PayUMapLoader">
 *       &lt;sequence>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="known" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="merchantUserId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionalIdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "address1",
    "address2",
    "addressCity",
    "countryCode",
    "countryOfResidence",
    "dob",
    "email",
    "firstName",
    "ip",
    "known",
    "language",
    "lastName",
    "merchantUserId",
    "mobile",
    "postCode",
    "regionalId",
    "regionalIdType",
    "stateCode"
})
public class Customer
    extends PayUMapLoader
{

    protected String address1;
    protected String address2;
    protected String addressCity;
    protected String countryCode;
    protected String countryOfResidence;
    protected String dob;
    protected String email;
    protected String firstName;
    protected String ip;
    protected String known;
    protected String language;
    protected String lastName;
    protected String merchantUserId;
    protected String mobile;
    protected String postCode;
    protected String regionalId;
    protected String regionalIdType;
    protected String stateCode;

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setAddress1(String value) {
        this.address1 = value;

        return this;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setAddress2(String value) {
        this.address2 = value;

        return this;
    }

    /**
     * Gets the value of the addressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * Sets the value of the addressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setAddressCity(String value) {
        this.addressCity = value;

        return this;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setCountryCode(String value) {
        this.countryCode = value;

        return this;
    }

    /**
     * Gets the value of the countryOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * Sets the value of the countryOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setCountryOfResidence(String value) {
        this.countryOfResidence = value;

        return this;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setDob(String value) {
        this.dob = value;

        return this;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setEmail(String value) {
        this.email = value;

        return this;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setFirstName(String value) {
        this.firstName = value;

        return this;
    }

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setIp(String value) {
        this.ip = value;

        return this;
    }

    /**
     * Gets the value of the known property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKnown() {
        return known;
    }

    /**
     * Sets the value of the known property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setKnown(String value) {
        this.known = value;

        return this;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setLanguage(String value) {
        this.language = value;

        return this;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setLastName(String value) {
        this.lastName = value;

        return this;
    }

    /**
     * Gets the value of the merchantUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantUserId() {
        return merchantUserId;
    }

    /**
     * Sets the value of the merchantUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setMerchantUserId(String value) {
        this.merchantUserId = value;

        return this;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setMobile(String value) {
        this.mobile = value;

        return this;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setPostCode(String value) {
        this.postCode = value;

        return this;
    }

    /**
     * Gets the value of the regionalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionalId() {
        return regionalId;
    }

    /**
     * Sets the value of the regionalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setRegionalId(String value) {
        this.regionalId = value;

        return this;
    }

    /**
     * Gets the value of the regionalIdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionalIdType() {
        return regionalIdType;
    }

    /**
     * Sets the value of the regionalIdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return  Customer
     */
    public Customer setRegionalIdType(String value) {
        this.regionalIdType = value;

        return this;
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Customer
     */
    public Customer setStateCode(String value) {
        this.stateCode = value;

        return this;
    }
}
