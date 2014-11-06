
package com.travelport.schema.air_v29_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v29_0.BaseReq;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v29_0}BaseReq">
 *       &lt;choice>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}MerchandisingDetails"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}OptionalServiceModifiers"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "merchandisingDetails",
    "optionalServiceModifiers"
})
@XmlRootElement(name = "AirMerchandisingDetailsReq")
public class AirMerchandisingDetailsReq
    extends BaseReq
{

    @XmlElement(name = "MerchandisingDetails")
    protected MerchandisingDetails merchandisingDetails;
    @XmlElement(name = "OptionalServiceModifiers")
    protected OptionalServiceModifiers optionalServiceModifiers;

    /**
     * Gets the value of the merchandisingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MerchandisingDetails }
     *     
     */
    public MerchandisingDetails getMerchandisingDetails() {
        return merchandisingDetails;
    }

    /**
     * Sets the value of the merchandisingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MerchandisingDetails }
     *     
     */
    public void setMerchandisingDetails(MerchandisingDetails value) {
        this.merchandisingDetails = value;
    }

    /**
     * Gets the value of the optionalServiceModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalServiceModifiers }
     *     
     */
    public OptionalServiceModifiers getOptionalServiceModifiers() {
        return optionalServiceModifiers;
    }

    /**
     * Sets the value of the optionalServiceModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServiceModifiers }
     *     
     */
    public void setOptionalServiceModifiers(OptionalServiceModifiers value) {
        this.optionalServiceModifiers = value;
    }

}
