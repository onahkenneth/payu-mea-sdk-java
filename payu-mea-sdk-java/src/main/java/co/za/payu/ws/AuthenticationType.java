
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authenticationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="authenticationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="HANDSHAKE"/>
 *     &lt;enumeration value="TOKEN"/>
 *     &lt;enumeration value="VCO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "authenticationType")
@XmlEnum
public enum AuthenticationType {

    NA,
    HANDSHAKE,
    TOKEN,
    VCO;

    public String value() {
        return name();
    }

    public static AuthenticationType fromValue(String v) {
        return valueOf(v);
    }

}
