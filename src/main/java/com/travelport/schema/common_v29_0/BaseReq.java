
package com.travelport.schema.common_v29_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v29_0.AirBaseReq;
import com.travelport.schema.air_v29_0.AirExchangeQuoteReq;
import com.travelport.schema.air_v29_0.AirExchangeReq;
import com.travelport.schema.air_v29_0.AirExchangeTicketingReq;
import com.travelport.schema.air_v29_0.AirFareDisplayReq;
import com.travelport.schema.air_v29_0.AirFareRulesReq;
import com.travelport.schema.air_v29_0.AirMerchandisingDetailsReq;
import com.travelport.schema.air_v29_0.AirMerchandisingOfferAvailabilityReq;
import com.travelport.schema.air_v29_0.AirPrePayReq;
import com.travelport.schema.air_v29_0.AirRefundQuoteReq;
import com.travelport.schema.air_v29_0.AirRefundReq;
import com.travelport.schema.air_v29_0.AirRetrieveDocumentReq;
import com.travelport.schema.air_v29_0.AirVoidDocumentReq;
import com.travelport.schema.air_v29_0.EMDIssuanceReq;
import com.travelport.schema.air_v29_0.EMDRetrieveReq;
import com.travelport.schema.air_v29_0.FlightDetailsReq;
import com.travelport.schema.air_v29_0.FlightInformationReq;
import com.travelport.schema.air_v29_0.RetrieveLowFareSearchReq;
import com.travelport.schema.air_v29_0.SeatMapReq;


/**
 * <p>Java class for BaseReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v29_0}BaseCoreReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}OverridePCC" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RetrieveProviderReservationDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseReq", propOrder = {
    "overridePCC"
})
@XmlSeeAlso({
    BaseCreateReservationReq.class,
    AirExchangeReq.class,
    RetrieveLowFareSearchReq.class,
    AirVoidDocumentReq.class,
    AirRefundQuoteReq.class,
    AirFareDisplayReq.class,
    EMDIssuanceReq.class,
    FlightInformationReq.class,
    AirExchangeQuoteReq.class,
    AirRefundReq.class,
    AirPrePayReq.class,
    BaseSearchReq.class,
    AirRetrieveDocumentReq.class,
    AirFareRulesReq.class,
    FlightDetailsReq.class,
    AirBaseReq.class,
    AirMerchandisingOfferAvailabilityReq.class,
    EMDRetrieveReq.class,
    AirMerchandisingDetailsReq.class,
    SeatMapReq.class,
    AirExchangeTicketingReq.class
})
public class BaseReq
    extends BaseCoreReq
{

    @XmlElement(name = "OverridePCC")
    protected OverridePCC overridePCC;
    @XmlAttribute(name = "RetrieveProviderReservationDetails")
    protected Boolean retrieveProviderReservationDetails;

    /**
     * Gets the value of the overridePCC property.
     * 
     * @return
     *     possible object is
     *     {@link OverridePCC }
     *     
     */
    public OverridePCC getOverridePCC() {
        return overridePCC;
    }

    /**
     * Sets the value of the overridePCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverridePCC }
     *     
     */
    public void setOverridePCC(OverridePCC value) {
        this.overridePCC = value;
    }

    /**
     * Gets the value of the retrieveProviderReservationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getRetrieveProviderReservationDetails() {
        if (retrieveProviderReservationDetails == null) {
            return false;
        } else {
            return retrieveProviderReservationDetails;
        }
    }

    /**
     * Sets the value of the retrieveProviderReservationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveProviderReservationDetails(Boolean value) {
        this.retrieveProviderReservationDetails = value;
    }

}
