
package com.travelport.schema.common_v29_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for URTicketStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="URTicketStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ticketed"/>
 *     &lt;enumeration value="Unticketed"/>
 *     &lt;enumeration value="Partially Ticketed"/>
 *     &lt;enumeration value="Not Applicable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "URTicketStatus")
@XmlEnum
public enum URTicketStatus {

    @XmlEnumValue("Ticketed")
    TICKETED("Ticketed"),
    @XmlEnumValue("Unticketed")
    UNTICKETED("Unticketed"),
    @XmlEnumValue("Partially Ticketed")
    PARTIALLY_TICKETED("Partially Ticketed"),
    @XmlEnumValue("Not Applicable")
    NOT_APPLICABLE("Not Applicable");
    private final String value;

    URTicketStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static URTicketStatus fromValue(String v) {
        for (URTicketStatus c: URTicketStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
