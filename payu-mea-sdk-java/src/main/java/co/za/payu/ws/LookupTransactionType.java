
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lookupTransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="lookupTransactionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOKEN"/>
 *     &lt;enumeration value="HANDSHAKE"/>
 *     &lt;enumeration value="PAYMENT_METHODS"/>
 *     &lt;enumeration value="SECRET_QUESTIONS"/>
 *     &lt;enumeration value="ACCOUNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "lookupTransactionType")
@XmlEnum
public enum LookupTransactionType {

    TOKEN,
    HANDSHAKE,
    PAYMENT_METHODS,
    SECRET_QUESTIONS,
    ACCOUNT;

    public String value() {
        return name();
    }

    public static LookupTransactionType fromValue(String v) {
        return valueOf(v);
    }

}
