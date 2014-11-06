
package com.travelport.schema.air_v29_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This contains common elements that are used for Baggage Allowance info, carry-on allowance info and embargo Info. Supported providers are 1V/1G/1P/1J
 * 
 * <p>Java class for BaseBaggageAllowanceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseBaggageAllowanceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}URLInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}TextInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Origin" type="{http://www.travelport.com/schema/common_v29_0}typeIATACode" />
 *       &lt;attribute name="Destination" type="{http://www.travelport.com/schema/common_v29_0}typeIATACode" />
 *       &lt;attribute name="Carrier" type="{http://www.travelport.com/schema/common_v29_0}typeCarrier" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseBaggageAllowanceInfo", propOrder = {
    "urlInfo",
    "textInfo"
})
@XmlSeeAlso({
    CarryOnAllowanceInfo.class,
    BaggageAllowanceInfo.class
})
public class BaseBaggageAllowanceInfo {

    @XmlElement(name = "URLInfo")
    protected List<URLInfo> urlInfo;
    @XmlElement(name = "TextInfo")
    protected List<TextInfo> textInfo;
    @XmlAttribute(name = "Origin")
    protected String origin;
    @XmlAttribute(name = "Destination")
    protected String destination;
    @XmlAttribute(name = "Carrier")
    protected String carrier;

    /**
     * Contains the text and URL information as published by carrier.Gets the value of the urlInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getURLInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link URLInfo }
     * 
     * 
     */
    public List<URLInfo> getURLInfo() {
        if (urlInfo == null) {
            urlInfo = new ArrayList<URLInfo>();
        }
        return this.urlInfo;
    }

    /**
     * Text information as published by carrier.Gets the value of the textInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextInfo }
     * 
     * 
     */
    public List<TextInfo> getTextInfo() {
        if (textInfo == null) {
            textInfo = new ArrayList<TextInfo>();
        }
        return this.textInfo;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

}
