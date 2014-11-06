
package com.travelport.schema.air_v29_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.travelport.schema.common_v29_0.Remark;
import com.travelport.schema.common_v29_0.ServiceData;
import com.travelport.schema.common_v29_0.ServiceInfo;
import com.travelport.schema.common_v29_0.TypeElementStatus;
import com.travelport.schema.common_v29_0.TypePurchaseWindow;
import com.travelport.schema.common_v29_0.TypeTaxInfo;


/**
 * Describes a merchandising service of a
 *                     given type (e.g. Seat) that can be purchased for the indicated
 *                     amount. If this service is for only a given passenger or segment
 *                     the references will indicate the restrictions. If this service
 *                     applies to all passenger or the entire itinerary, the references
 *                     will not be present.
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ServiceData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ServiceInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Remark" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}TaxInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}FeeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}EMD" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}BundledServices" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AdditionalInfo" maxOccurs="16" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}FeeApplication" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}Text" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}PriceRange" maxOccurs="5" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}TourCode" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v29_0}attrPrices"/>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v29_0}attrProviderSupplier"/>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v29_0}attrElementKeyResults"/>
 *       &lt;attribute name="OptionalServicesRuleRef" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
 *       &lt;attribute name="Type" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeMerchandisingService" />
 *       &lt;attribute name="Confirmation" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SecondaryType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PurchaseWindow" type="{http://www.travelport.com/schema/common_v29_0}typePurchaseWindow" />
 *       &lt;attribute name="Priority" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Available" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Entitled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PerTraveler" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="PaymentRef" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
 *       &lt;attribute name="ServiceStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ServiceSubCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SSRCode" type="{http://www.travelport.com/schema/common_v29_0}typeSSRCode" />
 *       &lt;attribute name="IssuanceReason">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ProviderDefinedType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="16"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
 *       &lt;attribute name="AssessIndicator" type="{http://www.travelport.com/schema/air_v29_0}typeAssessIndicator" />
 *       &lt;attribute name="Mileage" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ApplicableFFLevel">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;minInclusive value="0"/>
 *             &lt;maxInclusive value="9"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SSRFreeText" type="{http://www.travelport.com/schema/common_v29_0}typeSSRFreeText" />
 *       &lt;attribute name="IsPricingApproximate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Chargeable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InclusiveOfTax" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="InterlineSettlementAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="GeographySpecification" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExcessWeightRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ViewableOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceData",
    "serviceInfo",
    "remark",
    "taxInfo",
    "feeInfo",
    "emd",
    "bundledServices",
    "additionalInfo",
    "feeApplication",
    "text",
    "priceRange",
    "tourCode"
})
@XmlRootElement(name = "OptionalService")
public class OptionalService {

    @XmlElement(name = "ServiceData", namespace = "http://www.travelport.com/schema/common_v29_0")
    protected List<ServiceData> serviceData;
    @XmlElement(name = "ServiceInfo", namespace = "http://www.travelport.com/schema/common_v29_0")
    protected ServiceInfo serviceInfo;
    @XmlElement(name = "Remark", namespace = "http://www.travelport.com/schema/common_v29_0")
    protected List<Remark> remark;
    @XmlElement(name = "TaxInfo")
    protected List<TypeTaxInfo> taxInfo;
    @XmlElement(name = "FeeInfo")
    protected List<FeeInfo> feeInfo;
    @XmlElement(name = "EMD")
    protected EMD emd;
    @XmlElement(name = "BundledServices")
    protected BundledServices bundledServices;
    @XmlElement(name = "AdditionalInfo")
    protected List<AdditionalInfo> additionalInfo;
    @XmlElement(name = "FeeApplication")
    protected FeeApplication feeApplication;
    @XmlElement(name = "Text")
    protected List<TypeTextElement> text;
    @XmlElement(name = "PriceRange")
    protected List<PriceRange> priceRange;
    @XmlElement(name = "TourCode")
    protected TourCode tourCode;
    @XmlAttribute(name = "OptionalServicesRuleRef")
    protected String optionalServicesRuleRef;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "Confirmation")
    protected String confirmation;
    @XmlAttribute(name = "SecondaryType")
    protected String secondaryType;
    @XmlAttribute(name = "PurchaseWindow")
    protected TypePurchaseWindow purchaseWindow;
    @XmlAttribute(name = "Priority")
    protected BigInteger priority;
    @XmlAttribute(name = "Available")
    protected Boolean available;
    @XmlAttribute(name = "Entitled")
    protected Boolean entitled;
    @XmlAttribute(name = "PerTraveler")
    protected Boolean perTraveler;
    @XmlAttribute(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDate;
    @XmlAttribute(name = "PaymentRef")
    protected String paymentRef;
    @XmlAttribute(name = "ServiceStatus")
    protected String serviceStatus;
    @XmlAttribute(name = "Quantity")
    protected BigInteger quantity;
    @XmlAttribute(name = "SequenceNumber")
    protected BigInteger sequenceNumber;
    @XmlAttribute(name = "ServiceSubCode")
    protected String serviceSubCode;
    @XmlAttribute(name = "SSRCode")
    protected String ssrCode;
    @XmlAttribute(name = "IssuanceReason")
    protected String issuanceReason;
    @XmlAttribute(name = "ProviderDefinedType")
    protected String providerDefinedType;
    @XmlAttribute(name = "Key")
    protected String key;
    @XmlAttribute(name = "AssessIndicator")
    protected TypeAssessIndicator assessIndicator;
    @XmlAttribute(name = "Mileage")
    protected BigInteger mileage;
    @XmlAttribute(name = "ApplicableFFLevel")
    protected Integer applicableFFLevel;
    @XmlAttribute(name = "Private")
    protected Boolean _private;
    @XmlAttribute(name = "SSRFreeText")
    protected String ssrFreeText;
    @XmlAttribute(name = "IsPricingApproximate")
    protected Boolean isPricingApproximate;
    @XmlAttribute(name = "Chargeable")
    protected String chargeable;
    @XmlAttribute(name = "InclusiveOfTax")
    protected Boolean inclusiveOfTax;
    @XmlAttribute(name = "InterlineSettlementAllowed")
    protected Boolean interlineSettlementAllowed;
    @XmlAttribute(name = "GeographySpecification")
    protected String geographySpecification;
    @XmlAttribute(name = "ExcessWeightRate")
    protected String excessWeightRate;
    @XmlAttribute(name = "Source")
    protected String source;
    @XmlAttribute(name = "ViewableOnly")
    protected Boolean viewableOnly;
    @XmlAttribute(name = "TotalPrice")
    protected String totalPrice;
    @XmlAttribute(name = "BasePrice")
    protected String basePrice;
    @XmlAttribute(name = "ApproximateTotalPrice")
    protected String approximateTotalPrice;
    @XmlAttribute(name = "ApproximateBasePrice")
    protected String approximateBasePrice;
    @XmlAttribute(name = "EquivalentBasePrice")
    protected String equivalentBasePrice;
    @XmlAttribute(name = "Taxes")
    protected String taxes;
    @XmlAttribute(name = "Fees")
    protected String fees;
    @XmlAttribute(name = "Services")
    protected String services;
    @XmlAttribute(name = "ApproximateTaxes")
    protected String approximateTaxes;
    @XmlAttribute(name = "ApproximateFees")
    protected String approximateFees;
    @XmlAttribute(name = "ProviderCode")
    protected String providerCode;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "ElStat")
    protected TypeElementStatus elStat;
    @XmlAttribute(name = "KeyOverride")
    protected Boolean keyOverride;

    /**
     * Gets the value of the serviceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceData }
     * 
     * 
     */
    public List<ServiceData> getServiceData() {
        if (serviceData == null) {
            serviceData = new ArrayList<ServiceData>();
        }
        return this.serviceData;
    }

    /**
     * Gets the value of the serviceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfo }
     *     
     */
    public ServiceInfo getServiceInfo() {
        return serviceInfo;
    }

    /**
     * Sets the value of the serviceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfo }
     *     
     */
    public void setServiceInfo(ServiceInfo value) {
        this.serviceInfo = value;
    }

    /**
     * Information regarding any specific
     *                             for this service.Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Remark }
     * 
     * 
     */
    public List<Remark> getRemark() {
        if (remark == null) {
            remark = new ArrayList<Remark>();
        }
        return this.remark;
    }

    /**
     * Gets the value of the taxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTaxInfo }
     * 
     * 
     */
    public List<TypeTaxInfo> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<TypeTaxInfo>();
        }
        return this.taxInfo;
    }

    /**
     * Gets the value of the feeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeInfo }
     * 
     * 
     */
    public List<FeeInfo> getFeeInfo() {
        if (feeInfo == null) {
            feeInfo = new ArrayList<FeeInfo>();
        }
        return this.feeInfo;
    }

    /**
     * Gets the value of the emd property.
     * 
     * @return
     *     possible object is
     *     {@link EMD }
     *     
     */
    public EMD getEMD() {
        return emd;
    }

    /**
     * Sets the value of the emd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMD }
     *     
     */
    public void setEMD(EMD value) {
        this.emd = value;
    }

    /**
     * Gets the value of the bundledServices property.
     * 
     * @return
     *     possible object is
     *     {@link BundledServices }
     *     
     */
    public BundledServices getBundledServices() {
        return bundledServices;
    }

    /**
     * Sets the value of the bundledServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link BundledServices }
     *     
     */
    public void setBundledServices(BundledServices value) {
        this.bundledServices = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInfo }
     * 
     * 
     */
    public List<AdditionalInfo> getAdditionalInfo() {
        if (additionalInfo == null) {
            additionalInfo = new ArrayList<AdditionalInfo>();
        }
        return this.additionalInfo;
    }

    /**
     * Gets the value of the feeApplication property.
     * 
     * @return
     *     possible object is
     *     {@link FeeApplication }
     *     
     */
    public FeeApplication getFeeApplication() {
        return feeApplication;
    }

    /**
     * Sets the value of the feeApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeApplication }
     *     
     */
    public void setFeeApplication(FeeApplication value) {
        this.feeApplication = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTextElement }
     * 
     * 
     */
    public List<TypeTextElement> getText() {
        if (text == null) {
            text = new ArrayList<TypeTextElement>();
        }
        return this.text;
    }

    /**
     * Gets the value of the priceRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceRange }
     * 
     * 
     */
    public List<PriceRange> getPriceRange() {
        if (priceRange == null) {
            priceRange = new ArrayList<PriceRange>();
        }
        return this.priceRange;
    }

    /**
     * Gets the value of the tourCode property.
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
     * Gets the value of the optionalServicesRuleRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalServicesRuleRef() {
        return optionalServicesRuleRef;
    }

    /**
     * Sets the value of the optionalServicesRuleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalServicesRuleRef(String value) {
        this.optionalServicesRuleRef = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the confirmation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmation() {
        return confirmation;
    }

    /**
     * Sets the value of the confirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmation(String value) {
        this.confirmation = value;
    }

    /**
     * Gets the value of the secondaryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryType() {
        return secondaryType;
    }

    /**
     * Sets the value of the secondaryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryType(String value) {
        this.secondaryType = value;
    }

    /**
     * Gets the value of the purchaseWindow property.
     * 
     * @return
     *     possible object is
     *     {@link TypePurchaseWindow }
     *     
     */
    public TypePurchaseWindow getPurchaseWindow() {
        return purchaseWindow;
    }

    /**
     * Sets the value of the purchaseWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePurchaseWindow }
     *     
     */
    public void setPurchaseWindow(TypePurchaseWindow value) {
        this.purchaseWindow = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPriority(BigInteger value) {
        this.priority = value;
    }

    /**
     * Gets the value of the available property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailable(Boolean value) {
        this.available = value;
    }

    /**
     * Gets the value of the entitled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getEntitled() {
        return entitled;
    }

    /**
     * Sets the value of the entitled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEntitled(Boolean value) {
        this.entitled = value;
    }

    /**
     * Gets the value of the perTraveler property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean getPerTraveler() {
        if (perTraveler == null) {
            return true;
        } else {
            return perTraveler;
        }
    }

    /**
     * Sets the value of the perTraveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPerTraveler(Boolean value) {
        this.perTraveler = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the paymentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentRef() {
        return paymentRef;
    }

    /**
     * Sets the value of the paymentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentRef(String value) {
        this.paymentRef = value;
    }

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the serviceSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSubCode() {
        return serviceSubCode;
    }

    /**
     * Sets the value of the serviceSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceSubCode(String value) {
        this.serviceSubCode = value;
    }

    /**
     * Gets the value of the ssrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRCode(String value) {
        this.ssrCode = value;
    }

    /**
     * Gets the value of the issuanceReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuanceReason() {
        return issuanceReason;
    }

    /**
     * Sets the value of the issuanceReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuanceReason(String value) {
        this.issuanceReason = value;
    }

    /**
     * Gets the value of the providerDefinedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderDefinedType() {
        return providerDefinedType;
    }

    /**
     * Sets the value of the providerDefinedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderDefinedType(String value) {
        this.providerDefinedType = value;
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

    /**
     * Gets the value of the assessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAssessIndicator }
     *     
     */
    public TypeAssessIndicator getAssessIndicator() {
        return assessIndicator;
    }

    /**
     * Sets the value of the assessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAssessIndicator }
     *     
     */
    public void setAssessIndicator(TypeAssessIndicator value) {
        this.assessIndicator = value;
    }

    /**
     * Gets the value of the mileage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMileage() {
        return mileage;
    }

    /**
     * Sets the value of the mileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMileage(BigInteger value) {
        this.mileage = value;
    }

    /**
     * Gets the value of the applicableFFLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApplicableFFLevel() {
        return applicableFFLevel;
    }

    /**
     * Sets the value of the applicableFFLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApplicableFFLevel(Integer value) {
        this.applicableFFLevel = value;
    }

    /**
     * Gets the value of the private property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPrivate() {
        return _private;
    }

    /**
     * Sets the value of the private property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivate(Boolean value) {
        this._private = value;
    }

    /**
     * Gets the value of the ssrFreeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSRFreeText() {
        return ssrFreeText;
    }

    /**
     * Sets the value of the ssrFreeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSRFreeText(String value) {
        this.ssrFreeText = value;
    }

    /**
     * Gets the value of the isPricingApproximate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getIsPricingApproximate() {
        return isPricingApproximate;
    }

    /**
     * Sets the value of the isPricingApproximate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPricingApproximate(Boolean value) {
        this.isPricingApproximate = value;
    }

    /**
     * Gets the value of the chargeable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeable() {
        return chargeable;
    }

    /**
     * Sets the value of the chargeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeable(String value) {
        this.chargeable = value;
    }

    /**
     * Gets the value of the inclusiveOfTax property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getInclusiveOfTax() {
        return inclusiveOfTax;
    }

    /**
     * Sets the value of the inclusiveOfTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInclusiveOfTax(Boolean value) {
        this.inclusiveOfTax = value;
    }

    /**
     * Gets the value of the interlineSettlementAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getInterlineSettlementAllowed() {
        return interlineSettlementAllowed;
    }

    /**
     * Sets the value of the interlineSettlementAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterlineSettlementAllowed(Boolean value) {
        this.interlineSettlementAllowed = value;
    }

    /**
     * Gets the value of the geographySpecification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographySpecification() {
        return geographySpecification;
    }

    /**
     * Sets the value of the geographySpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographySpecification(String value) {
        this.geographySpecification = value;
    }

    /**
     * Gets the value of the excessWeightRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcessWeightRate() {
        return excessWeightRate;
    }

    /**
     * Sets the value of the excessWeightRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcessWeightRate(String value) {
        this.excessWeightRate = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the viewableOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getViewableOnly() {
        return viewableOnly;
    }

    /**
     * Sets the value of the viewableOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setViewableOnly(Boolean value) {
        this.viewableOnly = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPrice(String value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePrice(String value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the approximateTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTotalPrice() {
        return approximateTotalPrice;
    }

    /**
     * Sets the value of the approximateTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateTotalPrice(String value) {
        this.approximateTotalPrice = value;
    }

    /**
     * Gets the value of the approximateBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateBasePrice() {
        return approximateBasePrice;
    }

    /**
     * Sets the value of the approximateBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateBasePrice(String value) {
        this.approximateBasePrice = value;
    }

    /**
     * Gets the value of the equivalentBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentBasePrice() {
        return equivalentBasePrice;
    }

    /**
     * Sets the value of the equivalentBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentBasePrice(String value) {
        this.equivalentBasePrice = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxes(String value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFees(String value) {
        this.fees = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServices(String value) {
        this.services = value;
    }

    /**
     * Gets the value of the approximateTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateTaxes() {
        return approximateTaxes;
    }

    /**
     * Sets the value of the approximateTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateTaxes(String value) {
        this.approximateTaxes = value;
    }

    /**
     * Gets the value of the approximateFees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproximateFees() {
        return approximateFees;
    }

    /**
     * Sets the value of the approximateFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproximateFees(String value) {
        this.approximateFees = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Gets the value of the elStat property.
     * 
     * @return
     *     possible object is
     *     {@link TypeElementStatus }
     *     
     */
    public TypeElementStatus getElStat() {
        return elStat;
    }

    /**
     * Sets the value of the elStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeElementStatus }
     *     
     */
    public void setElStat(TypeElementStatus value) {
        this.elStat = value;
    }

    /**
     * Gets the value of the keyOverride property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getKeyOverride() {
        return keyOverride;
    }

    /**
     * Sets the value of the keyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyOverride(Boolean value) {
        this.keyOverride = value;
    }

}
