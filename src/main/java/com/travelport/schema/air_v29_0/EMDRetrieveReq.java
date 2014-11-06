
package com.travelport.schema.air_v29_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v29_0.BaseReq;
import com.travelport.schema.common_v29_0.TypeProviderReservationDetail;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v29_0}BaseReq">
 *       &lt;choice>
 *         &lt;element name="ListRetrieve">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ProviderReservationDetail"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DetailRetrieve">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ProviderReservationDetail" minOccurs="0"/>
 *                   &lt;element name="EMDNumber" type="{http://www.travelport.com/schema/air_v29_0}typeEMDNumber"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listRetrieve",
    "detailRetrieve"
})
@XmlRootElement(name = "EMDRetrieveReq")
public class EMDRetrieveReq
    extends BaseReq
{

    @XmlElement(name = "ListRetrieve")
    protected EMDRetrieveReq.ListRetrieve listRetrieve;
    @XmlElement(name = "DetailRetrieve")
    protected EMDRetrieveReq.DetailRetrieve detailRetrieve;

    /**
     * Gets the value of the listRetrieve property.
     * 
     * @return
     *     possible object is
     *     {@link EMDRetrieveReq.ListRetrieve }
     *     
     */
    public EMDRetrieveReq.ListRetrieve getListRetrieve() {
        return listRetrieve;
    }

    /**
     * Sets the value of the listRetrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDRetrieveReq.ListRetrieve }
     *     
     */
    public void setListRetrieve(EMDRetrieveReq.ListRetrieve value) {
        this.listRetrieve = value;
    }

    /**
     * Gets the value of the detailRetrieve property.
     * 
     * @return
     *     possible object is
     *     {@link EMDRetrieveReq.DetailRetrieve }
     *     
     */
    public EMDRetrieveReq.DetailRetrieve getDetailRetrieve() {
        return detailRetrieve;
    }

    /**
     * Sets the value of the detailRetrieve property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDRetrieveReq.DetailRetrieve }
     *     
     */
    public void setDetailRetrieve(EMDRetrieveReq.DetailRetrieve value) {
        this.detailRetrieve = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ProviderReservationDetail" minOccurs="0"/>
     *         &lt;element name="EMDNumber" type="{http://www.travelport.com/schema/air_v29_0}typeEMDNumber"/>
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
        "providerReservationDetail",
        "emdNumber"
    })
    public static class DetailRetrieve {

        @XmlElement(name = "ProviderReservationDetail", namespace = "http://www.travelport.com/schema/common_v29_0")
        protected TypeProviderReservationDetail providerReservationDetail;
        @XmlElement(name = "EMDNumber", required = true)
        protected String emdNumber;

        /**
         * Provider reservation locator to be specified for display operation, if mentioned along woth the EMD number then synchronization of that EMD is performed considering the same to be associated with the mentioned PNR.
         * 
         * @return
         *     possible object is
         *     {@link TypeProviderReservationDetail }
         *     
         */
        public TypeProviderReservationDetail getProviderReservationDetail() {
            return providerReservationDetail;
        }

        /**
         * Sets the value of the providerReservationDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeProviderReservationDetail }
         *     
         */
        public void setProviderReservationDetail(TypeProviderReservationDetail value) {
            this.providerReservationDetail = value;
        }

        /**
         * Gets the value of the emdNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEMDNumber() {
            return emdNumber;
        }

        /**
         * Sets the value of the emdNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEMDNumber(String value) {
            this.emdNumber = value;
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ProviderReservationDetail"/>
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
        "providerReservationDetail"
    })
    public static class ListRetrieve {

        @XmlElement(name = "ProviderReservationDetail", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        protected TypeProviderReservationDetail providerReservationDetail;

        /**
         * Provider reservation details to be provided to fetch list of EMDs associated with it.
         * 
         * @return
         *     possible object is
         *     {@link TypeProviderReservationDetail }
         *     
         */
        public TypeProviderReservationDetail getProviderReservationDetail() {
            return providerReservationDetail;
        }

        /**
         * Sets the value of the providerReservationDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeProviderReservationDetail }
         *     
         */
        public void setProviderReservationDetail(TypeProviderReservationDetail value) {
            this.providerReservationDetail = value;
        }

    }

}
