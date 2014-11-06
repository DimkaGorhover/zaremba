
package com.travelport.schema.air_v29_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v29_0.Carrier;
import com.travelport.schema.common_v29_0.Provider;
import com.travelport.schema.common_v29_0.TypeDistance;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DisfavoredProviders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Provider" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreferredProviders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Provider" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DisfavoredCarriers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Carrier" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreferredCarriers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Carrier" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PermittedCarriers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Carrier" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProhibitedCarriers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Carrier" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreferredAlliances" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v29_0}Alliance" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DisfavoredAlliances" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v29_0}Alliance" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PermittedBookingCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v29_0}BookingCode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProhibitedBookingCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v29_0}BookingCode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}FlightType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DistanceType" type="{http://www.travelport.com/schema/common_v29_0}typeDistance" default="MI" />
 *       &lt;attribute name="IncludeFlightDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="AllowChangeOfAirport" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="ProhibitOvernightLayovers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MaxSolutions" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MaxConnectionTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="SearchWeekends" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IncludeExtraSolutions" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ProhibitMultiAirportConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PreferNonStop" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OrderBy">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="JourneyTime"/>
 *             &lt;enumeration value="DepartureTime"/>
 *             &lt;enumeration value="ArrivalTime"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "disfavoredProviders",
    "preferredProviders",
    "disfavoredCarriers",
    "preferredCarriers",
    "permittedCarriers",
    "prohibitedCarriers",
    "preferredAlliances",
    "disfavoredAlliances",
    "permittedBookingCodes",
    "prohibitedBookingCodes",
    "flightType"
})
@XmlRootElement(name = "AirSearchModifiers")
public class AirSearchModifiers {

    @XmlElement(name = "DisfavoredProviders")
    protected AirSearchModifiers.DisfavoredProviders disfavoredProviders;
    @XmlElement(name = "PreferredProviders")
    protected AirSearchModifiers.PreferredProviders preferredProviders;
    @XmlElement(name = "DisfavoredCarriers")
    protected AirSearchModifiers.DisfavoredCarriers disfavoredCarriers;
    @XmlElement(name = "PreferredCarriers")
    protected AirSearchModifiers.PreferredCarriers preferredCarriers;
    @XmlElement(name = "PermittedCarriers")
    protected AirSearchModifiers.PermittedCarriers permittedCarriers;
    @XmlElement(name = "ProhibitedCarriers")
    protected AirSearchModifiers.ProhibitedCarriers prohibitedCarriers;
    @XmlElement(name = "PreferredAlliances")
    protected AirSearchModifiers.PreferredAlliances preferredAlliances;
    @XmlElement(name = "DisfavoredAlliances")
    protected AirSearchModifiers.DisfavoredAlliances disfavoredAlliances;
    @XmlElement(name = "PermittedBookingCodes")
    protected AirSearchModifiers.PermittedBookingCodes permittedBookingCodes;
    @XmlElement(name = "ProhibitedBookingCodes")
    protected AirSearchModifiers.ProhibitedBookingCodes prohibitedBookingCodes;
    @XmlElement(name = "FlightType")
    protected FlightType flightType;
    @XmlAttribute(name = "DistanceType")
    protected TypeDistance distanceType;
    @XmlAttribute(name = "IncludeFlightDetails")
    protected Boolean includeFlightDetails;
    @XmlAttribute(name = "AllowChangeOfAirport")
    protected Boolean allowChangeOfAirport;
    @XmlAttribute(name = "ProhibitOvernightLayovers")
    protected Boolean prohibitOvernightLayovers;
    @XmlAttribute(name = "MaxSolutions")
    protected BigInteger maxSolutions;
    @XmlAttribute(name = "MaxConnectionTime")
    protected BigInteger maxConnectionTime;
    @XmlAttribute(name = "SearchWeekends")
    protected Boolean searchWeekends;
    @XmlAttribute(name = "IncludeExtraSolutions")
    protected Boolean includeExtraSolutions;
    @XmlAttribute(name = "ProhibitMultiAirportConnection")
    protected Boolean prohibitMultiAirportConnection;
    @XmlAttribute(name = "PreferNonStop")
    protected Boolean preferNonStop;
    @XmlAttribute(name = "OrderBy")
    protected String orderBy;

    /**
     * Gets the value of the disfavoredProviders property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.DisfavoredProviders }
     *     
     */
    public AirSearchModifiers.DisfavoredProviders getDisfavoredProviders() {
        return disfavoredProviders;
    }

    /**
     * Sets the value of the disfavoredProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.DisfavoredProviders }
     *     
     */
    public void setDisfavoredProviders(AirSearchModifiers.DisfavoredProviders value) {
        this.disfavoredProviders = value;
    }

    /**
     * Gets the value of the preferredProviders property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.PreferredProviders }
     *     
     */
    public AirSearchModifiers.PreferredProviders getPreferredProviders() {
        return preferredProviders;
    }

    /**
     * Sets the value of the preferredProviders property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.PreferredProviders }
     *     
     */
    public void setPreferredProviders(AirSearchModifiers.PreferredProviders value) {
        this.preferredProviders = value;
    }

    /**
     * Gets the value of the disfavoredCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.DisfavoredCarriers }
     *     
     */
    public AirSearchModifiers.DisfavoredCarriers getDisfavoredCarriers() {
        return disfavoredCarriers;
    }

    /**
     * Sets the value of the disfavoredCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.DisfavoredCarriers }
     *     
     */
    public void setDisfavoredCarriers(AirSearchModifiers.DisfavoredCarriers value) {
        this.disfavoredCarriers = value;
    }

    /**
     * Gets the value of the preferredCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.PreferredCarriers }
     *     
     */
    public AirSearchModifiers.PreferredCarriers getPreferredCarriers() {
        return preferredCarriers;
    }

    /**
     * Sets the value of the preferredCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.PreferredCarriers }
     *     
     */
    public void setPreferredCarriers(AirSearchModifiers.PreferredCarriers value) {
        this.preferredCarriers = value;
    }

    /**
     * Gets the value of the permittedCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.PermittedCarriers }
     *     
     */
    public AirSearchModifiers.PermittedCarriers getPermittedCarriers() {
        return permittedCarriers;
    }

    /**
     * Sets the value of the permittedCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.PermittedCarriers }
     *     
     */
    public void setPermittedCarriers(AirSearchModifiers.PermittedCarriers value) {
        this.permittedCarriers = value;
    }

    /**
     * Gets the value of the prohibitedCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.ProhibitedCarriers }
     *     
     */
    public AirSearchModifiers.ProhibitedCarriers getProhibitedCarriers() {
        return prohibitedCarriers;
    }

    /**
     * Sets the value of the prohibitedCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.ProhibitedCarriers }
     *     
     */
    public void setProhibitedCarriers(AirSearchModifiers.ProhibitedCarriers value) {
        this.prohibitedCarriers = value;
    }

    /**
     * Gets the value of the preferredAlliances property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.PreferredAlliances }
     *     
     */
    public AirSearchModifiers.PreferredAlliances getPreferredAlliances() {
        return preferredAlliances;
    }

    /**
     * Sets the value of the preferredAlliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.PreferredAlliances }
     *     
     */
    public void setPreferredAlliances(AirSearchModifiers.PreferredAlliances value) {
        this.preferredAlliances = value;
    }

    /**
     * Gets the value of the disfavoredAlliances property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.DisfavoredAlliances }
     *     
     */
    public AirSearchModifiers.DisfavoredAlliances getDisfavoredAlliances() {
        return disfavoredAlliances;
    }

    /**
     * Sets the value of the disfavoredAlliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.DisfavoredAlliances }
     *     
     */
    public void setDisfavoredAlliances(AirSearchModifiers.DisfavoredAlliances value) {
        this.disfavoredAlliances = value;
    }

    /**
     * Gets the value of the permittedBookingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.PermittedBookingCodes }
     *     
     */
    public AirSearchModifiers.PermittedBookingCodes getPermittedBookingCodes() {
        return permittedBookingCodes;
    }

    /**
     * Sets the value of the permittedBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.PermittedBookingCodes }
     *     
     */
    public void setPermittedBookingCodes(AirSearchModifiers.PermittedBookingCodes value) {
        this.permittedBookingCodes = value;
    }

    /**
     * Gets the value of the prohibitedBookingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchModifiers.ProhibitedBookingCodes }
     *     
     */
    public AirSearchModifiers.ProhibitedBookingCodes getProhibitedBookingCodes() {
        return prohibitedBookingCodes;
    }

    /**
     * Sets the value of the prohibitedBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchModifiers.ProhibitedBookingCodes }
     *     
     */
    public void setProhibitedBookingCodes(AirSearchModifiers.ProhibitedBookingCodes value) {
        this.prohibitedBookingCodes = value;
    }

    /**
     * Gets the value of the flightType property.
     * 
     * @return
     *     possible object is
     *     {@link FlightType }
     *     
     */
    public FlightType getFlightType() {
        return flightType;
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightType }
     *     
     */
    public void setFlightType(FlightType value) {
        this.flightType = value;
    }

    /**
     * Gets the value of the distanceType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDistance }
     *     
     */
    public TypeDistance getDistanceType() {
        if (distanceType == null) {
            return TypeDistance.MI;
        } else {
            return distanceType;
        }
    }

    /**
     * Sets the value of the distanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDistance }
     *     
     */
    public void setDistanceType(TypeDistance value) {
        this.distanceType = value;
    }

    /**
     * Gets the value of the includeFlightDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getIncludeFlightDetails() {
        if (includeFlightDetails == null) {
            return true;
        } else {
            return includeFlightDetails;
        }
    }

    /**
     * Sets the value of the includeFlightDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeFlightDetails(Boolean value) {
        this.includeFlightDetails = value;
    }

    /**
     * Gets the value of the allowChangeOfAirport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getAllowChangeOfAirport() {
        if (allowChangeOfAirport == null) {
            return true;
        } else {
            return allowChangeOfAirport;
        }
    }

    /**
     * Sets the value of the allowChangeOfAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowChangeOfAirport(Boolean value) {
        this.allowChangeOfAirport = value;
    }

    /**
     * Gets the value of the prohibitOvernightLayovers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getProhibitOvernightLayovers() {
        if (prohibitOvernightLayovers == null) {
            return false;
        } else {
            return prohibitOvernightLayovers;
        }
    }

    /**
     * Sets the value of the prohibitOvernightLayovers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitOvernightLayovers(Boolean value) {
        this.prohibitOvernightLayovers = value;
    }

    /**
     * Gets the value of the maxSolutions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSolutions() {
        return maxSolutions;
    }

    /**
     * Sets the value of the maxSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSolutions(BigInteger value) {
        this.maxSolutions = value;
    }

    /**
     * Gets the value of the maxConnectionTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxConnectionTime() {
        return maxConnectionTime;
    }

    /**
     * Sets the value of the maxConnectionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxConnectionTime(BigInteger value) {
        this.maxConnectionTime = value;
    }

    /**
     * Gets the value of the searchWeekends property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSearchWeekends() {
        return searchWeekends;
    }

    /**
     * Sets the value of the searchWeekends property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearchWeekends(Boolean value) {
        this.searchWeekends = value;
    }

    /**
     * Gets the value of the includeExtraSolutions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIncludeExtraSolutions() {
        return includeExtraSolutions;
    }

    /**
     * Sets the value of the includeExtraSolutions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeExtraSolutions(Boolean value) {
        this.includeExtraSolutions = value;
    }

    /**
     * Gets the value of the prohibitMultiAirportConnection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getProhibitMultiAirportConnection() {
        return prohibitMultiAirportConnection;
    }

    /**
     * Sets the value of the prohibitMultiAirportConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProhibitMultiAirportConnection(Boolean value) {
        this.prohibitMultiAirportConnection = value;
    }

    /**
     * Gets the value of the preferNonStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getPreferNonStop() {
        if (preferNonStop == null) {
            return false;
        } else {
            return preferNonStop;
        }
    }

    /**
     * Sets the value of the preferNonStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferNonStop(Boolean value) {
        this.preferNonStop = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderBy(String value) {
        this.orderBy = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}Alliance" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "alliance"
    })
    public static class DisfavoredAlliances {

        @XmlElement(name = "Alliance", required = true)
        protected List<Alliance> alliance;

        /**
         * Gets the value of the alliance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alliance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlliance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Alliance }
         * 
         * 
         */
        public List<Alliance> getAlliance() {
            if (alliance == null) {
                alliance = new ArrayList<Alliance>();
            }
            return this.alliance;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Carrier" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "carrier"
    })
    public static class DisfavoredCarriers {

        @XmlElement(name = "Carrier", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        protected List<Carrier> carrier;

        /**
         * Gets the value of the carrier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Carrier }
         * 
         * 
         */
        public List<Carrier> getCarrier() {
            if (carrier == null) {
                carrier = new ArrayList<Carrier>();
            }
            return this.carrier;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Provider" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "provider"
    })
    public static class DisfavoredProviders {

        @XmlElement(name = "Provider", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        protected List<Provider> provider;

        /**
         * Gets the value of the provider property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the provider property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProvider().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Provider }
         * 
         * 
         */
        public List<Provider> getProvider() {
            if (provider == null) {
                provider = new ArrayList<Provider>();
            }
            return this.provider;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}BookingCode" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bookingCode"
    })
    public static class PermittedBookingCodes {

        @XmlElement(name = "BookingCode", required = true)
        protected List<BookingCode> bookingCode;

        /**
         * Gets the value of the bookingCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookingCode }
         * 
         * 
         */
        public List<BookingCode> getBookingCode() {
            if (bookingCode == null) {
                bookingCode = new ArrayList<BookingCode>();
            }
            return this.bookingCode;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Carrier" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "carrier"
    })
    public static class PermittedCarriers {

        @XmlElement(name = "Carrier", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        protected List<Carrier> carrier;

        /**
         * Gets the value of the carrier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Carrier }
         * 
         * 
         */
        public List<Carrier> getCarrier() {
            if (carrier == null) {
                carrier = new ArrayList<Carrier>();
            }
            return this.carrier;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}Alliance" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "alliance"
    })
    public static class PreferredAlliances {

        @XmlElement(name = "Alliance", required = true)
        protected List<Alliance> alliance;

        /**
         * Gets the value of the alliance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alliance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlliance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Alliance }
         * 
         * 
         */
        public List<Alliance> getAlliance() {
            if (alliance == null) {
                alliance = new ArrayList<Alliance>();
            }
            return this.alliance;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Carrier" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "carrier"
    })
    public static class PreferredCarriers {

        @XmlElement(name = "Carrier", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        protected List<Carrier> carrier;

        /**
         * Gets the value of the carrier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Carrier }
         * 
         * 
         */
        public List<Carrier> getCarrier() {
            if (carrier == null) {
                carrier = new ArrayList<Carrier>();
            }
            return this.carrier;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Provider" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "provider"
    })
    public static class PreferredProviders {

        @XmlElement(name = "Provider", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        protected List<Provider> provider;

        /**
         * Gets the value of the provider property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the provider property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProvider().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Provider }
         * 
         * 
         */
        public List<Provider> getProvider() {
            if (provider == null) {
                provider = new ArrayList<Provider>();
            }
            return this.provider;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}BookingCode" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bookingCode"
    })
    public static class ProhibitedBookingCodes {

        @XmlElement(name = "BookingCode", required = true)
        protected List<BookingCode> bookingCode;

        /**
         * Gets the value of the bookingCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookingCode }
         * 
         * 
         */
        public List<BookingCode> getBookingCode() {
            if (bookingCode == null) {
                bookingCode = new ArrayList<BookingCode>();
            }
            return this.bookingCode;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Carrier" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "carrier"
    })
    public static class ProhibitedCarriers {

        @XmlElement(name = "Carrier", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        protected List<Carrier> carrier;

        /**
         * Gets the value of the carrier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Carrier }
         * 
         * 
         */
        public List<Carrier> getCarrier() {
            if (carrier == null) {
                carrier = new ArrayList<Carrier>();
            }
            return this.carrier;
        }

    }

}
