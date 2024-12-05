
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bankTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bankTransfer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.api.controller.web.payjar.com/}iPaymentMethod">
 *       &lt;sequence>
 *         &lt;element name="accountHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountInCents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clearanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bankTransfer", propOrder = {
    "accountHolder",
    "accountNumber",
    "accountType",
    "actionDate",
    "amountInCents",
    "branchCode",
    "clearanceDate"
})
public class BankTransfer
    extends IPaymentMethod
{

    protected String accountHolder;
    protected String accountNumber;
    protected String accountType;
    protected String actionDate;
    protected String amountInCents;
    protected String branchCode;
    protected String clearanceDate;

    /**
     * Gets the value of the accountHolder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * Sets the value of the accountHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return BankTransfer    
     */
    public BankTransfer setAccountHolder(String value) {
        this.accountHolder = value;

        return this;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return BankTransfer     
     */
    public BankTransfer setAccountNumber(String value) {
        this.accountNumber = value;

        return this;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return BankTransfer    
     */
    public BankTransfer setAccountType(String value) {
        this.accountType = value;

        return this;
    }

    /**
     * Gets the value of the actionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionDate() {
        return actionDate;
    }

    /**
     * Sets the value of the actionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return BankTransfer    
     */
    public BankTransfer setActionDate(String value) {
        this.actionDate = value;

        return this;
    }

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
     * @return BankTransfer    
     */
    public BankTransfer setAmountInCents(String value) {
        this.amountInCents = value;

        return this;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return BankTransfer    
     */
    public BankTransfer setBranchCode(String value) {
        this.branchCode = value;

        return this;
    }

    /**
     * Gets the value of the clearanceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearanceDate() {
        return clearanceDate;
    }

    /**
     * Sets the value of the clearanceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return BankTransfer    
     */
    public BankTransfer setClearanceDate(String value) {
        this.clearanceDate = value;

        return this;
    }

}
