
package co.za.payu.ws;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for basket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="basket">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.payu.co.za/PayUMapLoader}PayUMapLoader">
 *       &lt;sequence>
 *         &lt;element name="amountInCents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productLineItem" type="{http://soap.api.controller.web.payjar.com/}productLineItem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shippingDetails" type="{http://soap.api.controller.web.payjar.com/}shippingDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "basket", propOrder = {
    "amountInCents",
    "currencyCode",
    "description",
    "productLineItem",
    "shippingDetails"
})
public class Basket
    extends PayUMapLoader
{

    protected String amountInCents;
    protected String currencyCode;
    protected String description;
    @XmlElement(nillable = true)
    protected List<ProductLineItem> productLineItem;
    protected ShippingDetails shippingDetails;

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
     * @return Basket    
     */
    public Basket setAmountInCents(String value) {
        this.amountInCents = value;

        return this;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Basket    
     */
    public Basket setCurrencyCode(String value) {
        this.currencyCode = value;

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
     * @return Basket    
     */
    public Basket setDescription(String value) {
        this.description = value;

        return this;
    }

    /**
     * Gets the value of the productLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductLineItem }
     * 
     * 
     */
    public List<ProductLineItem> getProductLineItem() {
        if (productLineItem == null) {
            productLineItem = new ArrayList<ProductLineItem>();
        }
        return this.productLineItem;
    }

    /**
     * Gets the value of the shippingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDetails }
     *     
     */
    public ShippingDetails getShippingDetails() {
        return shippingDetails;
    }

    /**
     * Sets the value of the shippingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDetails }
     * @return Basket    
     */
    public Basket setShippingDetails(ShippingDetails value) {
        this.shippingDetails = value;

        return this;
    }

}
