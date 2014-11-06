
package com.travelport.schema.air_v29_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v29_0.BaseReq;
import com.travelport.schema.common_v29_0.FormOfPayment;
import com.travelport.schema.common_v29_0.FormOfPaymentRef;
import com.travelport.schema.common_v29_0.HostToken;
import com.travelport.schema.common_v29_0.SSRInfo;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v29_0}BaseReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AirReservationLocatorCode"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}SpecificSeatAssignment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AirPricingInfo" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AirExchangeModifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AirSegment" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AirExchangeBundle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}TCRExchangeBundle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}HostToken" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}OptionalServices" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}FormOfPayment" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}FormOfPaymentRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}SSRInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ReturnReservation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
    "specificSeatAssignment",
    "airPricingInfo",
    "airExchangeModifiers",
    "airSegment",
    "airExchangeBundle",
    "tcrExchangeBundle",
    "hostToken",
    "optionalServices",
    "formOfPayment",
    "formOfPaymentRef",
    "ssrInfo"
})
@XmlRootElement(name = "AirExchangeReq")
public class AirExchangeReq
    extends BaseReq
{

    @XmlElement(name = "AirReservationLocatorCode", required = true)
    protected AirReservationLocatorCode airReservationLocatorCode;
    @XmlElement(name = "SpecificSeatAssignment")
    protected List<SpecificSeatAssignment> specificSeatAssignment;
    @XmlElement(name = "AirPricingInfo", required = true)
    protected List<AirPricingInfo> airPricingInfo;
    @XmlElement(name = "AirExchangeModifiers")
    protected AirExchangeModifiers airExchangeModifiers;
    @XmlElement(name = "AirSegment", required = true)
    protected List<TypeBaseAirSegment> airSegment;
    @XmlElement(name = "AirExchangeBundle")
    protected List<AirExchangeBundle> airExchangeBundle;
    @XmlElement(name = "TCRExchangeBundle")
    protected List<TCRExchangeBundle> tcrExchangeBundle;
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v29_0")
    protected List<HostToken> hostToken;
    @XmlElement(name = "OptionalServices")
    protected OptionalServices optionalServices;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v29_0")
    protected FormOfPayment formOfPayment;
    @XmlElement(name = "FormOfPaymentRef", namespace = "http://www.travelport.com/schema/common_v29_0")
    protected FormOfPaymentRef formOfPaymentRef;
    @XmlElement(name = "SSRInfo", namespace = "http://www.travelport.com/schema/common_v29_0")
    protected List<SSRInfo> ssrInfo;
    @XmlAttribute(name = "ReturnReservation")
    protected Boolean returnReservation;

    /**
     * Provider: ACH-Identifies the PNR the new segments are going into
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
     * Provider: ACH.Gets the value of the specificSeatAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificSeatAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificSeatAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificSeatAssignment }
     * 
     * 
     */
    public List<SpecificSeatAssignment> getSpecificSeatAssignment() {
        if (specificSeatAssignment == null) {
            specificSeatAssignment = new ArrayList<SpecificSeatAssignment>();
        }
        return this.specificSeatAssignment;
    }

    /**
     * Provider: ACH.Gets the value of the airPricingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingInfo }
     * 
     * 
     */
    public List<AirPricingInfo> getAirPricingInfo() {
        if (airPricingInfo == null) {
            airPricingInfo = new ArrayList<AirPricingInfo>();
        }
        return this.airPricingInfo;
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
     * Provider: ACH.Gets the value of the airSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeBaseAirSegment }
     * 
     * 
     */
    public List<TypeBaseAirSegment> getAirSegment() {
        if (airSegment == null) {
            airSegment = new ArrayList<TypeBaseAirSegment>();
        }
        return this.airSegment;
    }

    /**
     * Provider: ACH.Gets the value of the airExchangeBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airExchangeBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirExchangeBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirExchangeBundle }
     * 
     * 
     */
    public List<AirExchangeBundle> getAirExchangeBundle() {
        if (airExchangeBundle == null) {
            airExchangeBundle = new ArrayList<AirExchangeBundle>();
        }
        return this.airExchangeBundle;
    }

    /**
     * Provider: ACH.Gets the value of the tcrExchangeBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcrExchangeBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCRExchangeBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCRExchangeBundle }
     * 
     * 
     */
    public List<TCRExchangeBundle> getTCRExchangeBundle() {
        if (tcrExchangeBundle == null) {
            tcrExchangeBundle = new ArrayList<TCRExchangeBundle>();
        }
        return this.tcrExchangeBundle;
    }

    /**
     * Provider: ACH.Gets the value of the hostToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostToken }
     * 
     * 
     */
    public List<HostToken> getHostToken() {
        if (hostToken == null) {
            hostToken = new ArrayList<HostToken>();
        }
        return this.hostToken;
    }

    /**
     * Provider: ACH.
     * 
     * @return
     *     possible object is
     *     {@link OptionalServices }
     *     
     */
    public OptionalServices getOptionalServices() {
        return optionalServices;
    }

    /**
     * Sets the value of the optionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServices }
     *     
     */
    public void setOptionalServices(OptionalServices value) {
        this.optionalServices = value;
    }

    /**
     * Provider: ACH-Form of Payment for any Additional Collection charges for the Exchange. Most carriers will only allow refunds amounts to the original form of payment.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPayment }
     *     
     */
    public FormOfPayment getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPayment }
     *     
     */
    public void setFormOfPayment(FormOfPayment value) {
        this.formOfPayment = value;
    }

    /**
     * Provider: ACH-Universal Record reference to Form of Payment for any Additional Collection charges or Refund due for the itinerary exchange
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentRef }
     *     
     */
    public FormOfPaymentRef getFormOfPaymentRef() {
        return formOfPaymentRef;
    }

    /**
     * Sets the value of the formOfPaymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentRef }
     *     
     */
    public void setFormOfPaymentRef(FormOfPaymentRef value) {
        this.formOfPaymentRef = value;
    }

    /**
     * Provider: ACH.Gets the value of the ssrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSRInfo }
     * 
     * 
     */
    public List<SSRInfo> getSSRInfo() {
        if (ssrInfo == null) {
            ssrInfo = new ArrayList<SSRInfo>();
        }
        return this.ssrInfo;
    }

    /**
     * Gets the value of the returnReservation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getReturnReservation() {
        if (returnReservation == null) {
            return false;
        } else {
            return returnReservation;
        }
    }

    /**
     * Sets the value of the returnReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnReservation(Boolean value) {
        this.returnReservation = value;
    }

}
