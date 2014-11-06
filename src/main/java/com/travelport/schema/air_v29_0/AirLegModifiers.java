
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
import com.travelport.schema.common_v29_0.CabinClass;
import com.travelport.schema.common_v29_0.Carrier;
import com.travelport.schema.common_v29_0.TypeLocation;


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
 *         &lt;element name="PreferredCabins" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}CabinClass"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProhibitedCabins" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}CabinClass" maxOccurs="3"/>
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
 *         &lt;element name="PermittedCabins" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}CabinClass" maxOccurs="5"/>
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
 *         &lt;element name="PermittedConnectionPoints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ConnectionPoint" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProhibitedConnectionPoints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ConnectionPoint" maxOccurs="unbounded"/>
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}FlightType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ProhibitOvernightLayovers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MaxConnectionTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ReturnFirstAvailableOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AllowDirectAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
    "preferredCabins",
    "prohibitedCabins",
    "preferredCarriers",
    "permittedCabins",
    "prohibitedCarriers",
    "permittedCarriers",
    "permittedConnectionPoints",
    "prohibitedConnectionPoints",
    "permittedBookingCodes",
    "preferredAlliances",
    "prohibitedBookingCodes",
    "disfavoredAlliances",
    "flightType"
})
@XmlRootElement(name = "AirLegModifiers")
public class AirLegModifiers {

    @XmlElement(name = "PreferredCabins")
    protected AirLegModifiers.PreferredCabins preferredCabins;
    @XmlElement(name = "ProhibitedCabins")
    protected AirLegModifiers.ProhibitedCabins prohibitedCabins;
    @XmlElement(name = "PreferredCarriers")
    protected AirLegModifiers.PreferredCarriers preferredCarriers;
    @XmlElement(name = "PermittedCabins")
    protected AirLegModifiers.PermittedCabins permittedCabins;
    @XmlElement(name = "ProhibitedCarriers")
    protected AirLegModifiers.ProhibitedCarriers prohibitedCarriers;
    @XmlElement(name = "PermittedCarriers")
    protected AirLegModifiers.PermittedCarriers permittedCarriers;
    @XmlElement(name = "PermittedConnectionPoints")
    protected AirLegModifiers.PermittedConnectionPoints permittedConnectionPoints;
    @XmlElement(name = "ProhibitedConnectionPoints")
    protected AirLegModifiers.ProhibitedConnectionPoints prohibitedConnectionPoints;
    @XmlElement(name = "PermittedBookingCodes")
    protected AirLegModifiers.PermittedBookingCodes permittedBookingCodes;
    @XmlElement(name = "PreferredAlliances")
    protected AirLegModifiers.PreferredAlliances preferredAlliances;
    @XmlElement(name = "ProhibitedBookingCodes")
    protected AirLegModifiers.ProhibitedBookingCodes prohibitedBookingCodes;
    @XmlElement(name = "DisfavoredAlliances")
    protected AirLegModifiers.DisfavoredAlliances disfavoredAlliances;
    @XmlElement(name = "FlightType")
    protected FlightType flightType;
    @XmlAttribute(name = "ProhibitOvernightLayovers")
    protected Boolean prohibitOvernightLayovers;
    @XmlAttribute(name = "MaxConnectionTime")
    protected BigInteger maxConnectionTime;
    @XmlAttribute(name = "ReturnFirstAvailableOnly")
    protected Boolean returnFirstAvailableOnly;
    @XmlAttribute(name = "AllowDirectAccess")
    protected Boolean allowDirectAccess;
    @XmlAttribute(name = "ProhibitMultiAirportConnection")
    protected Boolean prohibitMultiAirportConnection;
    @XmlAttribute(name = "PreferNonStop")
    protected Boolean preferNonStop;
    @XmlAttribute(name = "OrderBy")
    protected String orderBy;

    /**
     * Gets the value of the preferredCabins property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PreferredCabins }
     *     
     */
    public AirLegModifiers.PreferredCabins getPreferredCabins() {
        return preferredCabins;
    }

    /**
     * Sets the value of the preferredCabins property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PreferredCabins }
     *     
     */
    public void setPreferredCabins(AirLegModifiers.PreferredCabins value) {
        this.preferredCabins = value;
    }

    /**
     * Gets the value of the prohibitedCabins property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.ProhibitedCabins }
     *     
     */
    public AirLegModifiers.ProhibitedCabins getProhibitedCabins() {
        return prohibitedCabins;
    }

    /**
     * Sets the value of the prohibitedCabins property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.ProhibitedCabins }
     *     
     */
    public void setProhibitedCabins(AirLegModifiers.ProhibitedCabins value) {
        this.prohibitedCabins = value;
    }

    /**
     * Gets the value of the preferredCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PreferredCarriers }
     *     
     */
    public AirLegModifiers.PreferredCarriers getPreferredCarriers() {
        return preferredCarriers;
    }

    /**
     * Sets the value of the preferredCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PreferredCarriers }
     *     
     */
    public void setPreferredCarriers(AirLegModifiers.PreferredCarriers value) {
        this.preferredCarriers = value;
    }

    /**
     * Gets the value of the permittedCabins property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PermittedCabins }
     *     
     */
    public AirLegModifiers.PermittedCabins getPermittedCabins() {
        return permittedCabins;
    }

    /**
     * Sets the value of the permittedCabins property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PermittedCabins }
     *     
     */
    public void setPermittedCabins(AirLegModifiers.PermittedCabins value) {
        this.permittedCabins = value;
    }

    /**
     * Gets the value of the prohibitedCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.ProhibitedCarriers }
     *     
     */
    public AirLegModifiers.ProhibitedCarriers getProhibitedCarriers() {
        return prohibitedCarriers;
    }

    /**
     * Sets the value of the prohibitedCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.ProhibitedCarriers }
     *     
     */
    public void setProhibitedCarriers(AirLegModifiers.ProhibitedCarriers value) {
        this.prohibitedCarriers = value;
    }

    /**
     * Gets the value of the permittedCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PermittedCarriers }
     *     
     */
    public AirLegModifiers.PermittedCarriers getPermittedCarriers() {
        return permittedCarriers;
    }

    /**
     * Sets the value of the permittedCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PermittedCarriers }
     *     
     */
    public void setPermittedCarriers(AirLegModifiers.PermittedCarriers value) {
        this.permittedCarriers = value;
    }

    /**
     * Gets the value of the permittedConnectionPoints property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PermittedConnectionPoints }
     *     
     */
    public AirLegModifiers.PermittedConnectionPoints getPermittedConnectionPoints() {
        return permittedConnectionPoints;
    }

    /**
     * Sets the value of the permittedConnectionPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PermittedConnectionPoints }
     *     
     */
    public void setPermittedConnectionPoints(AirLegModifiers.PermittedConnectionPoints value) {
        this.permittedConnectionPoints = value;
    }

    /**
     * Gets the value of the prohibitedConnectionPoints property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.ProhibitedConnectionPoints }
     *     
     */
    public AirLegModifiers.ProhibitedConnectionPoints getProhibitedConnectionPoints() {
        return prohibitedConnectionPoints;
    }

    /**
     * Sets the value of the prohibitedConnectionPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.ProhibitedConnectionPoints }
     *     
     */
    public void setProhibitedConnectionPoints(AirLegModifiers.ProhibitedConnectionPoints value) {
        this.prohibitedConnectionPoints = value;
    }

    /**
     * Gets the value of the permittedBookingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PermittedBookingCodes }
     *     
     */
    public AirLegModifiers.PermittedBookingCodes getPermittedBookingCodes() {
        return permittedBookingCodes;
    }

    /**
     * Sets the value of the permittedBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PermittedBookingCodes }
     *     
     */
    public void setPermittedBookingCodes(AirLegModifiers.PermittedBookingCodes value) {
        this.permittedBookingCodes = value;
    }

    /**
     * Gets the value of the preferredAlliances property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PreferredAlliances }
     *     
     */
    public AirLegModifiers.PreferredAlliances getPreferredAlliances() {
        return preferredAlliances;
    }

    /**
     * Sets the value of the preferredAlliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PreferredAlliances }
     *     
     */
    public void setPreferredAlliances(AirLegModifiers.PreferredAlliances value) {
        this.preferredAlliances = value;
    }

    /**
     * Gets the value of the prohibitedBookingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.ProhibitedBookingCodes }
     *     
     */
    public AirLegModifiers.ProhibitedBookingCodes getProhibitedBookingCodes() {
        return prohibitedBookingCodes;
    }

    /**
     * Sets the value of the prohibitedBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.ProhibitedBookingCodes }
     *     
     */
    public void setProhibitedBookingCodes(AirLegModifiers.ProhibitedBookingCodes value) {
        this.prohibitedBookingCodes = value;
    }

    /**
     * Gets the value of the disfavoredAlliances property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.DisfavoredAlliances }
     *     
     */
    public AirLegModifiers.DisfavoredAlliances getDisfavoredAlliances() {
        return disfavoredAlliances;
    }

    /**
     * Sets the value of the disfavoredAlliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.DisfavoredAlliances }
     *     
     */
    public void setDisfavoredAlliances(AirLegModifiers.DisfavoredAlliances value) {
        this.disfavoredAlliances = value;
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
     * Gets the value of the returnFirstAvailableOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getReturnFirstAvailableOnly() {
        return returnFirstAvailableOnly;
    }

    /**
     * Sets the value of the returnFirstAvailableOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnFirstAvailableOnly(Boolean value) {
        this.returnFirstAvailableOnly = value;
    }

    /**
     * Gets the value of the allowDirectAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getAllowDirectAccess() {
        if (allowDirectAccess == null) {
            return false;
        } else {
            return allowDirectAccess;
        }
    }

    /**
     * Sets the value of the allowDirectAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowDirectAccess(Boolean value) {
        this.allowDirectAccess = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}CabinClass" maxOccurs="5"/>
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
        "cabinClass"
    })
    public static class PermittedCabins {

        @XmlElement(name = "CabinClass", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        protected List<CabinClass> cabinClass;

        /**
         * Gets the value of the cabinClass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabinClass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabinClass().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CabinClass }
         * 
         * 
         */
        public List<CabinClass> getCabinClass() {
            if (cabinClass == null) {
                cabinClass = new ArrayList<CabinClass>();
            }
            return this.cabinClass;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ConnectionPoint" maxOccurs="unbounded"/>
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
        "connectionPoint"
    })
    public static class PermittedConnectionPoints {

        @XmlElement(name = "ConnectionPoint", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        protected List<TypeLocation> connectionPoint;

        /**
         * Gets the value of the connectionPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connectionPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConnectionPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeLocation }
         * 
         * 
         */
        public List<TypeLocation> getConnectionPoint() {
            if (connectionPoint == null) {
                connectionPoint = new ArrayList<TypeLocation>();
            }
            return this.connectionPoint;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}CabinClass"/>
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
        "cabinClass"
    })
    public static class PreferredCabins {

        @XmlElement(name = "CabinClass", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        protected CabinClass cabinClass;

        /**
         * Gets the value of the cabinClass property.
         * 
         * @return
         *     possible object is
         *     {@link CabinClass }
         *     
         */
        public CabinClass getCabinClass() {
            return cabinClass;
        }

        /**
         * Sets the value of the cabinClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link CabinClass }
         *     
         */
        public void setCabinClass(CabinClass value) {
            this.cabinClass = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}CabinClass" maxOccurs="3"/>
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
        "cabinClass"
    })
    public static class ProhibitedCabins {

        @XmlElement(name = "CabinClass", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        protected List<CabinClass> cabinClass;

        /**
         * Gets the value of the cabinClass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabinClass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabinClass().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CabinClass }
         * 
         * 
         */
        public List<CabinClass> getCabinClass() {
            if (cabinClass == null) {
                cabinClass = new ArrayList<CabinClass>();
            }
            return this.cabinClass;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ConnectionPoint" maxOccurs="unbounded"/>
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
        "connectionPoint"
    })
    public static class ProhibitedConnectionPoints {

        @XmlElement(name = "ConnectionPoint", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        protected List<TypeLocation> connectionPoint;

        /**
         * Gets the value of the connectionPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connectionPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConnectionPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeLocation }
         * 
         * 
         */
        public List<TypeLocation> getConnectionPoint() {
            if (connectionPoint == null) {
                connectionPoint = new ArrayList<TypeLocation>();
            }
            return this.connectionPoint;
        }

    }

}
