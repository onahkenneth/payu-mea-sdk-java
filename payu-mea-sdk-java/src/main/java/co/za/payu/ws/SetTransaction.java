
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
 * <p>Java class for setTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Api" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Safekey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://soap.api.controller.web.payjar.com/}transactionType" minOccurs="0"/>
 *         &lt;element name="Stage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AdditionalInformation" type="{http://soap.api.controller.web.payjar.com/}additionalInfo" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://soap.api.controller.web.payjar.com/}customer" minOccurs="0"/>
 *         &lt;element name="Basket" type="{http://soap.api.controller.web.payjar.com/}basket" minOccurs="0"/>
 *         &lt;element name="Fraud" type="{http://soap.api.controller.web.payjar.com/}fraud" minOccurs="0"/>
 *         &lt;element name="Creditcard" type="{http://soap.api.controller.web.payjar.com/}creditCard" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Eft" type="{http://soap.api.controller.web.payjar.com/}eft" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Loyalty" type="{http://soap.api.controller.web.payjar.com/}loyaltyCard" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BankTransfer" type="{http://soap.api.controller.web.payjar.com/}bankTransfer" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Ebucks" type="{http://soap.api.controller.web.payjar.com/}ebucks" minOccurs="0"/>
 *         &lt;element name="Autopay" type="{http://soap.api.controller.web.payjar.com/}autoPay" minOccurs="0"/>
 *         &lt;element name="Soulstace" type="{http://soap.api.controller.web.payjar.com/}soulstace" minOccurs="0"/>
 *         &lt;element name="Globalpay" type="{http://soap.api.controller.web.payjar.com/}globalpay" minOccurs="0"/>
 *         &lt;element name="Customfield" type="{http://soap.api.controller.web.payjar.com/}customField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TransactionRecord" type="{http://soap.api.controller.web.payjar.com/}transactionRecord" minOccurs="0"/>
 *         &lt;element name="EWallet" type="{http://soap.api.controller.web.payjar.com/}eWallet" minOccurs="0"/>
 *         &lt;element name="Mobicred" type="{http://soap.api.controller.web.payjar.com/}mobicred" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setTransaction", propOrder = {
    "api",
    "safekey",
    "transactionType",
    "stage",
    "additionalInformation",
    "customer",
    "basket",
    "fraud",
    "creditcard",
    "eft",
    "loyalty",
    "bankTransfer",
    "ebucks",
    "autopay",
    "soulstace",
    "globalpay",
    "customfield",
    "transactionRecord",
    "eWallet",
    "mobicred"
})
public class SetTransaction implements IRequest {

    @XmlElement(name = "Api")
    protected String api = "";
    @XmlElement(name = "Safekey")
    protected String safekey = "";
    @XmlElement(name = "TransactionType")
    @XmlSchemaType(name = "string")
    protected TransactionType transactionType;
    @XmlElement(name = "Stage")
    protected Boolean stage;
    @XmlElement(name = "AdditionalInformation")
    protected AdditionalInfo additionalInformation;
    @XmlElement(name = "Customer")
    protected Customer customer;
    @XmlElement(name = "Basket")
    protected Basket basket;
    @XmlElement(name = "Fraud")
    protected Fraud fraud;
    @XmlElement(name = "Creditcard")
    protected List<CreditCard> creditcard;
    @XmlElement(name = "Eft")
    protected List<Eft> eft;
    @XmlElement(name = "Loyalty")
    protected List<LoyaltyCard> loyalty;
    @XmlElement(name = "BankTransfer")
    protected List<BankTransfer> bankTransfer;
    @XmlElement(name = "Ebucks")
    protected Ebucks ebucks;
    @XmlElement(name = "Autopay")
    protected AutoPay autopay;
    @XmlElement(name = "Soulstace")
    protected Soulstace soulstace;
    @XmlElement(name = "Globalpay")
    protected Globalpay globalpay;
    @XmlElement(name = "Customfield")
    protected List<CustomField> customfield;
    @XmlElement(name = "TransactionRecord")
    protected TransactionRecord transactionRecord;
    @XmlElement(name = "EWallet")
    protected EWallet eWallet;
    @XmlElement(name = "Mobicred")
    protected List<Mobicred> mobicred;

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
     * @return SetTransaction    
     */
    public SetTransaction setApi(String value) {
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
     * @return SetTransaction    
     */
    public SetTransaction setSafekey(String value) {
        this.safekey = value;

        return this;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     * @return SetTransaction    
     */
    public SetTransaction setTransactionType(TransactionType value) {
        this.transactionType = value;

        return this;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     * @return SetTransaction    
     */
    public SetTransaction setStage(Boolean value) {
        this.stage = value;

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
     * @return SetTransaction    
     */
    public SetTransaction setAdditionalInformation(AdditionalInfo value) {
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
     * @return SetTransaction    
     */
    public SetTransaction setCustomer(Customer value) {
        this.customer = value;

        return this;
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
     * @return SetTransaction    
     */
    public SetTransaction setBasket(Basket value) {
        this.basket = value;

        return this;
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
     * @return SetTransaction    
     */
    public SetTransaction setFraud(Fraud value) {
        this.fraud = value;

        return this;
    }

    /**
     * Gets the value of the creditcard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditcard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditcard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCard }
     * 
     * 
     */
    public List<CreditCard> getCreditcard() {
        if (creditcard == null) {
            creditcard = new ArrayList<CreditCard>();
        }
        return this.creditcard;
    }

    /**
     * Gets the value of the eft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Eft }
     * 
     * 
     */
    public List<Eft> getEft() {
        if (eft == null) {
            eft = new ArrayList<Eft>();
        }
        return this.eft;
    }

    /**
     * Gets the value of the loyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyCard }
     * 
     * 
     */
    public List<LoyaltyCard> getLoyalty() {
        if (loyalty == null) {
            loyalty = new ArrayList<LoyaltyCard>();
        }
        return this.loyalty;
    }

    /**
     * Gets the value of the bankTransfer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankTransfer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankTransfer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankTransfer }
     * 
     * 
     */
    public List<BankTransfer> getBankTransfer() {
        if (bankTransfer == null) {
            bankTransfer = new ArrayList<BankTransfer>();
        }
        return this.bankTransfer;
    }

    /**
     * Gets the value of the ebucks property.
     * 
     * @return
     *     possible object is
     *     {@link Ebucks }
     *     
     */
    public Ebucks getEbucks() {
        return ebucks;
    }

    /**
     * Sets the value of the ebucks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ebucks }
     * @return SetTransaction    
     */
    public SetTransaction setEbucks(Ebucks value) {
        this.ebucks = value;

        return this;
    }

    /**
     * Gets the value of the autopay property.
     * 
     * @return
     *     possible object is
     *     {@link AutoPay }
     *     
     */
    public AutoPay getAutopay() {
        return autopay;
    }

    /**
     * Sets the value of the autopay property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoPay }
     * @return SetTransaction    
     */
    public SetTransaction setAutopay(AutoPay value) {
        this.autopay = value;

        return this;
    }

    /**
     * Gets the value of the soulstace property.
     * 
     * @return
     *     possible object is
     *     {@link Soulstace }
     *     
     */
    public Soulstace getSoulstace() {
        return soulstace;
    }

    /**
     * Sets the value of the soulstace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Soulstace }
     * @return SetTransaction    
     */
    public SetTransaction setSoulstace(Soulstace value) {
        this.soulstace = value;

        return this;
    }

    /**
     * Gets the value of the globalpay property.
     * 
     * @return
     *     possible object is
     *     {@link Globalpay }
     *     
     */
    public Globalpay getGlobalpay() {
        return globalpay;
    }

    /**
     * Sets the value of the globalpay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Globalpay }
     * @return SetTransaction    
     */
    public SetTransaction setGlobalpay(Globalpay value) {
        this.globalpay = value;

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

    /**
     * Gets the value of the transactionRecord property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionRecord }
     *     
     */
    public TransactionRecord getTransactionRecord() {
        return transactionRecord;
    }

    /**
     * Sets the value of the transactionRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionRecord }
     * @return SetTransaction    
     */
    public SetTransaction setTransactionRecord(TransactionRecord value) {
        this.transactionRecord = value;

        return this;
    }

    /**
     * Gets the value of the eWallet property.
     * 
     * @return
     *     possible object is
     *     {@link EWallet }
     *     
     */
    public EWallet getEWallet() {
        return eWallet;
    }

    /**
     * Sets the value of the eWallet property.
     * 
     * @param value
     *     allowed object is
     *     {@link EWallet }
     * @return SetTransaction    
     */
    public SetTransaction setEWallet(EWallet value) {
        this.eWallet = value;

        return this;
    }

    /**
     * Gets the value of the mobicred property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobicred property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobicred().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mobicred }
     * 
     * 
     */
    public List<Mobicred> getMobicred() {
        if (mobicred == null) {
            mobicred = new ArrayList<Mobicred>();
        }
        return this.mobicred;
    }

    @Override
    public String getSupportedPaymentMethods() {
        if(getAdditionalInformation() != null)
            return getAdditionalInformation().getSupportedPaymentMethods();

        return null;
    }

    @Override
    public SetTransaction setSupportedPaymentMethods(String value) {
        if(getAdditionalInformation() == null) {
            additionalInformation = new AdditionalInfo();
        }
        additionalInformation.setSupportedPaymentMethods(value);

        return this;
    }
}
