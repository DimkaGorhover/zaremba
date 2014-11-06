
package com.travelport.schema.air_v29_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v29_0.BookingTravelerRef;
import com.travelport.schema.common_v29_0.Commission;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/air_v29_0}AirBaseReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AirReservationLocatorCode"/>
 *         &lt;element name="AirPricingInfoRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}BookingTravelerRef" maxOccurs="9" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TicketingModifiersRef" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AirPricingInfoRef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}WaiverCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Commission" maxOccurs="18" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}DetailedBillingInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}FaxDetailsInformation" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AirTicketingModifiers" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReturnInfoOnFail" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="BulkTicket" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airReservationLocatorCode",
    "airPricingInfoRef",
    "ticketingModifiersRef",
    "waiverCode",
    "commission",
    "detailedBillingInformation",
    "faxDetailsInformation",
    "airTicketingModifiers"
})
@XmlRootElement(name = "AirTicketingReq")
public class AirTicketingReq
    extends AirBaseReq
{

    @XmlElement(name = "AirReservationLocatorCode", required = true)
    protected AirReservationLocatorCode airReservationLocatorCode;
    @XmlElement(name = "AirPricingInfoRef")
    protected List<AirTicketingReq.AirPricingInfoRef> airPricingInfoRef;
    @XmlElement(name = "TicketingModifiersRef")
    protected List<AirTicketingReq.TicketingModifiersRef> ticketingModifiersRef;
    @XmlElement(name = "WaiverCode")
    protected WaiverCode waiverCode;
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v29_0")
    protected List<Commission> commission;
    @XmlElement(name = "DetailedBillingInformation")
    protected List<DetailedBillingInformation> detailedBillingInformation;
    @XmlElement(name = "FaxDetailsInformation")
    protected FaxDetailsInformation faxDetailsInformation;
    @XmlElement(name = "AirTicketingModifiers")
    protected List<AirTicketingModifiers> airTicketingModifiers;
    @XmlAttribute(name = "ReturnInfoOnFail")
    protected Boolean returnInfoOnFail;
    @XmlAttribute(name = "BulkTicket")
    protected Boolean bulkTicket;

    /**
     * Provider: 1G,1V,1P,1J.
     * 
     * @return
     *     possible object is
     *     {@link AirReservationLocatorCode }
     *     
     */
    public AirReservationLocatorCode getAirReservationLocatorCode() {
        return airReservationLocatorCode;
    }

    /**
     * Sets the value of the airReservationLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationLocatorCode }
     *     
     */
    public void setAirReservationLocatorCode(AirReservationLocatorCode value) {
        this.airReservationLocatorCode = value;
    }

    /**
     * Gets the value of the airPricingInfoRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingInfoRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirTicketingReq.AirPricingInfoRef }
     * 
     * 
     */
    public List<AirTicketingReq.AirPricingInfoRef> getAirPricingInfoRef() {
        if (airPricingInfoRef == null) {
            airPricingInfoRef = new ArrayList<AirTicketingReq.AirPricingInfoRef>();
        }
        return this.airPricingInfoRef;
    }

    /**
     * Gets the value of the ticketingModifiersRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketingModifiersRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketingModifiersRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirTicketingReq.TicketingModifiersRef }
     * 
     * 
     */
    public List<AirTicketingReq.TicketingModifiersRef> getTicketingModifiersRef() {
        if (ticketingModifiersRef == null) {
            ticketingModifiersRef = new ArrayList<AirTicketingReq.TicketingModifiersRef>();
        }
        return this.ticketingModifiersRef;
    }

    /**
     * Gets the value of the waiverCode property.
     * 
     * @return
     *     possible object is
     *     {@link WaiverCode }
     *     
     */
    public WaiverCode getWaiverCode() {
        return waiverCode;
    }

    /**
     * Sets the value of the waiverCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaiverCode }
     *     
     */
    public void setWaiverCode(WaiverCode value) {
        this.waiverCode = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission }
     * 
     * 
     */
    public List<Commission> getCommission() {
        if (commission == null) {
            commission = new ArrayList<Commission>();
        }
        return this.commission;
    }

    /**
     * Provider: 1G,1V.Gets the value of the detailedBillingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailedBillingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailedBillingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedBillingInformation }
     * 
     * 
     */
    public List<DetailedBillingInformation> getDetailedBillingInformation() {
        if (detailedBillingInformation == null) {
            detailedBillingInformation = new ArrayList<DetailedBillingInformation>();
        }
        return this.detailedBillingInformation;
    }

    /**
     * Provider: 1V.
     * 
     * @return
     *     possible object is
     *     {@link FaxDetailsInformation }
     *     
     */
    public FaxDetailsInformation getFaxDetailsInformation() {
        return faxDetailsInformation;
    }

    /**
     * Sets the value of the faxDetailsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaxDetailsInformation }
     *     
     */
    public void setFaxDetailsInformation(FaxDetailsInformation value) {
        this.faxDetailsInformation = value;
    }

    /**
     * Provider: 1G,1V,1P,1J.Gets the value of the airTicketingModifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airTicketingModifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirTicketingModifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirTicketingModifiers }
     * 
     * 
     */
    public List<AirTicketingModifiers> getAirTicketingModifiers() {
        if (airTicketingModifiers == null) {
            airTicketingModifiers = new ArrayList<AirTicketingModifiers>();
        }
        return this.airTicketingModifiers;
    }

    /**
     * Gets the value of the returnInfoOnFail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getReturnInfoOnFail() {
        if (returnInfoOnFail == null) {
            return true;
        } else {
            return returnInfoOnFail;
        }
    }

    /**
     * Sets the value of the returnInfoOnFail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnInfoOnFail(Boolean value) {
        this.returnInfoOnFail = value;
    }

    /**
     * Gets the value of the bulkTicket property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getBulkTicket() {
        if (bulkTicket == null) {
            return false;
        } else {
            return bulkTicket;
        }
    }

    /**
     * Sets the value of the bulkTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBulkTicket(Boolean value) {
        this.bulkTicket = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}BookingTravelerRef" maxOccurs="9" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bookingTravelerRef"
    })
    public static class AirPricingInfoRef {

        @XmlElement(name = "BookingTravelerRef", namespace = "http://www.travelport.com/schema/common_v29_0")
        protected List<BookingTravelerRef> bookingTravelerRef;
        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the bookingTravelerRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingTravelerRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingTravelerRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BookingTravelerRef }
         * 
         * 
         */
        public List<BookingTravelerRef> getBookingTravelerRef() {
            if (bookingTravelerRef == null) {
                bookingTravelerRef = new ArrayList<BookingTravelerRef>();
            }
            return this.bookingTravelerRef;
        }

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AirPricingInfoRef" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airPricingInfoRef"
    })
    public static class TicketingModifiersRef {

        @XmlElement(name = "AirPricingInfoRef")
        protected List<com.travelport.schema.air_v29_0.AirPricingInfoRef> airPricingInfoRef;
        @XmlAttribute(name = "Key", required = true)
        protected String key;

        /**
         * Gets the value of the airPricingInfoRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airPricingInfoRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirPricingInfoRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link com.travelport.schema.air_v29_0.AirPricingInfoRef }
         * 
         * 
         */
        public List<com.travelport.schema.air_v29_0.AirPricingInfoRef> getAirPricingInfoRef() {
            if (airPricingInfoRef == null) {
                airPricingInfoRef = new ArrayList<com.travelport.schema.air_v29_0.AirPricingInfoRef>();
            }
            return this.airPricingInfoRef;
        }

        /**
         * Gets the value of the key property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKey(String value) {
            this.key = value;
        }

    }

}
