
package com.travelport.schema.air_v29_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v29_0.FormOfPayment;
import com.travelport.schema.common_v29_0.FormOfPaymentRef;


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
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.travelport.com/schema/common_v29_0}FormOfPaymentRef" minOccurs="0"/>
 *           &lt;element ref="{http://www.travelport.com/schema/common_v29_0}FormOfPayment" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}CustomerReceiptInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}EMDEndorsement" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}EMDCommission" minOccurs="0"/>
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
    "formOfPaymentRef",
    "formOfPayment",
    "customerReceiptInfo",
    "emdEndorsement",
    "emdCommission"
})
@XmlRootElement(name = "IssuanceModifiers")
public class IssuanceModifiers {

    @XmlElement(name = "FormOfPaymentRef", namespace = "http://www.travelport.com/schema/common_v29_0")
    protected FormOfPaymentRef formOfPaymentRef;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v29_0")
    protected FormOfPayment formOfPayment;
    @XmlElement(name = "CustomerReceiptInfo")
    protected CustomerReceiptInfo customerReceiptInfo;
    @XmlElement(name = "EMDEndorsement")
    protected String emdEndorsement;
    @XmlElement(name = "EMDCommission")
    protected EMDCommission emdCommission;

    /**
     * Reference to FormOfPayment present in the UR to be used for EMD issuance.
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
     * FormOfPayment information to be used for EMD issuance.
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
     * Information about customer receipt via email.
     * 
     * @return
     *     possible object is
     *     {@link CustomerReceiptInfo }
     *     
     */
    public CustomerReceiptInfo getCustomerReceiptInfo() {
        return customerReceiptInfo;
    }

    /**
     * Sets the value of the customerReceiptInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerReceiptInfo }
     *     
     */
    public void setCustomerReceiptInfo(CustomerReceiptInfo value) {
        this.customerReceiptInfo = value;
    }

    /**
     * Endorsement details to be used during EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDEndorsement() {
        return emdEndorsement;
    }

    /**
     * Sets the value of the emdEndorsement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMDEndorsement(String value) {
        this.emdEndorsement = value;
    }

    /**
     * Commission information to be used for EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link EMDCommission }
     *     
     */
    public EMDCommission getEMDCommission() {
        return emdCommission;
    }

    /**
     * Sets the value of the emdCommission property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMDCommission }
     *     
     */
    public void setEMDCommission(EMDCommission value) {
        this.emdCommission = value;
    }

}
