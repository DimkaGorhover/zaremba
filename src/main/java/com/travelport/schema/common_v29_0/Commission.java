
package com.travelport.schema.common_v29_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
 *       &lt;attribute name="Level" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeCommissionLevel" />
 *       &lt;attribute name="Type" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeCommissionType" />
 *       &lt;attribute name="Modifier" type="{http://www.travelport.com/schema/common_v29_0}typeCommissionModifier" />
 *       &lt;attribute name="Amount" type="{http://www.travelport.com/schema/common_v29_0}typeMoney" />
 *       &lt;attribute name="Value">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="0"/>
 *             &lt;maxLength value="15"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Percentage" type="{http://www.travelport.com/schema/common_v29_0}typePercentageWithDecimal" />
 *       &lt;attribute name="BookingTravelerRef" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
 *       &lt;attribute name="CommissionOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "Commission")
public class Commission {

    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "Level", required = true)
    protected TypeCommissionLevel level;
    @XmlAttribute(name = "Type", required = true)
    protected TypeCommissionType type;
    @XmlAttribute(name = "Modifier")
    protected TypeCommissionModifier modifier;
    @XmlAttribute(name = "Amount")
    protected String amount;
    @XmlAttribute(name = "Value")
    protected String value;
    @XmlAttribute(name = "Percentage")
    protected String percentage;
    @XmlAttribute(name = "BookingTravelerRef")
    protected String bookingTravelerRef;
    @XmlAttribute(name = "CommissionOverride")
    protected Boolean commissionOverride;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCommissionLevel }
     *     
     */
    public TypeCommissionLevel getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCommissionLevel }
     *     
     */
    public void setLevel(TypeCommissionLevel value) {
        this.level = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCommissionType }
     *     
     */
    public TypeCommissionType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCommissionType }
     *     
     */
    public void setType(TypeCommissionType value) {
        this.type = value;
    }

    /**
     * Gets the value of the modifier property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCommissionModifier }
     *     
     */
    public TypeCommissionModifier getModifier() {
        return modifier;
    }

    /**
     * Sets the value of the modifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCommissionModifier }
     *     
     */
    public void setModifier(TypeCommissionModifier value) {
        this.modifier = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentage(String value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

    /**
     * Gets the value of the commissionOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getCommissionOverride() {
        if (commissionOverride == null) {
            return false;
        } else {
            return commissionOverride;
        }
    }

    /**
     * Sets the value of the commissionOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCommissionOverride(Boolean value) {
        this.commissionOverride = value;
    }

}
