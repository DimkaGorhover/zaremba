
package com.travelport.schema.air_v29_0;

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
 *     &lt;extension base="{http://www.travelport.com/schema/air_v29_0}BaseLowFareSearchReq">
 *       &lt;attribute name="PolicyReference" type="{http://www.travelport.com/schema/common_v29_0}typePolicyReference" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "LowFareSearchReq")
public class LowFareSearchReq
    extends BaseLowFareSearchReq
{

    @XmlAttribute(name = "PolicyReference")
    protected String policyReference;

    /**
     * Gets the value of the policyReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyReference() {
        return policyReference;
    }

    /**
     * Sets the value of the policyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyReference(String value) {
        this.policyReference = value;
    }

}
