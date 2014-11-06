
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DefaultCurrency" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="StartPrice" type="{http://www.travelport.com/schema/common_v29_0}typeMoney" />
 *       &lt;attribute name="EndPrice" type="{http://www.travelport.com/schema/common_v29_0}typeMoney" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PriceRange")
public class PriceRange {

    @XmlAttribute(name = "DefaultCurrency")
    protected Boolean defaultCurrency;
    @XmlAttribute(name = "StartPrice")
    protected String startPrice;
    @XmlAttribute(name = "EndPrice")
    protected String endPrice;

    /**
     * Gets the value of the defaultCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDefaultCurrency() {
        return defaultCurrency;
    }

    /**
     * Sets the value of the defaultCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultCurrency(Boolean value) {
        this.defaultCurrency = value;
    }

    /**
     * Gets the value of the startPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartPrice() {
        return startPrice;
    }

    /**
     * Sets the value of the startPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartPrice(String value) {
        this.startPrice = value;
    }

    /**
     * Gets the value of the endPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPrice() {
        return endPrice;
    }

    /**
     * Sets the value of the endPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPrice(String value) {
        this.endPrice = value;
    }

}
