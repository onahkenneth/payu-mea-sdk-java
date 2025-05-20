
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transactionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOOKUP"/>
 *     &lt;enumeration value="MANAGE"/>
 *     &lt;enumeration value="MSISDN_LOOKUP"/>
 *     &lt;enumeration value="EFFECT_STAGING"/>
 *     &lt;enumeration value="RESERVE"/>
 *     &lt;enumeration value="RESERVE_CANCEL"/>
 *     &lt;enumeration value="PAYMENT"/>
 *     &lt;enumeration value="CROSS_BORDER_PAYMENT"/>
 *     &lt;enumeration value="BILL_PAYMENT"/>
 *     &lt;enumeration value="FINALIZE"/>
 *     &lt;enumeration value="BALANCE"/>
 *     &lt;enumeration value="MINI_STATEMENT"/>
 *     &lt;enumeration value="REGISTER"/>
 *     &lt;enumeration value="CREDIT"/>
 *     &lt;enumeration value="PARTIAL_CREDIT"/>
 *     &lt;enumeration value="TRANSFER"/>
 *     &lt;enumeration value="VERIFY_TRANSACTION"/>
 *     &lt;enumeration value="REGISTER_LINK"/>
 *     &lt;enumeration value="TOPUP_RESERVE"/>
 *     &lt;enumeration value="TOPUP_FINALIZE"/>
 *     &lt;enumeration value="TOPUP_CANCEL"/>
 *     &lt;enumeration value="TOPUP"/>
 *     &lt;enumeration value="PAYOUT"/>
 *     &lt;enumeration value="COLLECT"/>
 *     &lt;enumeration value="ACCOUNT_LOOKUP"/>
 *     &lt;enumeration value="RECURRING_PAYMENT"/>
 *     &lt;enumeration value="RECURRING_PAYMENT_SETUP"/>
 *     &lt;enumeration value="DEBIT_ORDER"/>
 *     &lt;enumeration value="DEBIT_ORDER_SETUP"/>
 *     &lt;enumeration value="DEBIT_ORDER_CANCEL"/>
 *     &lt;enumeration value="SUBSCRIPTION_PAYMENT"/>
 *     &lt;enumeration value="SUBSCRIPTION_PAYMENT_SETUP"/>
 *     &lt;enumeration value="RECURRING_TOKENISE"/>
 *     &lt;enumeration value="REDEEM_UKASH_VOUCHER"/>
 *     &lt;enumeration value="ADD_CREDITCARD"/>
 *     &lt;enumeration value="EVENT_CARDPURCHASE"/>
 *     &lt;enumeration value="VAS_SPEND"/>
 *     &lt;enumeration value="VAS_PAY_RECIPIENT_KNOWN"/>
 *     &lt;enumeration value="VAS_PAY_RECIPIENT_UNKNOWN"/>
 *     &lt;enumeration value="PROFILE_UPDATE"/>
 *     &lt;enumeration value="LOG_JOURNAL_ENTRY"/>
 *     &lt;enumeration value="LOG_JOURNAL_ENTRY_REVERSE"/>
 *     &lt;enumeration value="PAYU_DEPOSIT"/>
 *     &lt;enumeration value="PAYU_DEPOSIT_CANCEL"/>
 *     &lt;enumeration value="CHECK_CUST_MAX_BALANCE"/>
 *     &lt;enumeration value="CHECK_CUST_SVA_LIMITS"/>
 *     &lt;enumeration value="VAS_LOOKUP"/>
 *     &lt;enumeration value="VAS_PROCESS"/>
 *     &lt;enumeration value="VAS_CREDIT"/>
 *     &lt;enumeration value="PENDING_3DS_COMPLETION"/>
 *     &lt;enumeration value="ONCE_OFF_PAYMENT_AND_DEBIT_ORDER"/>
 *     &lt;enumeration value="ONCE_OFF_RESERVE_AND_DEBIT_ORDER"/>
 *     &lt;enumeration value="P2P"/>
 *     &lt;enumeration value="P2P_RESERVE"/>
 *     &lt;enumeration value="P2P_CANCEL"/>
 *     &lt;enumeration value="P2P_FINALIZE"/>
 *     &lt;enumeration value="VALIDATION"/>
 *     &lt;enumeration value="PROVISION"/>
 *     &lt;enumeration value="NOTIFICATION"/>
 *     &lt;enumeration value="ADJUSTMENT"/>
 *     &lt;enumeration value="CREDIT_LOOKUP"/>
 *     &lt;enumeration value="WITHDRAWAL"/>
 *     &lt;enumeration value="TRANSFER_CANCEL"/>
 *     &lt;enumeration value="AUTHENTICATION"/>
 *     &lt;enumeration value="EMAIL_NOTIFICATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transactionType")
@XmlEnum
public enum TransactionType {

    LOOKUP("LOOKUP"),
    MANAGE("MANAGE"),
    MSISDN_LOOKUP("MSISDN_LOOKUP"),
    EFFECT_STAGING("EFFECT_STAGING"),
    RESERVE("RESERVE"),
    RESERVE_CANCEL("RESERVE_CANCEL"),
    PAYMENT("PAYMENT"),
    CROSS_BORDER_PAYMENT("CROSS_BORDER_PAYMENT"),
    BILL_PAYMENT("BILL_PAYMENT"),
    FINALIZE("FINALIZE"),
    BALANCE("BALANCE"),
    MINI_STATEMENT("MINI_STATEMENT"),
    REGISTER("REGISTER"),
    CREDIT("CREDIT"),
    PARTIAL_CREDIT("PARTIAL_CREDIT"),
    TRANSFER("TRANSFER"),
    VERIFY_TRANSACTION("VERIFY_TRANSACTION"),
    REGISTER_LINK("REGISTER_LINK"),
    TOPUP_RESERVE("TOPUP_RESERVE"),
    TOPUP_FINALIZE("TOPUP_FINALIZE"),
    TOPUP_CANCEL("TOPUP_CANCEL"),
    TOPUP("TOPUP"),
    PAYOUT("PAYOUT"),
    COLLECT("COLLECT"),
    ACCOUNT_LOOKUP("ACCOUNT_LOOKUP"),
    RECURRING_PAYMENT("RECURRING_PAYMENT"),
    RECURRING_PAYMENT_SETUP("RECURRING_PAYMENT_SETUP"),
    DEBIT_ORDER("DEBIT_ORDER"),
    DEBIT_ORDER_SETUP("DEBIT_ORDER_SETUP"),
    DEBIT_ORDER_CANCEL("DEBIT_ORDER_CANCEL"),
    SUBSCRIPTION_PAYMENT("SUBSCRIPTION_PAYMENT"),
    SUBSCRIPTION_PAYMENT_SETUP("SUBSCRIPTION_PAYMENT_SETUP"),
    RECURRING_TOKENISE("RECURRING_TOKENISE"),
    REDEEM_UKASH_VOUCHER("REDEEM_UKASH_VOUCHER"),
    ADD_CREDITCARD("ADD_CREDITCARD"),
    EVENT_CARDPURCHASE("EVENT_CARDPURCHASE"),
    VAS_SPEND("VAS_SPEND"),
    VAS_PAY_RECIPIENT_KNOWN("VAS_PAY_RECIPIENT_KNOWN"),
    VAS_PAY_RECIPIENT_UNKNOWN("VAS_PAY_RECIPIENT_UNKNOWN"),
    PROFILE_UPDATE("PROFILE_UPDATE"),
    LOG_JOURNAL_ENTRY("LOG_JOURNAL_ENTRY"),
    LOG_JOURNAL_ENTRY_REVERSE("LOG_JOURNAL_ENTRY_REVERSE"),
    PAYU_DEPOSIT("PAYU_DEPOSIT"),
    PAYU_DEPOSIT_CANCEL("PAYU_DEPOSIT_CANCEL"),
    CHECK_CUST_MAX_BALANCE("CHECK_CUST_MAX_BALANCE"),
    CHECK_CUST_SVA_LIMITS("CHECK_CUST_SVA_LIMITS"),
    VAS_LOOKUP("VAS_LOOKUP"),
    VAS_PROCESS("VAS_PROCESS"),
    VAS_CREDIT("VAS_CREDIT"),
    @XmlEnumValue("PENDING_3DS_COMPLETION")
    PENDING_3_DS_COMPLETION("PENDING_3DS_COMPLETION"),
    ONCE_OFF_PAYMENT_AND_DEBIT_ORDER("ONCE_OFF_PAYMENT_AND_DEBIT_ORDER"),
    ONCE_OFF_RESERVE_AND_DEBIT_ORDER("ONCE_OFF_RESERVE_AND_DEBIT_ORDER"),
    @XmlEnumValue("P2P")
    P_2_P("P2P"),
    @XmlEnumValue("P2P_RESERVE")
    P_2_P_RESERVE("P2P_RESERVE"),
    @XmlEnumValue("P2P_CANCEL")
    P_2_P_CANCEL("P2P_CANCEL"),
    @XmlEnumValue("P2P_FINALIZE")
    P_2_P_FINALIZE("P2P_FINALIZE"),
    VALIDATION("VALIDATION"),
    PROVISION("PROVISION"),
    NOTIFICATION("NOTIFICATION"),
    ADJUSTMENT("ADJUSTMENT"),
    CREDIT_LOOKUP("CREDIT_LOOKUP"),
    WITHDRAWAL("WITHDRAWAL"),
    TRANSFER_CANCEL("TRANSFER_CANCEL"),
    AUTHENTICATION("AUTHENTICATION"),
    EMAIL_NOTIFICATION("EMAIL_NOTIFICATION");
    private final String value;

    TransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionType fromValue(String v) {
        for (TransactionType c: TransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
