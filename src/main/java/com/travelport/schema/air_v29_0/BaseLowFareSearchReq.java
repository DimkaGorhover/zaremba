
package com.travelport.schema.air_v29_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v29_0.SearchPassenger;


/**
 * 
 *             Base Low Fare Search Request
 *         
 * 
 * <p>Java class for BaseLowFareSearchReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseLowFareSearchReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/air_v29_0}BaseAirSearchReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}SearchPassenger" maxOccurs="18"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AirPricingModifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}Enumeration" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AirExchangeModifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}FlexExploreModifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}PCC" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="EnablePointToPointSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="EnablePointToPointAlternates" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MaxNumberOfExpertSolutions" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *       &lt;attribute name="SolutionResult" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="PreferCompleteItinerary" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="MetaOptionIdentifier">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseLowFareSearchReq", propOrder = {
    "searchPassenger",
    "airPricingModifiers",
    "enumeration",
    "airExchangeModifiers",
    "flexExploreModifiers",
    "pcc"
})
@XmlSeeAlso({
    LowFareSearchAsynchReq.class,
    LowFareSearchReq.class
})
public class BaseLowFareSearchReq
    extends BaseAirSearchReq
{

    @XmlElement(name = "SearchPassenger", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
    protected List<SearchPassenger> searchPassenger;
    @XmlElement(name = "AirPricingModifiers")
    protected AirPricingModifiers airPricingModifiers;
    @XmlElement(name = "Enumeration")
    protected Enumeration enumeration;
    @XmlElement(name = "AirExchangeModifiers")
    protected AirExchangeModifiers airExchangeModifiers;
    @XmlElement(name = "FlexExploreModifiers")
    protected FlexExploreModifiers flexExploreModifiers;
    @XmlElement(name = "PCC")
    protected PCC pcc;
    @XmlAttribute(name = "EnablePointToPointSearch")
    protected Boolean enablePointToPointSearch;
    @XmlAttribute(name = "EnablePointToPointAlternates")
    protected Boolean enablePointToPointAlternates;
    @XmlAttribute(name = "MaxNumberOfExpertSolutions")
    protected BigInteger maxNumberOfExpertSolutions;
    @XmlAttribute(name = "SolutionResult")
    protected Boolean solutionResult;
    @XmlAttribute(name = "PreferCompleteItinerary")
    protected Boolean preferCompleteItinerary;
    @XmlAttribute(name = "MetaOptionIdentifier")
    protected String metaOptionIdentifier;

    /**
     * Provider: 1G,1V,1P,1J,ACH-Maxinumber of passenger increased in to 18 to support 9 INF passenger along with 9 ADT,CHD,INS 					passenger Gets the value of the searchPassenger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchPassenger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchPassenger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchPassenger }
     * 
     * 
     */
    public List<SearchPassenger> getSearchPassenger() {
        if (searchPassenger == null) {
            searchPassenger = new ArrayList<SearchPassenger>();
        }
        return this.searchPassenger;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirPricingModifiers }
     *     
     */
    public AirPricingModifiers getAirPricingModifiers() {
        return airPricingModifiers;
    }

    /**
     * Sets the value of the airPricingModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirPricingModifiers }
     *     
     */
    public void setAirPricingModifiers(AirPricingModifiers value) {
        this.airPricingModifiers = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.
     * 
     * @return
     *     possible object is
     *     {@link Enumeration }
     *     
     */
    public Enumeration getEnumeration() {
        return enumeration;
    }

    /**
     * Sets the value of the enumeration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enumeration }
     *     
     */
    public void setEnumeration(Enumeration value) {
        this.enumeration = value;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirExchangeModifiers }
     *     
     */
    public AirExchangeModifiers getAirExchangeModifiers() {
        return airExchangeModifiers;
    }

    /**
     * Sets the value of the airExchangeModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirExchangeModifiers }
     *     
     */
    public void setAirExchangeModifiers(AirExchangeModifiers value) {
        this.airExchangeModifiers = value;
    }

    /**
     * This is the container for a set of modifiers which allow the user to perform a special kind of low fare search, depicted as flex explore, based on different parameters like Area, Zone, Country, State, Specific locations, Distance around the actual destination of the itinerary. Applicable for providers 1G,1V,1P.
     * 
     * @return
     *     possible object is
     *     {@link FlexExploreModifiers }
     *     
     */
    public FlexExploreModifiers getFlexExploreModifiers() {
        return flexExploreModifiers;
    }

    /**
     * Sets the value of the flexExploreModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlexExploreModifiers }
     *     
     */
    public void setFlexExploreModifiers(FlexExploreModifiers value) {
        this.flexExploreModifiers = value;
    }

    /**
     * Gets the value of the pcc property.
     * 
     * @return
     *     possible object is
     *     {@link PCC }
     *     
     */
    public PCC getPCC() {
        return pcc;
    }

    /**
     * Sets the value of the pcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCC }
     *     
     */
    public void setPCC(PCC value) {
        this.pcc = value;
    }

    /**
     * Gets the value of the enablePointToPointSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getEnablePointToPointSearch() {
        if (enablePointToPointSearch == null) {
            return false;
        } else {
            return enablePointToPointSearch;
        }
    }

    /**
     * Sets the value of the enablePointToPointSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnablePointToPointSearch(Boolean value) {
        this.enablePointToPointSearch = value;
    }

    /**
     * Gets the value of the enablePointToPointAlternates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getEnablePointToPointAlternates() {
        if (enablePointToPointAlternates == null) {
            return false;
        } else {
            return enablePointToPointAlternates;
        }
    }

    /**
     * Sets the value of the enablePointToPointAlternates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnablePointToPointAlternates(Boolean value) {
        this.enablePointToPointAlternates = value;
    }

    /**
     * Gets the value of the maxNumberOfExpertSolutions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxNumberOfExpertSolutions() {
        if (maxNumberOfExpertSolutions == null) {
            return new BigInteger("0");
        } else {
            return maxNumberOfExpertSolutions;
        }
    }

    /**
     * Sets the value of the maxNumberOfExpertSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxNumberOfExpertSolutions(BigInteger value) {
        this.maxNumberOfExpertSolutions = value;
    }

    /**
     * Gets the value of the solutionResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getSolutionResult() {
        if (solutionResult == null) {
            return true;
        } else {
            return solutionResult;
        }
    }

    /**
     * Sets the value of the solutionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSolutionResult(Boolean value) {
        this.solutionResult = value;
    }

    /**
     * Gets the value of the preferCompleteItinerary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getPreferCompleteItinerary() {
        if (preferCompleteItinerary == null) {
            return true;
        } else {
            return preferCompleteItinerary;
        }
    }

    /**
     * Sets the value of the preferCompleteItinerary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferCompleteItinerary(Boolean value) {
        this.preferCompleteItinerary = value;
    }

    /**
     * Gets the value of the metaOptionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetaOptionIdentifier() {
        return metaOptionIdentifier;
    }

    /**
     * Sets the value of the metaOptionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetaOptionIdentifier(String value) {
        this.metaOptionIdentifier = value;
    }

}
