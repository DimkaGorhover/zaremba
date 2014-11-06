
package com.travelport.schema.air_v29_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v29_0.Commission;
import com.travelport.schema.common_v29_0.CreditCardAuth;
import com.travelport.schema.common_v29_0.FormOfPayment;


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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}DocumentModifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AirPricingInfoRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}TourCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}TicketEndorsement" maxOccurs="3" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Commission" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}FormOfPayment" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}CreditCardAuth" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PlatingCarrier" type="{http://www.travelport.com/schema/common_v29_0}typeCarrier" />
 *       &lt;attribute name="TicketedFareOverride" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SuppressTaxAndFee" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentModifiers",
    "airPricingInfoRef",
    "tourCode",
    "ticketEndorsement",
    "commission",
    "formOfPayment",
    "creditCardAuth"
})
@XmlRootElement(name = "AirTicketingModifiers")
public class AirTicketingModifiers {

    @XmlElement(name = "DocumentModifiers")
    protected DocumentModifiers documentModifiers;
    @XmlElement(name = "AirPricingInfoRef")
    protected List<AirPricingInfoRef> airPricingInfoRef;
    @XmlElement(name = "TourCode")
    protected TourCode tourCode;
    @XmlElement(name = "TicketEndorsement")
    protected List<TicketEndorsement> ticketEndorsement;
    @XmlElement(name = "Commission", namespace = "http://www.travelport.com/schema/common_v29_0")
    protected Commission commission;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v29_0")
    protected FormOfPayment formOfPayment;
    @XmlElement(name = "CreditCardAuth", namespace = "http://www.travelport.com/schema/common_v29_0")
    protected CreditCardAuth creditCardAuth;
    @XmlAttribute(name = "PlatingCarrier")
    protected String platingCarrier;
    @XmlAttribute(name = "TicketedFareOverride")
    protected Boolean ticketedFareOverride;
    @XmlAttribute(name = "SuppressTaxAndFee")
    protected Boolean suppressTaxAndFee;

    /**
     * Gets the value of the documentModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentModifiers }
     *     
     */
    public DocumentModifiers getDocumentModifiers() {
        return documentModifiers;
    }

    /**
     * Sets the value of the documentModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentModifiers }
     *     
     */
    public void setDocumentModifiers(DocumentModifiers value) {
        this.documentModifiers = value;
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
     * {@link AirPricingInfoRef }
     * 
     * 
     */
    public List<AirPricingInfoRef> getAirPricingInfoRef() {
        if (airPricingInfoRef == null) {
            airPricingInfoRef = new ArrayList<AirPricingInfoRef>();
        }
        return this.airPricingInfoRef;
    }

    /**
     * Allows an agency to modify the tour code information during ticket issuance. Providers supported: Worldspan and JAL.
     * 
     * @return
     *     possible object is
     *     {@link TourCode }
     *     
     */
    public TourCode getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourCode }
     *     
     */
    public void setTourCode(TourCode value) {
        this.tourCode = value;
    }

    /**
     * Allows an agency to add user defined
     * 						                     ticketing endorsements in the ticket. Providers supported: Worldspan and JAL.Gets the value of the ticketEndorsement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketEndorsement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketEndorsement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketEndorsement }
     * 
     * 
     */
    public List<TicketEndorsement> getTicketEndorsement() {
        if (ticketEndorsement == null) {
            ticketEndorsement = new ArrayList<TicketEndorsement>();
        }
        return this.ticketEndorsement;
    }

    /**
     * Allows an agency to add the commission
     * 						                     to a new or different commission rate which will be applied at
     * 						                     time of ticketing. The commission Modifier allows the user
     * 						                     specify how the commission change is to applied. Providers supported: Worldspan and JAL.
     * 						                  
     * 
     * @return
     *     possible object is
     *     {@link Commission }
     *     
     */
    public Commission getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link Commission }
     *     
     */
    public void setCommission(Commission value) {
        this.commission = value;
    }

    /**
     * FormOfPayment information to be used as ticketing modifier at the time of ticketing. Providers supported: Worldspan and JAL.
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
     * CreditCardAuth information to be used as ticketing modifier at the time of ticketing. Providers supported: Worldspan and JAL.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardAuth }
     *     
     */
    public CreditCardAuth getCreditCardAuth() {
        return creditCardAuth;
    }

    /**
     * Sets the value of the creditCardAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardAuth }
     *     
     */
    public void setCreditCardAuth(CreditCardAuth value) {
        this.creditCardAuth = value;
    }

    /**
     * Gets the value of the platingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatingCarrier() {
        return platingCarrier;
    }

    /**
     * Sets the value of the platingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatingCarrier(String value) {
        this.platingCarrier = value;
    }

    /**
     * Gets the value of the ticketedFareOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getTicketedFareOverride() {
        if (ticketedFareOverride == null) {
            return false;
        } else {
            return ticketedFareOverride;
        }
    }

    /**
     * Sets the value of the ticketedFareOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketedFareOverride(Boolean value) {
        this.ticketedFareOverride = value;
    }

    /**
     * Gets the value of the suppressTaxAndFee property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getSuppressTaxAndFee() {
        if (suppressTaxAndFee == null) {
            return false;
        } else {
            return suppressTaxAndFee;
        }
    }

    /**
     * Sets the value of the suppressTaxAndFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuppressTaxAndFee(Boolean value) {
        this.suppressTaxAndFee = value;
    }

}
