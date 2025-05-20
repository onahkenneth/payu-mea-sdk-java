
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for soulstace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="soulstace">
 *   &lt;complexContent>
 *     &lt;extension base="{http://soap.api.controller.web.payjar.com/}iPaymentMethod">
 *       &lt;sequence>
 *         &lt;element name="amountInCents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="basketAmountInCents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="basketCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="basketDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerContactNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerTrxRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ibsLoggerUpdateReferenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mcaCustomerCareGetProductsResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mcaCustomerCareGetProductsResultMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mcaLoggerUpdateResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mcaLoggerUpdateResultMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mcaRtppPaymentResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mcaRtppPaymentResultMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payuMerchantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectedEwalletForPayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soulsticeISwitchSubQueryBankCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soulsticeISwitchSubQueryResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soulsticeISwitchSubQueryResultMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soulsticePaymentTransactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soulsticeSubmitPaymentResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soulsticeSubmitPaymentResultMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soulsticeUmmDataHolderResponseMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soulsticeUmmDataHolderResultCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "soulstace", propOrder = {
    "amountInCents",
    "basketAmountInCents",
    "basketCurrency",
    "basketDescription",
    "customerContactNumber",
    "customerEmail",
    "customerFirstName",
    "customerId",
    "customerLastName",
    "customerTrxRef",
    "ibsLoggerUpdateReferenceId",
    "mcaCustomerCareGetProductsResultCode",
    "mcaCustomerCareGetProductsResultMsg",
    "mcaLoggerUpdateResultCode",
    "mcaLoggerUpdateResultMsg",
    "mcaRtppPaymentResultCode",
    "mcaRtppPaymentResultMsg",
    "paymentChannel",
    "payuMerchantId",
    "selectedEwalletForPayment",
    "soulsticeISwitchSubQueryBankCount",
    "soulsticeISwitchSubQueryResultCode",
    "soulsticeISwitchSubQueryResultMsg",
    "soulsticePaymentTransactionId",
    "soulsticeSubmitPaymentResultCode",
    "soulsticeSubmitPaymentResultMsg",
    "soulsticeUmmDataHolderResponseMsg",
    "soulsticeUmmDataHolderResultCode",
    "transactionDate",
    "transactionReference",
    "transactionStatus",
    "transactionStatusDescription",
    "transactionType"
})
public class Soulstace
    extends IPaymentMethod
{

    protected String amountInCents;
    protected String basketAmountInCents;
    protected String basketCurrency;
    protected String basketDescription;
    protected String customerContactNumber;
    protected String customerEmail;
    protected String customerFirstName;
    protected String customerId;
    protected String customerLastName;
    protected String customerTrxRef;
    protected String ibsLoggerUpdateReferenceId;
    protected String mcaCustomerCareGetProductsResultCode;
    protected String mcaCustomerCareGetProductsResultMsg;
    protected String mcaLoggerUpdateResultCode;
    protected String mcaLoggerUpdateResultMsg;
    protected String mcaRtppPaymentResultCode;
    protected String mcaRtppPaymentResultMsg;
    protected String paymentChannel;
    protected String payuMerchantId;
    protected String selectedEwalletForPayment;
    protected String soulsticeISwitchSubQueryBankCount;
    protected String soulsticeISwitchSubQueryResultCode;
    protected String soulsticeISwitchSubQueryResultMsg;
    protected String soulsticePaymentTransactionId;
    protected String soulsticeSubmitPaymentResultCode;
    protected String soulsticeSubmitPaymentResultMsg;
    protected String soulsticeUmmDataHolderResponseMsg;
    protected String soulsticeUmmDataHolderResultCode;
    protected String transactionDate;
    protected String transactionReference;
    protected String transactionStatus;
    protected String transactionStatusDescription;
    protected String transactionType;

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
     * @return Soulstace    
     */
    public Soulstace setAmountInCents(String value) {
        this.amountInCents = value;

        return this;
    }

    /**
     * Gets the value of the basketAmountInCents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasketAmountInCents() {
        return basketAmountInCents;
    }

    /**
     * Sets the value of the basketAmountInCents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setBasketAmountInCents(String value) {
        this.basketAmountInCents = value;

        return this;
    }

    /**
     * Gets the value of the basketCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasketCurrency() {
        return basketCurrency;
    }

    /**
     * Sets the value of the basketCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setBasketCurrency(String value) {
        this.basketCurrency = value;

        return this;
    }

    /**
     * Gets the value of the basketDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasketDescription() {
        return basketDescription;
    }

    /**
     * Sets the value of the basketDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setBasketDescription(String value) {
        this.basketDescription = value;

        return this;
    }

    /**
     * Gets the value of the customerContactNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerContactNumber() {
        return customerContactNumber;
    }

    /**
     * Sets the value of the customerContactNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setCustomerContactNumber(String value) {
        this.customerContactNumber = value;

        return this;
    }

    /**
     * Gets the value of the customerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * Sets the value of the customerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setCustomerEmail(String value) {
        this.customerEmail = value;

        return this;
    }

    /**
     * Gets the value of the customerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * Sets the value of the customerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setCustomerFirstName(String value) {
        this.customerFirstName = value;

        return this;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setCustomerId(String value) {
        this.customerId = value;

        return this;
    }

    /**
     * Gets the value of the customerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Sets the value of the customerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setCustomerLastName(String value) {
        this.customerLastName = value;

        return this;
    }

    /**
     * Gets the value of the customerTrxRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTrxRef() {
        return customerTrxRef;
    }

    /**
     * Sets the value of the customerTrxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setCustomerTrxRef(String value) {
        this.customerTrxRef = value;

        return this;
    }

    /**
     * Gets the value of the ibsLoggerUpdateReferenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbsLoggerUpdateReferenceId() {
        return ibsLoggerUpdateReferenceId;
    }

    /**
     * Sets the value of the ibsLoggerUpdateReferenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setIbsLoggerUpdateReferenceId(String value) {
        this.ibsLoggerUpdateReferenceId = value;

        return this;
    }

    /**
     * Gets the value of the mcaCustomerCareGetProductsResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcaCustomerCareGetProductsResultCode() {
        return mcaCustomerCareGetProductsResultCode;
    }

    /**
     * Sets the value of the mcaCustomerCareGetProductsResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setMcaCustomerCareGetProductsResultCode(String value) {
        this.mcaCustomerCareGetProductsResultCode = value;

        return this;
    }

    /**
     * Gets the value of the mcaCustomerCareGetProductsResultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcaCustomerCareGetProductsResultMsg() {
        return mcaCustomerCareGetProductsResultMsg;
    }

    /**
     * Sets the value of the mcaCustomerCareGetProductsResultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setMcaCustomerCareGetProductsResultMsg(String value) {
        this.mcaCustomerCareGetProductsResultMsg = value;

        return this;
    }

    /**
     * Gets the value of the mcaLoggerUpdateResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcaLoggerUpdateResultCode() {
        return mcaLoggerUpdateResultCode;
    }

    /**
     * Sets the value of the mcaLoggerUpdateResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setMcaLoggerUpdateResultCode(String value) {
        this.mcaLoggerUpdateResultCode = value;

        return this;
    }

    /**
     * Gets the value of the mcaLoggerUpdateResultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcaLoggerUpdateResultMsg() {
        return mcaLoggerUpdateResultMsg;
    }

    /**
     * Sets the value of the mcaLoggerUpdateResultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setMcaLoggerUpdateResultMsg(String value) {
        this.mcaLoggerUpdateResultMsg = value;

        return this;
    }

    /**
     * Gets the value of the mcaRtppPaymentResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcaRtppPaymentResultCode() {
        return mcaRtppPaymentResultCode;
    }

    /**
     * Sets the value of the mcaRtppPaymentResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setMcaRtppPaymentResultCode(String value) {
        this.mcaRtppPaymentResultCode = value;

        return this;
    }

    /**
     * Gets the value of the mcaRtppPaymentResultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcaRtppPaymentResultMsg() {
        return mcaRtppPaymentResultMsg;
    }

    /**
     * Sets the value of the mcaRtppPaymentResultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setMcaRtppPaymentResultMsg(String value) {
        this.mcaRtppPaymentResultMsg = value;

        return this;
    }

    /**
     * Gets the value of the paymentChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentChannel() {
        return paymentChannel;
    }

    /**
     * Sets the value of the paymentChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setPaymentChannel(String value) {
        this.paymentChannel = value;

        return this;
    }

    /**
     * Gets the value of the payuMerchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayuMerchantId() {
        return payuMerchantId;
    }

    /**
     * Sets the value of the payuMerchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setPayuMerchantId(String value) {
        this.payuMerchantId = value;

        return this;
    }

    /**
     * Gets the value of the selectedEwalletForPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedEwalletForPayment() {
        return selectedEwalletForPayment;
    }

    /**
     * Sets the value of the selectedEwalletForPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setSelectedEwalletForPayment(String value) {
        this.selectedEwalletForPayment = value;

        return this;
    }

    /**
     * Gets the value of the soulsticeISwitchSubQueryBankCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoulsticeISwitchSubQueryBankCount() {
        return soulsticeISwitchSubQueryBankCount;
    }

    /**
     * Sets the value of the soulsticeISwitchSubQueryBankCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setSoulsticeISwitchSubQueryBankCount(String value) {
        this.soulsticeISwitchSubQueryBankCount = value;

        return this;
    }

    /**
     * Gets the value of the soulsticeISwitchSubQueryResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoulsticeISwitchSubQueryResultCode() {
        return soulsticeISwitchSubQueryResultCode;
    }

    /**
     * Sets the value of the soulsticeISwitchSubQueryResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setSoulsticeISwitchSubQueryResultCode(String value) {
        this.soulsticeISwitchSubQueryResultCode = value;

        return this;
    }

    /**
     * Gets the value of the soulsticeISwitchSubQueryResultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoulsticeISwitchSubQueryResultMsg() {
        return soulsticeISwitchSubQueryResultMsg;
    }

    /**
     * Sets the value of the soulsticeISwitchSubQueryResultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setSoulsticeISwitchSubQueryResultMsg(String value) {
        this.soulsticeISwitchSubQueryResultMsg = value;

        return this;
    }

    /**
     * Gets the value of the soulsticePaymentTransactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoulsticePaymentTransactionId() {
        return soulsticePaymentTransactionId;
    }

    /**
     * Sets the value of the soulsticePaymentTransactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setSoulsticePaymentTransactionId(String value) {
        this.soulsticePaymentTransactionId = value;

        return this;
    }

    /**
     * Gets the value of the soulsticeSubmitPaymentResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoulsticeSubmitPaymentResultCode() {
        return soulsticeSubmitPaymentResultCode;
    }

    /**
     * Sets the value of the soulsticeSubmitPaymentResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setSoulsticeSubmitPaymentResultCode(String value) {
        this.soulsticeSubmitPaymentResultCode = value;

        return this;
    }

    /**
     * Gets the value of the soulsticeSubmitPaymentResultMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoulsticeSubmitPaymentResultMsg() {
        return soulsticeSubmitPaymentResultMsg;
    }

    /**
     * Sets the value of the soulsticeSubmitPaymentResultMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setSoulsticeSubmitPaymentResultMsg(String value) {
        this.soulsticeSubmitPaymentResultMsg = value;

        return this;
    }

    /**
     * Gets the value of the soulsticeUmmDataHolderResponseMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoulsticeUmmDataHolderResponseMsg() {
        return soulsticeUmmDataHolderResponseMsg;
    }

    /**
     * Sets the value of the soulsticeUmmDataHolderResponseMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setSoulsticeUmmDataHolderResponseMsg(String value) {
        this.soulsticeUmmDataHolderResponseMsg = value;

        return this;
    }

    /**
     * Gets the value of the soulsticeUmmDataHolderResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoulsticeUmmDataHolderResultCode() {
        return soulsticeUmmDataHolderResultCode;
    }

    /**
     * Sets the value of the soulsticeUmmDataHolderResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setSoulsticeUmmDataHolderResultCode(String value) {
        this.soulsticeUmmDataHolderResultCode = value;

        return this;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setTransactionDate(String value) {
        this.transactionDate = value;

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
     * @return Soulstace    
     */
    public Soulstace setTransactionReference(String value) {
        this.transactionReference = value;

        return this;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setTransactionStatus(String value) {
        this.transactionStatus = value;

        return this;
    }

    /**
     * Gets the value of the transactionStatusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionStatusDescription() {
        return transactionStatusDescription;
    }

    /**
     * Sets the value of the transactionStatusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setTransactionStatusDescription(String value) {
        this.transactionStatusDescription = value;

        return this;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return Soulstace    
     */
    public Soulstace setTransactionType(String value) {
        this.transactionType = value;

        return this;
    }

}
