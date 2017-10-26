
package co.za.payu.ws;

import co.za.payu.api.IResponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoTransactionResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoTransactionResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.payu.co.za/PayUMapLoader}PayUMapLoader">
 *       &lt;sequence>
 *         &lt;element name="bankDepositDetails" type="{http://soap.api.controller.web.payjar.com/}bankDepositDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="basket" type="{http://soap.api.controller.web.payjar.com/}basket" minOccurs="0"/>
 *         &lt;element name="customFields" type="{http://soap.api.controller.web.payjar.com/}customField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="displayMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraud" type="{http://soap.api.controller.web.payjar.com/}fraud" minOccurs="0"/>
 *         &lt;element name="merchantReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payUReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentMethodsUsed" type="{http://soap.api.controller.web.payjar.com/}iPaymentMethod" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pointOfFailure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurringDetails" type="{http://soap.api.controller.web.payjar.com/}recurringDetails" minOccurs="0"/>
 *         &lt;element name="redirect" type="{http://soap.api.controller.web.payjar.com/}redirect" minOccurs="0"/>
 *         &lt;element name="requestTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secure3D" type="{http://soap.api.controller.web.payjar.com/}secure3D" minOccurs="0"/>
 *         &lt;element name="stage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="successful" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoTransactionResponseMessage", namespace = "https://www.payu.co.za/DoTransactionResponseMessage", propOrder = {
    "bankDepositDetails",
    "basket",
    "customFields",
    "displayMessage",
    "fraud",
    "merchantReference",
    "payUReference",
    "paymentMethodsUsed",
    "pointOfFailure",
    "recurringDetails",
    "redirect",
    "requestTrace",
    "resultCode",
    "resultMessage",
    "secure3D",
    "stage",
    "successful"
})
public class DoTransactionResponseMessage
    extends PayUMapLoader implements IResponse
{

    @XmlElement(nillable = true)
    protected List<BankDepositDetails> bankDepositDetails;
    protected Basket basket;
    @XmlElement(nillable = true)
    protected List<CustomField> customFields;
    protected String displayMessage;
    protected Fraud fraud;
    protected String merchantReference;
    protected String payUReference;
    @XmlElement(nillable = true)
    protected List<IPaymentMethod> paymentMethodsUsed;
    protected String pointOfFailure;
    protected RecurringDetails recurringDetails;
    protected Redirect redirect;
    protected String requestTrace;
    protected String resultCode;
    protected String resultMessage;
    protected Secure3D secure3D;
    protected String stage;
    protected boolean successful;

    /**
     * Gets the value of the bankDepositDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankDepositDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankDepositDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankDepositDetails }
     * 
     * 
     */
    public List<BankDepositDetails> getBankDepositDetails() {
        if (bankDepositDetails == null) {
            bankDepositDetails = new ArrayList<BankDepositDetails>();
        }
        return this.bankDepositDetails;
    }

    /**
     * Gets the value of the basket property.
     * 
     * @return
     *     possible object is
     *     {@link Basket }
     *     
     */
    public Basket getBasket() {
        return basket;
    }

    /**
     * Sets the value of the basket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Basket }
     *     
     */
    public void setBasket(Basket value) {
        this.basket = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomField }
     * 
     * 
     */
    public List<CustomField> getCustomFields() {
        if (customFields == null) {
            customFields = new ArrayList<CustomField>();
        }
        return this.customFields;
    }

    /**
     * Gets the value of the displayMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayMessage() {
        return displayMessage;
    }

    /**
     * Sets the value of the displayMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayMessage(String value) {
        this.displayMessage = value;
    }

    /**
     * Gets the value of the fraud property.
     * 
     * @return
     *     possible object is
     *     {@link Fraud }
     *     
     */
    public Fraud getFraud() {
        return fraud;
    }

    /**
     * Sets the value of the fraud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fraud }
     *     
     */
    public void setFraud(Fraud value) {
        this.fraud = value;
    }

    /**
     * Gets the value of the merchantReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantReference() {
        return merchantReference;
    }

    /**
     * Sets the value of the merchantReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantReference(String value) {
        this.merchantReference = value;
    }

    /**
     * Gets the value of the payUReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayUReference() {
        return payUReference;
    }

    /**
     * Sets the value of the payUReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayUReference(String value) {
        this.payUReference = value;
    }

    /**
     * Gets the value of the paymentMethodsUsed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethodsUsed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethodsUsed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPaymentMethod }
     * 
     * 
     */
    public List<IPaymentMethod> getPaymentMethodsUsed() {
        if (paymentMethodsUsed == null) {
            paymentMethodsUsed = new ArrayList<IPaymentMethod>();
        }
        return this.paymentMethodsUsed;
    }

    /**
     * Gets the value of the pointOfFailure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfFailure() {
        return pointOfFailure;
    }

    /**
     * Sets the value of the pointOfFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfFailure(String value) {
        this.pointOfFailure = value;
    }

    /**
     * Gets the value of the recurringDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringDetails }
     *     
     */
    public RecurringDetails getRecurringDetails() {
        return recurringDetails;
    }

    /**
     * Sets the value of the recurringDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringDetails }
     *     
     */
    public void setRecurringDetails(RecurringDetails value) {
        this.recurringDetails = value;
    }

    /**
     * Gets the value of the redirect property.
     * 
     * @return
     *     possible object is
     *     {@link Redirect }
     *     
     */
    public Redirect getRedirect() {
        return redirect;
    }

    /**
     * Sets the value of the redirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Redirect }
     *     
     */
    public void setRedirect(Redirect value) {
        this.redirect = value;
    }

    /**
     * Gets the value of the requestTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTrace() {
        return requestTrace;
    }

    /**
     * Sets the value of the requestTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTrace(String value) {
        this.requestTrace = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultCode(String value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultMessage() {
        return resultMessage;
    }

    /**
     * Sets the value of the resultMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultMessage(String value) {
        this.resultMessage = value;
    }

    /**
     * Gets the value of the secure3D property.
     * 
     * @return
     *     possible object is
     *     {@link Secure3D }
     *     
     */
    public Secure3D getSecure3D() {
        return secure3D;
    }

    /**
     * Sets the value of the secure3D property.
     * 
     * @param value
     *     allowed object is
     *     {@link Secure3D }
     *     
     */
    public void setSecure3D(Secure3D value) {
        this.secure3D = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStage(String value) {
        this.stage = value;
    }

    /**
     * Gets the value of the successful property.
     * 
     */
    public boolean isSuccessful() {
        return successful;
    }

    /**
     * Sets the value of the successful property.
     * 
     */
    public void setSuccessful(boolean value) {
        this.successful = value;
    }

}
