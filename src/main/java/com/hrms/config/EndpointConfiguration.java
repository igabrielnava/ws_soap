package com.hrms.config;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.hrms.GetEmployeeRequest;
import com.hrms.GetEmployeeResponse;
import com.hrms.ObjectFactory;
import com.hrms.beans.Employee;
import com.hrms.constantes.Constantes;
import com.hrms.services.EmployeeService;
import com.hrms.utils.Utils;

@Endpoint
public class EndpointConfiguration {
	
	@Autowired
	private EmployeeService service;
	
	@PayloadRoot(namespace= Constantes.NAMESPACE, localPart="getEmployeeRequest")
	@ResponsePayload
	public JAXBElement<GetEmployeeResponse> getEmployee(@RequestPayload GetEmployeeRequest request) {
		
		GetEmployeeResponse response = new GetEmployeeResponse();
		Employee employee = service.getEmployee(request.getEmployeeId());
		response.setEmployyeDetails(Utils.mapemployee(employee));
		
		return new ObjectFactory().createGetEmployeeResponse(response);
		
	}
	
}