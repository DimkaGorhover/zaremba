package com.travelport.service.air_v29_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.2.3
 * Thu Nov 06 19:21:47 EET 2014
 * Generated source version: 2.2.3
 * 
 */
 
@WebService(targetNamespace = "http://www.travelport.com/service/air_v29_0", name = "EMDIssuancePortType")
@XmlSeeAlso({com.travelport.schema.rail_v29_0.ObjectFactory.class,com.travelport.schema.common_v29_0.ObjectFactory.class,com.travelport.schema.air_v29_0.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface EMDIssuancePortType {

    @WebResult(name = "EMDIssuanceRsp", targetNamespace = "http://www.travelport.com/schema/air_v29_0", partName = "result")
    @WebMethod(action = "http://localhost:8080/kestrel/AirService")
    public com.travelport.schema.air_v29_0.EMDIssuanceRsp service(
        @WebParam(partName = "parameters", name = "EMDIssuanceReq", targetNamespace = "http://www.travelport.com/schema/air_v29_0")
        com.travelport.schema.air_v29_0.EMDIssuanceReq parameters
    ) throws AirFaultMessage;
}
