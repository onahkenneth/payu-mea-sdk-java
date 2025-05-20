
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for productLineItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productLineItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="giftMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientStateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shippingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productLineItem", propOrder = {
    "amount",
    "costAmount",
    "description",
    "giftMessage",
    "productCode",
    "quantity",
    "recipientAddress1",
    "recipientAddress2",
    "recipientCity",
    "recipientCountryCode",
    "recipientEmail",
    "recipientFirstName",
    "recipientLastName",
    "recipientPhone",
    "recipientPostalCode",
    "recipientStateCode",
    "shippingNumber",
    "sku"
})
public class ProductLineItem {

    protected String amount;
    protected String costAmount;
    protected String description;
    protected String giftMessage;
    protected String productCode;
    protected String quantity;
    protected String recipientAddress1;
    protected String recipientAddress2;
    protected String recipientCity;
    protected String recipientCountryCode;
    protected String recipientEmail;
    protected String recipientFirstName;
    protected String recipientLastName;
    protected String recipientPhone;
    protected String recipientPostalCode;
    protected String recipientStateCode;
    protected String shippingNumber;
    protected String sku;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setAmount(String value) {
        this.amount = value;

        return this;
    }

    /**
     * Gets the value of the costAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostAmount() {
        return costAmount;
    }

    /**
     * Sets the value of the costAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setCostAmount(String value) {
        this.costAmount = value;

        return this;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setDescription(String value) {
        this.description = value;

        return this;
    }

    /**
     * Gets the value of the giftMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftMessage() {
        return giftMessage;
    }

    /**
     * Sets the value of the giftMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setGiftMessage(String value) {
        this.giftMessage = value;

        return this;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setProductCode(String value) {
        this.productCode = value;

        return this;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setQuantity(String value) {
        this.quantity = value;

        return this;
    }

    /**
     * Gets the value of the recipientAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientAddress1() {
        return recipientAddress1;
    }

    /**
     * Sets the value of the recipientAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setRecipientAddress1(String value) {
        this.recipientAddress1 = value;

        return this;
    }

    /**
     * Gets the value of the recipientAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientAddress2() {
        return recipientAddress2;
    }

    /**
     * Sets the value of the recipientAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setRecipientAddress2(String value) {
        this.recipientAddress2 = value;

        return this;
    }

    /**
     * Gets the value of the recipientCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCity() {
        return recipientCity;
    }

    /**
     * Sets the value of the recipientCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setRecipientCity(String value) {
        this.recipientCity = value;

        return this;
    }

    /**
     * Gets the value of the recipientCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientCountryCode() {
        return recipientCountryCode;
    }

    /**
     * Sets the value of the recipientCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setRecipientCountryCode(String value) {
        this.recipientCountryCode = value;

        return this;
    }

    /**
     * Gets the value of the recipientEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientEmail() {
        return recipientEmail;
    }

    /**
     * Sets the value of the recipientEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setRecipientEmail(String value) {
        this.recipientEmail = value;

        return this;
    }

    /**
     * Gets the value of the recipientFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientFirstName() {
        return recipientFirstName;
    }

    /**
     * Sets the value of the recipientFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setRecipientFirstName(String value) {
        this.recipientFirstName = value;

        return this;
    }

    /**
     * Gets the value of the recipientLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientLastName() {
        return recipientLastName;
    }

    /**
     * Sets the value of the recipientLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setRecipientLastName(String value) {
        this.recipientLastName = value;

        return this;
    }

    /**
     * Gets the value of the recipientPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientPhone() {
        return recipientPhone;
    }

    /**
     * Sets the value of the recipientPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setRecipientPhone(String value) {
        this.recipientPhone = value;

        return this;
    }

    /**
     * Gets the value of the recipientPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientPostalCode() {
        return recipientPostalCode;
    }

    /**
     * Sets the value of the recipientPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setRecipientPostalCode(String value) {
        this.recipientPostalCode = value;

        return this;
    }

    /**
     * Gets the value of the recipientStateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientStateCode() {
        return recipientStateCode;
    }

    /**
     * Sets the value of the recipientStateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setRecipientStateCode(String value) {
        this.recipientStateCode = value;

        return this;
    }

    /**
     * Gets the value of the shippingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingNumber() {
        return shippingNumber;
    }

    /**
     * Sets the value of the shippingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setShippingNumber(String value) {
        this.shippingNumber = value;

        return this;
    }

    /**
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return ProductLineItem    
     */
    public ProductLineItem setSku(String value) {
        this.sku = value;

        return this;
    }

}
