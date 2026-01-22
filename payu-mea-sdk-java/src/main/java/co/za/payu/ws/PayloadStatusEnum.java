
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payloadStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="payloadStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NOT_STARTED"/>
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="STAGED"/>
 *     &lt;enumeration value="PROCESSING"/>
 *     &lt;enumeration value="SUCCESSFUL"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="TIMEOUT"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="AWAITING_PAYMENT"/>
 *     &lt;enumeration value="PARTIAL_PAYMENT"/>
 *     &lt;enumeration value="OVER_PAYMENT"/>
 *     &lt;enumeration value="LATE_PAYMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "payloadStatusEnum")
@XmlEnum
public enum PayloadStatusEnum {

    NOT_STARTED,
    NEW,
    STAGED,
    PROCESSING,
    SUCCESSFUL,
    FAILED,
    TIMEOUT,
    EXPIRED,
    AWAITING_PAYMENT,
    PARTIAL_PAYMENT,
    OVER_PAYMENT,
    LATE_PAYMENT;

    public String value() {
        return name();
    }

    public static PayloadStatusEnum fromValue(String v) {
        return valueOf(v);
    }

}
