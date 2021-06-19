package com.hrms;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _GetEmployeeRequest_QNAME = new QName("http://com.hrms/hrms", "getEmployeeRequest");
    private final static QName _GetEmployeeResponse_QNAME = new QName("http://com.hrms/hrms", "getEmployeeResponse");
    private final static QName _RemoveEmployeeRequest_QNAME = new QName("http://com.hrms/hrms", "removeEmployeeRequest");
    private final static QName _RemoveEmployeeResponse_QNAME = new QName("http://com.hrms/hrms", "removeEmployeeResponse");
    private final static QName _GetAllEmployeesResponse_QNAME = new QName("http://com.hrms/hrms", "getAllEmployeesResponse");
    private final static QName _GetAllEmployeesRequest_QNAME = new QName("http://com.hrms/hrms", "getAllEmployeesRequest");

    public ObjectFactory() {
    }

    public GetAllEmployeesRequest createGetAllEmployeesRequest() {
        return new GetAllEmployeesRequest();
    }

    public GetAllEmployeesResponse createGetAllEmployeesResponse() {
        return new GetAllEmployeesResponse();
    }

    public RemoveEmployeeResponse createRemoveEmployeeResponse() {
        return new RemoveEmployeeResponse();
    }

    public RemoveEmployeeRequest createRemoveEmployeeRequest() {
        return new RemoveEmployeeRequest();
    }

    public GetEmployeeRequest createGetEmployeeRequest() {
        return new GetEmployeeRequest();
    }

    public GetEmployeeResponse createGetEmployeeResponse() {
        return new GetEmployeeResponse();
    }

    public EmployyeDetails createEmployyeDetails() {
        return new EmployyeDetails();
    }

    @XmlElementDecl(namespace = "http://com.hrms/hrms", name = "getEmployeeRequest")
    public JAXBElement<GetEmployeeRequest> createGetEmployeeRequest(GetEmployeeRequest value) {
        return new JAXBElement<GetEmployeeRequest>(_GetEmployeeRequest_QNAME, GetEmployeeRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://com.hrms/hrms", name = "getEmployeeResponse")
    public JAXBElement<GetEmployeeResponse> createGetEmployeeResponse(GetEmployeeResponse value) {
        return new JAXBElement<GetEmployeeResponse>(_GetEmployeeResponse_QNAME, GetEmployeeResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://com.hrms/hrms", name = "removeEmployeeRequest")
    public JAXBElement<RemoveEmployeeRequest> createRemoveEmployeeRequest(RemoveEmployeeRequest value) {
        return new JAXBElement<RemoveEmployeeRequest>(_RemoveEmployeeRequest_QNAME, RemoveEmployeeRequest.class, null, value);
    }

    @XmlElementDecl(namespace = "http://com.hrms/hrms", name = "removeEmployeeResponse")
    public JAXBElement<RemoveEmployeeResponse> createRemoveEmployeeResponse(RemoveEmployeeResponse value) {
        return new JAXBElement<RemoveEmployeeResponse>(_RemoveEmployeeResponse_QNAME, RemoveEmployeeResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://com.hrms/hrms", name = "getAllEmployeesResponse")
    public JAXBElement<GetAllEmployeesResponse> createGetAllEmployeesResponse(GetAllEmployeesResponse value) {
        return new JAXBElement<GetAllEmployeesResponse>(_GetAllEmployeesResponse_QNAME, GetAllEmployeesResponse.class, null, value);
    }

    @XmlElementDecl(namespace = "http://com.hrms/hrms", name = "getAllEmployeesRequest")
    public JAXBElement<GetAllEmployeesRequest> createGetAllEmployeesRequest(GetAllEmployeesRequest value) {
        return new JAXBElement<GetAllEmployeesRequest>(_GetAllEmployeesRequest_QNAME, GetAllEmployeesRequest.class, null, value);
    }

}
