
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteTransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="deleteTransactionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOKEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "deleteTransactionType")
@XmlEnum
public enum DeleteTransactionType {

    TOKEN;

    public String value() {
        return name();
    }

    public static DeleteTransactionType fromValue(String v) {
        return valueOf(v);
    }

}
