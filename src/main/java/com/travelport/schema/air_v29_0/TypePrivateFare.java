
package com.travelport.schema.air_v29_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typePrivateFare.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typePrivateFare">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UnknownType"/>
 *     &lt;enumeration value="PrivateFare"/>
 *     &lt;enumeration value="AgencyPrivateFare"/>
 *     &lt;enumeration value="AirlinePrivateFare"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typePrivateFare")
@XmlEnum
public enum TypePrivateFare {

    @XmlEnumValue("UnknownType")
    UNKNOWN_TYPE("UnknownType"),
    @XmlEnumValue("PrivateFare")
    PRIVATE_FARE("PrivateFare"),
    @XmlEnumValue("AgencyPrivateFare")
    AGENCY_PRIVATE_FARE("AgencyPrivateFare"),
    @XmlEnumValue("AirlinePrivateFare")
    AIRLINE_PRIVATE_FARE("AirlinePrivateFare");
    private final String value;

    TypePrivateFare(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypePrivateFare fromValue(String v) {
        for (TypePrivateFare c: TypePrivateFare.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
