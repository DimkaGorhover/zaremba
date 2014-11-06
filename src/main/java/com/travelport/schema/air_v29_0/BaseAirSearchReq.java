
package com.travelport.schema.air_v29_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v29_0.BaseCoreSearchReq;


/**
 * Base Request for Low fare air Search
 * 
 * <p>Java class for BaseAirSearchReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseAirSearchReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v29_0}BaseCoreSearchReq">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.travelport.com/schema/air_v29_0}SearchAirLeg" maxOccurs="9"/>
 *           &lt;element ref="{http://www.travelport.com/schema/air_v29_0}SearchSpecificAirSegment" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AirSearchModifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}JourneyData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseAirSearchReq", propOrder = {
    "searchAirLeg",
    "searchSpecificAirSegment",
    "airSearchModifiers",
    "journeyData"
})
@XmlSeeAlso({
    BaseLowFareSearchReq.class
})
public class BaseAirSearchReq
    extends BaseCoreSearchReq
{

    @XmlElement(name = "SearchAirLeg")
    protected List<SearchAirLeg> searchAirLeg;
    @XmlElement(name = "SearchSpecificAirSegment")
    protected List<SearchSpecificAirSegment> searchSpecificAirSegment;
    @XmlElement(name = "AirSearchModifiers")
    protected AirSearchModifiers airSearchModifiers;
    @XmlElement(name = "JourneyData")
    protected JourneyData journeyData;

    /**
     * Gets the value of the searchAirLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchAirLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchAirLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchAirLeg }
     * 
     * 
     */
    public List<SearchAirLeg> getSearchAirLeg() {
        if (searchAirLeg == null) {
            searchAirLeg = new ArrayList<SearchAirLeg>();
        }
        return this.searchAirLeg;
    }

    /**
     * Gets the value of the searchSpecificAirSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchSpecificAirSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchSpecificAirSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchSpecificAirSegment }
     * 
     * 
     */
    public List<SearchSpecificAirSegment> getSearchSpecificAirSegment() {
        if (searchSpecificAirSegment == null) {
            searchSpecificAirSegment = new ArrayList<SearchSpecificAirSegment>();
        }
        return this.searchSpecificAirSegment;
    }

    /**
     * Gets the value of the airSearchModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers }
     *     
     */
    public AirSearchModifiers getAirSearchModifiers() {
        return airSearchModifiers;
    }

    /**
     * Sets the value of the airSearchModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers }
     *     
     */
    public void setAirSearchModifiers(AirSearchModifiers value) {
        this.airSearchModifiers = value;
    }

    /**
     * Gets the value of the journeyData property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyData }
     *     
     */
    public JourneyData getJourneyData() {
        return journeyData;
    }

    /**
     * Sets the value of the journeyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyData }
     *     
     */
    public void setJourneyData(JourneyData value) {
        this.journeyData = value;
    }

}
