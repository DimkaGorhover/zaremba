
package com.travelport.schema.air_v29_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v29_0.BaseRsp;
import com.travelport.schema.common_v29_0.BookingTraveler;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v29_0}BaseRsp">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}BookingTraveler" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AirReservation" minOccurs="0"/>
 *         &lt;element name="ExchangeFailureInfo" type="{http://www.travelport.com/schema/air_v29_0}typeTicketFailureInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bookingTraveler",
    "airReservation",
    "exchangeFailureInfo"
})
@XmlRootElement(name = "AirExchangeRsp")
public class AirExchangeRsp
    extends BaseRsp
{

    @XmlElement(name = "BookingTraveler", namespace = "http://www.travelport.com/schema/common_v29_0")
    protected List<BookingTraveler> bookingTraveler;
    @XmlElement(name = "AirReservation")
    protected AirReservation airReservation;
    @XmlElement(name = "ExchangeFailureInfo")
    protected List<TypeTicketFailureInfo> exchangeFailureInfo;

    /**
     * Provider: ACH.Gets the value of the bookingTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTraveler }
     * 
     * 
     */
    public List<BookingTraveler> getBookingTraveler() {
        if (bookingTraveler == null) {
            bookingTraveler = new ArrayList<BookingTraveler>();
        }
        return this.bookingTraveler;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirReservation }
     *     
     */
    public AirReservation getAirReservation() {
        return airReservation;
    }

    /**
     * Sets the value of the airReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservation }
     *     
     */
    public void setAirReservation(AirReservation value) {
        this.airReservation = value;
    }

    /**
     * Gets the value of the exchangeFailureInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeFailureInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeFailureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTicketFailureInfo }
     * 
     * 
     */
    public List<TypeTicketFailureInfo> getExchangeFailureInfo() {
        if (exchangeFailureInfo == null) {
            exchangeFailureInfo = new ArrayList<TypeTicketFailureInfo>();
        }
        return this.exchangeFailureInfo;
    }

}
