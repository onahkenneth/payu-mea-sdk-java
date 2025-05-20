
package co.za.payu.ws;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.za.payu.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DoTransaction_QNAME = new QName("http://soap.api.controller.web.payjar.com/", "doTransaction");
    private final static QName _DoTransactionResponse_QNAME = new QName("http://soap.api.controller.web.payjar.com/", "doTransactionResponse");
    private final static QName _DoDeleteTransaction_QNAME = new QName("http://soap.api.controller.web.payjar.com/", "doDeleteTransaction");
    private final static QName _GetTransactionResponse_QNAME = new QName("http://soap.api.controller.web.payjar.com/", "getTransactionResponse");
    private final static QName _ManagePaymentMethodResponse_QNAME = new QName("http://soap.api.controller.web.payjar.com/", "managePaymentMethodResponse");
    private final static QName _SetTransaction_QNAME = new QName("http://soap.api.controller.web.payjar.com/", "setTransaction");
    private final static QName _ManagePaymentMethod_QNAME = new QName("http://soap.api.controller.web.payjar.com/", "managePaymentMethod");
    private final static QName _GetTransaction_QNAME = new QName("http://soap.api.controller.web.payjar.com/", "getTransaction");
    private final static QName _DoDeleteTransactionResponse_QNAME = new QName("http://soap.api.controller.web.payjar.com/", "doDeleteTransactionResponse");
    private final static QName _SetTransactionResponse_QNAME = new QName("http://soap.api.controller.web.payjar.com/", "setTransactionResponse");
    private final static QName _GetLookupTransaction_QNAME = new QName("http://soap.api.controller.web.payjar.com/", "getLookupTransaction");
    private final static QName _GetLookupTransactionResponse_QNAME = new QName("http://soap.api.controller.web.payjar.com/", "getLookupTransactionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.za.payu.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ManagePaymentMethodResponseMessage }
     * 
     */
    public ManagePaymentMethodResponseMessage createManagePaymentMethodResponseMessage() {
        return new ManagePaymentMethodResponseMessage();
    }

    /**
     * Create an instance of {@link ManagePaymentMethodResponseMessage.ManagePaymentMethodData }
     * 
     */
    public ManagePaymentMethodResponseMessage.ManagePaymentMethodData createManagePaymentMethodResponseMessageManagePaymentMethodData() {
        return new ManagePaymentMethodResponseMessage.ManagePaymentMethodData();
    }

    /**
     * Create an instance of {@link LookupTransactionResponseMessage }
     * 
     */
    public LookupTransactionResponseMessage createLookupTransactionResponseMessage() {
        return new LookupTransactionResponseMessage();
    }

    /**
     * Create an instance of {@link LookupTransactionResponseMessage.LookupData }
     * 
     */
    public LookupTransactionResponseMessage.LookupData createLookupTransactionResponseMessageLookupData() {
        return new LookupTransactionResponseMessage.LookupData();
    }

    /**
     * Create an instance of {@link SetTransactionResponseMessage }
     * 
     */
    public SetTransactionResponseMessage createSetTransactionResponseMessage() {
        return new SetTransactionResponseMessage();
    }

    /**
     * Create an instance of {@link GetTransactionResponseMessage }
     * 
     */
    public GetTransactionResponseMessage createGetTransactionResponseMessage() {
        return new GetTransactionResponseMessage();
    }

    /**
     * Create an instance of {@link DeleteTransactionResponseMessage }
     * 
     */
    public DeleteTransactionResponseMessage createDeleteTransactionResponseMessage() {
        return new DeleteTransactionResponseMessage();
    }

    /**
     * Create an instance of {@link DoTransactionResponseMessage }
     * 
     */
    public DoTransactionResponseMessage createDoTransactionResponseMessage() {
        return new DoTransactionResponseMessage();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link SetTransaction }
     * 
     */
    public SetTransaction createSetTransaction() {
        return new SetTransaction();
    }

    /**
     * Create an instance of {@link GetTransactionResponse }
     * 
     */
    public GetTransactionResponse createGetTransactionResponse() {
        return new GetTransactionResponse();
    }

    /**
     * Create an instance of {@link ManagePaymentMethodResponse }
     * 
     */
    public ManagePaymentMethodResponse createManagePaymentMethodResponse() {
        return new ManagePaymentMethodResponse();
    }

    /**
     * Create an instance of {@link DoDeleteTransaction }
     * 
     */
    public DoDeleteTransaction createDoDeleteTransaction() {
        return new DoDeleteTransaction();
    }

    /**
     * Create an instance of {@link DoTransaction }
     * 
     */
    public DoTransaction createDoTransaction() {
        return new DoTransaction();
    }

    /**
     * Create an instance of {@link DoTransactionResponse }
     * 
     */
    public DoTransactionResponse createDoTransactionResponse() {
        return new DoTransactionResponse();
    }

    /**
     * Create an instance of {@link SetTransactionResponse }
     * 
     */
    public SetTransactionResponse createSetTransactionResponse() {
        return new SetTransactionResponse();
    }

    /**
     * Create an instance of {@link DoDeleteTransactionResponse }
     * 
     */
    public DoDeleteTransactionResponse createDoDeleteTransactionResponse() {
        return new DoDeleteTransactionResponse();
    }

    /**
     * Create an instance of {@link GetLookupTransactionResponse }
     * 
     */
    public GetLookupTransactionResponse createGetLookupTransactionResponse() {
        return new GetLookupTransactionResponse();
    }

    /**
     * Create an instance of {@link GetLookupTransaction }
     * 
     */
    public GetLookupTransaction createGetLookupTransaction() {
        return new GetLookupTransaction();
    }

    /**
     * Create an instance of {@link ManagePaymentMethod }
     * 
     */
    public ManagePaymentMethod createManagePaymentMethod() {
        return new ManagePaymentMethod();
    }

    /**
     * Create an instance of {@link GetTransaction }
     * 
     */
    public GetTransaction createGetTransaction() {
        return new GetTransaction();
    }

    /**
     * Create an instance of {@link AutoPay }
     * 
     */
    public AutoPay createAutoPay() {
        return new AutoPay();
    }

    /**
     * Create an instance of {@link Soulstace }
     * 
     */
    public Soulstace createSoulstace() {
        return new Soulstace();
    }

    /**
     * Create an instance of {@link Basket }
     * 
     */
    public Basket createBasket() {
        return new Basket();
    }

    /**
     * Create an instance of {@link Sbux }
     * 
     */
    public Sbux createSbux() {
        return new Sbux();
    }

    /**
     * Create an instance of {@link ThirdParty }
     * 
     */
    public ThirdParty createThirdParty() {
        return new ThirdParty();
    }

    /**
     * Create an instance of {@link WalletBalance }
     * 
     */
    public WalletBalance createWalletBalance() {
        return new WalletBalance();
    }

    /**
     * Create an instance of {@link Balance }
     * 
     */
    public Balance createBalance() {
        return new Balance();
    }

    /**
     * Create an instance of {@link AdditionalInfo }
     * 
     */
    public AdditionalInfo createAdditionalInfo() {
        return new AdditionalInfo();
    }

    /**
     * Create an instance of {@link ArrayList }
     * 
     */
    public ArrayList createArrayList() {
        return new ArrayList();
    }

    /**
     * Create an instance of {@link Credit }
     * 
     */
    public Credit createCredit() {
        return new Credit();
    }

    /**
     * Create an instance of {@link BankDepositDetails }
     * 
     */
    public BankDepositDetails createBankDepositDetails() {
        return new BankDepositDetails();
    }

    /**
     * Create an instance of {@link BankAccount }
     * 
     */
    public BankAccount createBankAccount() {
        return new BankAccount();
    }

    /**
     * Create an instance of {@link ProductLineItem }
     * 
     */
    public ProductLineItem createProductLineItem() {
        return new ProductLineItem();
    }

    /**
     * Create an instance of {@link LoyaltyCard }
     * 
     */
    public LoyaltyCard createLoyaltyCard() {
        return new LoyaltyCard();
    }

    /**
     * Create an instance of {@link CustomField }
     * 
     */
    public CustomField createCustomField() {
        return new CustomField();
    }

    /**
     * Create an instance of {@link Fraud }
     * 
     */
    public Fraud createFraud() {
        return new Fraud();
    }

    /**
     * Create an instance of {@link Globalpay }
     * 
     */
    public Globalpay createGlobalpay() {
        return new Globalpay();
    }

    /**
     * Create an instance of {@link Secure3D }
     * 
     */
    public Secure3D createSecure3D() {
        return new Secure3D();
    }

    /**
     * Create an instance of {@link TransactionRecord }
     * 
     */
    public TransactionRecord createTransactionRecord() {
        return new TransactionRecord();
    }

    /**
     * Create an instance of {@link BankTransfer }
     * 
     */
    public BankTransfer createBankTransfer() {
        return new BankTransfer();
    }

    /**
     * Create an instance of {@link Mobicred }
     * 
     */
    public Mobicred createMobicred() {
        return new Mobicred();
    }

    /**
     * Create an instance of {@link ShippingDetails }
     * 
     */
    public ShippingDetails createShippingDetails() {
        return new ShippingDetails();
    }

    /**
     * Create an instance of {@link EWalletMPesa }
     * 
     */
    public EWalletMPesa createEWalletMPesa() {
        return new EWalletMPesa();
    }

    /**
     * Create an instance of {@link Sva }
     * 
     */
    public Sva createSva() {
        return new Sva();
    }

    /**
     * Create an instance of {@link Redirect }
     * 
     */
    public Redirect createRedirect() {
        return new Redirect();
    }

    /**
     * Create an instance of {@link Wallet }
     * 
     */
    public Wallet createWallet() {
        return new Wallet();
    }

    /**
     * Create an instance of {@link Rcs }
     * 
     */
    public Rcs createRcs() {
        return new Rcs();
    }

    /**
     * Create an instance of {@link Ebucks }
     * 
     */
    public Ebucks createEbucks() {
        return new Ebucks();
    }

    /**
     * Create an instance of {@link TokenizedPaymentMethodValue }
     * 
     */
    public TokenizedPaymentMethodValue createTokenizedPaymentMethodValue() {
        return new TokenizedPaymentMethodValue();
    }

    /**
     * Create an instance of {@link DiscoveryMiles }
     * 
     */
    public DiscoveryMiles createDiscoveryMiles() {
        return new DiscoveryMiles();
    }

    /**
     * Create an instance of {@link EWallet }
     * 
     */
    public EWallet createEWallet() {
        return new EWallet();
    }

    /**
     * Create an instance of {@link Eft }
     * 
     */
    public Eft createEft() {
        return new Eft();
    }

    /**
     * Create an instance of {@link RecurringDetails }
     * 
     */
    public RecurringDetails createRecurringDetails() {
        return new RecurringDetails();
    }

    /**
     * Create an instance of {@link DebitCard }
     * 
     */
    public DebitCard createDebitCard() {
        return new DebitCard();
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link PayPal }
     * 
     */
    public PayPal createPayPal() {
        return new PayPal();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link ManagePaymentMethodResponseMessage.ManagePaymentMethodData.Entry }
     * 
     */
    public ManagePaymentMethodResponseMessage.ManagePaymentMethodData.Entry createManagePaymentMethodResponseMessageManagePaymentMethodDataEntry() {
        return new ManagePaymentMethodResponseMessage.ManagePaymentMethodData.Entry();
    }

    /**
     * Create an instance of {@link LookupTransactionResponseMessage.LookupData.Entry }
     * 
     */
    public LookupTransactionResponseMessage.LookupData.Entry createLookupTransactionResponseMessageLookupDataEntry() {
        return new LookupTransactionResponseMessage.LookupData.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.api.controller.web.payjar.com/", name = "doTransaction")
    public JAXBElement<DoTransaction> createDoTransaction(DoTransaction value) {
        return new JAXBElement<DoTransaction>(_DoTransaction_QNAME, DoTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.api.controller.web.payjar.com/", name = "doTransactionResponse")
    public JAXBElement<DoTransactionResponse> createDoTransactionResponse(DoTransactionResponse value) {
        return new JAXBElement<DoTransactionResponse>(_DoTransactionResponse_QNAME, DoTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoDeleteTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.api.controller.web.payjar.com/", name = "doDeleteTransaction")
    public JAXBElement<DoDeleteTransaction> createDoDeleteTransaction(DoDeleteTransaction value) {
        return new JAXBElement<DoDeleteTransaction>(_DoDeleteTransaction_QNAME, DoDeleteTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.api.controller.web.payjar.com/", name = "getTransactionResponse")
    public JAXBElement<GetTransactionResponse> createGetTransactionResponse(GetTransactionResponse value) {
        return new JAXBElement<GetTransactionResponse>(_GetTransactionResponse_QNAME, GetTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagePaymentMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.api.controller.web.payjar.com/", name = "managePaymentMethodResponse")
    public JAXBElement<ManagePaymentMethodResponse> createManagePaymentMethodResponse(ManagePaymentMethodResponse value) {
        return new JAXBElement<ManagePaymentMethodResponse>(_ManagePaymentMethodResponse_QNAME, ManagePaymentMethodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.api.controller.web.payjar.com/", name = "setTransaction")
    public JAXBElement<SetTransaction> createSetTransaction(SetTransaction value) {
        return new JAXBElement<SetTransaction>(_SetTransaction_QNAME, SetTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ManagePaymentMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.api.controller.web.payjar.com/", name = "managePaymentMethod")
    public JAXBElement<ManagePaymentMethod> createManagePaymentMethod(ManagePaymentMethod value) {
        return new JAXBElement<ManagePaymentMethod>(_ManagePaymentMethod_QNAME, ManagePaymentMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.api.controller.web.payjar.com/", name = "getTransaction")
    public JAXBElement<GetTransaction> createGetTransaction(GetTransaction value) {
        return new JAXBElement<GetTransaction>(_GetTransaction_QNAME, GetTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoDeleteTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.api.controller.web.payjar.com/", name = "doDeleteTransactionResponse")
    public JAXBElement<DoDeleteTransactionResponse> createDoDeleteTransactionResponse(DoDeleteTransactionResponse value) {
        return new JAXBElement<DoDeleteTransactionResponse>(_DoDeleteTransactionResponse_QNAME, DoDeleteTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.api.controller.web.payjar.com/", name = "setTransactionResponse")
    public JAXBElement<SetTransactionResponse> createSetTransactionResponse(SetTransactionResponse value) {
        return new JAXBElement<SetTransactionResponse>(_SetTransactionResponse_QNAME, SetTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLookupTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.api.controller.web.payjar.com/", name = "getLookupTransaction")
    public JAXBElement<GetLookupTransaction> createGetLookupTransaction(GetLookupTransaction value) {
        return new JAXBElement<GetLookupTransaction>(_GetLookupTransaction_QNAME, GetLookupTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLookupTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.api.controller.web.payjar.com/", name = "getLookupTransactionResponse")
    public JAXBElement<GetLookupTransactionResponse> createGetLookupTransactionResponse(GetLookupTransactionResponse value) {
        return new JAXBElement<GetLookupTransactionResponse>(_GetLookupTransactionResponse_QNAME, GetLookupTransactionResponse.class, null, value);
    }

}
