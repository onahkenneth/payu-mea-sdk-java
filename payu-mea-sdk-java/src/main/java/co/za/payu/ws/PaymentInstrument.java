
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentInstrument.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentInstrument">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREDITCARD"/>
 *     &lt;enumeration value="CREDITCARD_TOKEN"/>
 *     &lt;enumeration value="CREDITCARD_PAYU"/>
 *     &lt;enumeration value="WALLET"/>
 *     &lt;enumeration value="SVA"/>
 *     &lt;enumeration value="DEBITCARD"/>
 *     &lt;enumeration value="LOYALTY"/>
 *     &lt;enumeration value="EBUCKS"/>
 *     &lt;enumeration value="MOBICRED"/>
 *     &lt;enumeration value="EFT"/>
 *     &lt;enumeration value="EFT_PASS"/>
 *     &lt;enumeration value="UKASH"/>
 *     &lt;enumeration value="BANKTRANSFER"/>
 *     &lt;enumeration value="BANK_ACCOUNT"/>
 *     &lt;enumeration value="THIRDPARTY"/>
 *     &lt;enumeration value="AUTOPAY"/>
 *     &lt;enumeration value="VOUCHER"/>
 *     &lt;enumeration value="INSTANTMONEY"/>
 *     &lt;enumeration value="DISCOVERYMILES"/>
 *     &lt;enumeration value="EVENT_RELOAD"/>
 *     &lt;enumeration value="WICODE"/>
 *     &lt;enumeration value="GLOBALPAY"/>
 *     &lt;enumeration value="SOULSTACE"/>
 *     &lt;enumeration value="PAYPAL"/>
 *     &lt;enumeration value="MASTERPASS"/>
 *     &lt;enumeration value="SBUX"/>
 *     &lt;enumeration value="CARD_STORE_PAYU"/>
 *     &lt;enumeration value="WALLET_PAYU"/>
 *     &lt;enumeration value="WALLET_PAYU_AUTHENTICATION"/>
 *     &lt;enumeration value="WALLET_PAYU_SETUP_ORDER"/>
 *     &lt;enumeration value="EWALLET"/>
 *     &lt;enumeration value="RCS"/>
 *     &lt;enumeration value="QR_CODE"/>
 *     &lt;enumeration value="VAS"/>
 *     &lt;enumeration value="SENTINEL"/>
 *     &lt;enumeration value="SECURE_3D_LOOKUP"/>
 *     &lt;enumeration value="SECURE_3D_AUTH"/>
 *     &lt;enumeration value="SECURE_3D"/>
 *     &lt;enumeration value="FRAUD"/>
 *     &lt;enumeration value="CROSS_BORDER_CREATE_ACCOUNT"/>
 *     &lt;enumeration value="CROSS_BORDER_BENEFICIARY"/>
 *     &lt;enumeration value="CROSS_BORDER_GET_DETAILS"/>
 *     &lt;enumeration value="IPN"/>
 *     &lt;enumeration value="SVA_VALIDATE"/>
 *     &lt;enumeration value="FEE"/>
 *     &lt;enumeration value="SMS_NOTIFICATION"/>
 *     &lt;enumeration value="ADVISORY"/>
 *     &lt;enumeration value="EMAIL_NOTIFICATION"/>
 *     &lt;enumeration value="EFT_BANK_TRANSFER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paymentInstrument")
@XmlEnum
public enum PaymentInstrument {

    CREDITCARD("CREDITCARD"),
    CREDITCARD_TOKEN("CREDITCARD_TOKEN"),
    CREDITCARD_PAYU("CREDITCARD_PAYU"),
    WALLET("WALLET"),
    SVA("SVA"),
    DEBITCARD("DEBITCARD"),
    LOYALTY("LOYALTY"),
    EBUCKS("EBUCKS"),
    MOBICRED("MOBICRED"),
    EFT("EFT"),
    EFT_PASS("EFT_PASS"),
    UKASH("UKASH"),
    BANKTRANSFER("BANKTRANSFER"),
    BANK_ACCOUNT("BANK_ACCOUNT"),
    THIRDPARTY("THIRDPARTY"),
    AUTOPAY("AUTOPAY"),
    VOUCHER("VOUCHER"),
    INSTANTMONEY("INSTANTMONEY"),
    DISCOVERYMILES("DISCOVERYMILES"),
    EVENT_RELOAD("EVENT_RELOAD"),
    WICODE("WICODE"),
    GLOBALPAY("GLOBALPAY"),
    SOULSTACE("SOULSTACE"),
    PAYPAL("PAYPAL"),
    MASTERPASS("MASTERPASS"),
    SBUX("SBUX"),
    CARD_STORE_PAYU("CARD_STORE_PAYU"),
    WALLET_PAYU("WALLET_PAYU"),
    WALLET_PAYU_AUTHENTICATION("WALLET_PAYU_AUTHENTICATION"),
    WALLET_PAYU_SETUP_ORDER("WALLET_PAYU_SETUP_ORDER"),
    EWALLET("EWALLET"),
    RCS("RCS"),
    QR_CODE("QR_CODE"),
    VAS("VAS"),
    SENTINEL("SENTINEL"),
    @XmlEnumValue("SECURE_3D_LOOKUP")
    SECURE_3_D_LOOKUP("SECURE_3D_LOOKUP"),
    @XmlEnumValue("SECURE_3D_AUTH")
    SECURE_3_D_AUTH("SECURE_3D_AUTH"),
    @XmlEnumValue("SECURE_3D")
    SECURE_3_D("SECURE_3D"),
    FRAUD("FRAUD"),
    CROSS_BORDER_CREATE_ACCOUNT("CROSS_BORDER_CREATE_ACCOUNT"),
    CROSS_BORDER_BENEFICIARY("CROSS_BORDER_BENEFICIARY"),
    CROSS_BORDER_GET_DETAILS("CROSS_BORDER_GET_DETAILS"),
    IPN("IPN"),
    SVA_VALIDATE("SVA_VALIDATE"),
    FEE("FEE"),
    SMS_NOTIFICATION("SMS_NOTIFICATION"),
    ADVISORY("ADVISORY"),
    EMAIL_NOTIFICATION("EMAIL_NOTIFICATION"),
    EFT_BANK_TRANSFER("EFT_BANK_TRANSFER");
    private final String value;

    PaymentInstrument(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentInstrument fromValue(String v) {
        for (PaymentInstrument c: PaymentInstrument.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
