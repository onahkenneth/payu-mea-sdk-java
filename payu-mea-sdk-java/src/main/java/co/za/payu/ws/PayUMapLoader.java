
package co.za.payu.ws;

import co.za.payu.base.soap.PayUModel;
import co.za.payu.base.soap.PayUResource;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayUMapLoader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayUMapLoader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayUMapLoader", namespace = "https://www.payu.co.za/PayUMapLoader")
@XmlSeeAlso({
    SetTransactionResponseMessage.class,
    GetTransactionResponseMessage.class,
    LookupTransactionResponseMessage.class,
    ManagePaymentMethodResponseMessage.class,
    DeleteTransactionResponseMessage.class,
    DoTransactionResponseMessage.class,
    Basket.class,
    WalletBalance.class,
    Balance.class,
    AdditionalInfo.class,
    Credit.class,
    CustomField.class,
    TransactionRecord.class,
    Redirect.class,
    RecurringDetails.class,
    IPaymentMethod.class,
    Customer.class
})
public abstract class PayUMapLoader {
}
