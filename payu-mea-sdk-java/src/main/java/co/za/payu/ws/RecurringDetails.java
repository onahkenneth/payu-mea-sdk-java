
package co.za.payu.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recurringDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recurringDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.payu.co.za/PayUMapLoader}PayUMapLoader">
 *       &lt;sequence>
 *         &lt;element name="deductionDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurrences" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurringPaymentToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statementDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recurringDetails", propOrder = {
    "deductionDay",
    "frequency",
    "recurrences",
    "recurringPaymentToken",
    "statementDescription"
})
public class RecurringDetails
    extends PayUMapLoader
{

    protected String deductionDay;
    protected String frequency;
    protected String recurrences;
    protected String recurringPaymentToken;
    protected String statementDescription;

    /**
     * Gets the value of the deductionDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeductionDay() {
        return deductionDay;
    }

    /**
     * Sets the value of the deductionDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return RecurringDetails    
     */
    public RecurringDetails setDeductionDay(String value) {
        this.deductionDay = value;

        return this;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return RecurringDetails    
     */
    public RecurringDetails setFrequency(String value) {
        this.frequency = value;

        return this;
    }

    /**
     * Gets the value of the recurrences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrences() {
        return recurrences;
    }

    /**
     * Sets the value of the recurrences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return RecurringDetails    
     */
    public RecurringDetails setRecurrences(String value) {
        this.recurrences = value;

        return this;
    }

    /**
     * Gets the value of the recurringPaymentToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringPaymentToken() {
        return recurringPaymentToken;
    }

    /**
     * Sets the value of the recurringPaymentToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return RecurringDetails    
     */
    public RecurringDetails setRecurringPaymentToken(String value) {
        this.recurringPaymentToken = value;

        return this;
    }

    /**
     * Gets the value of the statementDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementDescription() {
        return statementDescription;
    }

    /**
     * Sets the value of the statementDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     * @return RecurringDetails    
     */
    public RecurringDetails setStatementDescription(String value) {
        this.statementDescription = value;

        return this;
    }

}
