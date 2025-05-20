
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentInstrumentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="paymentInstrumentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SVA_PAYU"/>
 *     &lt;enumeration value="CREDITCARD_PAYU"/>
 *     &lt;enumeration value="CREDITCARD_TOKEN"/>
 *     &lt;enumeration value="CREDITCARD_VCO"/>
 *     &lt;enumeration value="EFT_CROSS_BORDER"/>
 *     &lt;enumeration value="EFT_CROSS_BORDER_PAYU"/>
 *     &lt;enumeration value="PAY_BY_REFERENCE"/>
 *     &lt;enumeration value="SMART_EFT"/>
 *     &lt;enumeration value="EFT_PRO"/>
 *     &lt;enumeration value="EBUCKS_WEBSERVICE"/>
 *     &lt;enumeration value="EBUCKS_REDIRECT"/>
 *     &lt;enumeration value="MOBICRED_WEBSERVICE"/>
 *     &lt;enumeration value="WECHAT_CALLBACK"/>
 *     &lt;enumeration value="EFT_PAYMENT_NOTIFICATION"/>
 *     &lt;enumeration value="MAGELLAN_PAYMENT_NOTIFICATION"/>
 *     &lt;enumeration value="MCA_PAYMENT_NOTIFICATION"/>
 *     &lt;enumeration value="BANK_ACCOUNT_PAYU"/>
 *     &lt;enumeration value="FEE_CREDIT_CARD"/>
 *     &lt;enumeration value="RCS"/>
 *     &lt;enumeration value="RCS_PLC"/>
 *     &lt;enumeration value="QR_CODE"/>
 *     &lt;enumeration value="EWALLET"/>
 *     &lt;enumeration value="WALLET_PAYU"/>
 *     &lt;enumeration value="EFT_WALLET_PAYU_TOPUP"/>
 *     &lt;enumeration value="SENTINEL_SECURE3D_LOOKUP"/>
 *     &lt;enumeration value="SENTINEL_SECURE3D_AUTH"/>
 *     &lt;enumeration value="EMAIL_NOTIFICATION"/>
 *     &lt;enumeration value="EWALLET_MPESA"/>
 *     &lt;enumeration value="EFT_BANK_TRANSFER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "paymentInstrumentType")
@XmlEnum
public enum PaymentInstrumentType {

    SVA_PAYU("SVA_PAYU"),
    CREDITCARD_PAYU("CREDITCARD_PAYU"),
    CREDITCARD_TOKEN("CREDITCARD_TOKEN"),
    CREDITCARD_VCO("CREDITCARD_VCO"),
    EFT_CROSS_BORDER("EFT_CROSS_BORDER"),
    EFT_CROSS_BORDER_PAYU("EFT_CROSS_BORDER_PAYU"),
    PAY_BY_REFERENCE("PAY_BY_REFERENCE"),
    SMART_EFT("SMART_EFT"),
    EFT_PRO("EFT_PRO"),
    EBUCKS_WEBSERVICE("EBUCKS_WEBSERVICE"),
    EBUCKS_REDIRECT("EBUCKS_REDIRECT"),
    MOBICRED_WEBSERVICE("MOBICRED_WEBSERVICE"),
    WECHAT_CALLBACK("WECHAT_CALLBACK"),
    EFT_PAYMENT_NOTIFICATION("EFT_PAYMENT_NOTIFICATION"),
    MAGELLAN_PAYMENT_NOTIFICATION("MAGELLAN_PAYMENT_NOTIFICATION"),
    MCA_PAYMENT_NOTIFICATION("MCA_PAYMENT_NOTIFICATION"),
    BANK_ACCOUNT_PAYU("BANK_ACCOUNT_PAYU"),
    FEE_CREDIT_CARD("FEE_CREDIT_CARD"),
    RCS("RCS"),
    RCS_PLC("RCS_PLC"),
    QR_CODE("QR_CODE"),
    EWALLET("EWALLET"),
    WALLET_PAYU("WALLET_PAYU"),
    EFT_WALLET_PAYU_TOPUP("EFT_WALLET_PAYU_TOPUP"),
    @XmlEnumValue("SENTINEL_SECURE3D_LOOKUP")
    SENTINEL_SECURE_3_D_LOOKUP("SENTINEL_SECURE3D_LOOKUP"),
    @XmlEnumValue("SENTINEL_SECURE3D_AUTH")
    SENTINEL_SECURE_3_D_AUTH("SENTINEL_SECURE3D_AUTH"),
    EMAIL_NOTIFICATION("EMAIL_NOTIFICATION"),
    EWALLET_MPESA("EWALLET_MPESA"),
    EFT_BANK_TRANSFER("EFT_BANK_TRANSFER");
    private final String value;

    PaymentInstrumentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentInstrumentType fromValue(String v) {
        for (PaymentInstrumentType c: PaymentInstrumentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
