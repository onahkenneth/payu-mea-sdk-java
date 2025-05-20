
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eftBankTransfer complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="eftBankTransfer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.api.controller.web.payjar.com/}iPaymentMethod">
 *       &lt;sequence>
 *         &lt;element name="accountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amountInCents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eftBankTransfer", propOrder = {
        "accountName",
        "accountNumber",
        "amountInCents",
        "bankName",
        "transactionReference"
})
public class EftBankTransfer
        extends IPaymentMethod
{

    protected String accountName;
    protected String accountNumber;
    protected String amountInCents;
    protected String bankName;
    protected String transactionReference;

    /**
     * Gets the value of the accountName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     * @return EftBankTransfer
     */
    public EftBankTransfer setAccountName(String value) {
        this.accountName = value;

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
     * @return EftBankTransfer
     */
    public EftBankTransfer setAccountNumber(String value) {
        this.accountNumber = value;

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
     * @return EftBankTransfer
     */
    public EftBankTransfer setAmountInCents(String value) {
        this.amountInCents = value;

        return this;
    }

    /**
     * Gets the value of the bankName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     * @return EftBankTransfer
     */
    public EftBankTransfer setBankName(String value) {
        this.bankName = value;

        return this;
    }

    /**
     * Gets the value of the transactionReference property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransactionReference() {
        return transactionReference;
    }

    /**
     * Sets the value of the transactionReference property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     * @return EftBankTransfer
     */
    public EftBankTransfer setTransactionReference(String value) {
        this.transactionReference = value;

        return this;
    }

}
