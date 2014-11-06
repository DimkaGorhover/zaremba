
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
 *       &lt;attribute name="BookingTravelerRef" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
 *       &lt;attribute name="SegmentRef" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
 *       &lt;attribute name="FlightDetailRef" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
 *       &lt;attribute name="SeatId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RailCoachNumber">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="4"/>
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
@XmlType(name = "")
@XmlRootElement(name = "SpecificSeatAssignment")
public class SpecificSeatAssignment {

    @XmlAttribute(name = "BookingTravelerRef", required = true)
    protected String bookingTravelerRef;
    @XmlAttribute(name = "SegmentRef", required = true)
    protected String segmentRef;
    @XmlAttribute(name = "FlightDetailRef")
    protected String flightDetailRef;
    @XmlAttribute(name = "SeatId", required = true)
    protected String seatId;
    @XmlAttribute(name = "RailCoachNumber")
    protected String railCoachNumber;

    /**
     * Gets the value of the bookingTravelerRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingTravelerRef() {
        return bookingTravelerRef;
    }

    /**
     * Sets the value of the bookingTravelerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingTravelerRef(String value) {
        this.bookingTravelerRef = value;
    }

    /**
     * Gets the value of the segmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentRef() {
        return segmentRef;
    }

    /**
     * Sets the value of the segmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentRef(String value) {
        this.segmentRef = value;
    }

    /**
     * Gets the value of the flightDetailRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightDetailRef() {
        return flightDetailRef;
    }

    /**
     * Sets the value of the flightDetailRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightDetailRef(String value) {
        this.flightDetailRef = value;
    }

    /**
     * Gets the value of the seatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatId() {
        return seatId;
    }

    /**
     * Sets the value of the seatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatId(String value) {
        this.seatId = value;
    }

    /**
     * Gets the value of the railCoachNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailCoachNumber() {
        return railCoachNumber;
    }

    /**
     * Sets the value of the railCoachNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailCoachNumber(String value) {
        this.railCoachNumber = value;
    }

}
