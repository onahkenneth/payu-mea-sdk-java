
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iPaymentMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iPaymentMethod">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.payu.co.za/PayUMapLoader}PayUMapLoader">
 *       &lt;sequence>
 *         &lt;element name="defaultPM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iPaymentMethod", propOrder = {
    "defaultPM",
    "pmId"
})
@XmlSeeAlso({
    AutoPay.class,
    Soulstace.class,
    Sbux.class,
    ThirdParty.class,
    BankDepositDetails.class,
    BankAccount.class,
    LoyaltyCard.class,
    Fraud.class,
    Globalpay.class,
    BankTransfer.class,
    Mobicred.class,
    EWalletMPesa.class,
    Sva.class,
    Rcs.class,
    Ebucks.class,
    DiscoveryMiles.class,
    EWallet.class,
    Eft.class,
    DebitCard.class,
    CreditCard.class,
    PayPal.class
})
public abstract class IPaymentMethod
    extends PayUMapLoader
{

    protected String defaultPM;
    protected String pmId;

    /**
     * Gets the value of the defaultPM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultPM() {
        return defaultPM;
    }

    /**
     * Sets the value of the defaultPM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultPM(String value) {
        this.defaultPM = value;
    }

    /**
     * Gets the value of the pmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmId() {
        return pmId;
    }

    /**
     * Sets the value of the pmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmId(String value) {
        this.pmId = value;
    }

}
