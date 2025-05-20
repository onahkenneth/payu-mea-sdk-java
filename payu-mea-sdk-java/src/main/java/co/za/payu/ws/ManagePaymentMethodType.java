
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for managePaymentMethodType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="managePaymentMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOKEN"/>
 *     &lt;enumeration value="HANDSHAKE"/>
 *     &lt;enumeration value="HANDSHAKE_SETUP_ACCOUNT"/>
 *     &lt;enumeration value="PROFILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "managePaymentMethodType")
@XmlEnum
public enum ManagePaymentMethodType {

    TOKEN,
    HANDSHAKE,
    HANDSHAKE_SETUP_ACCOUNT,
    PROFILE;

    public String value() {
        return name();
    }

    public static ManagePaymentMethodType fromValue(String v) {
        return valueOf(v);
    }

}
