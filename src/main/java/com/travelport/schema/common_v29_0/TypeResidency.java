
package com.travelport.schema.common_v29_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeResidency.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeResidency">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Employee"/>
 *     &lt;enumeration value="National"/>
 *     &lt;enumeration value="Resident"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeResidency")
@XmlEnum
public enum TypeResidency {

    @XmlEnumValue("Employee")
    EMPLOYEE("Employee"),
    @XmlEnumValue("National")
    NATIONAL("National"),
    @XmlEnumValue("Resident")
    RESIDENT("Resident");
    private final String value;

    TypeResidency(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeResidency fromValue(String v) {
        for (TypeResidency c: TypeResidency.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
