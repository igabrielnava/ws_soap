package com.hrms.config;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.hrms.ObjectFactory;
import com.hrms.RemoveEmployeeRequest;
import com.hrms.RemoveEmployeeResponse;
import com.hrms.constantes.Constantes;
import com.hrms.services.EmployeeService;

@Endpoint
public class RemoveEmployeeService {
	
	@Autowired
	private EmployeeService service;
	
	@PayloadRoot(namespace = Constantes.NAMESPACE, localPart = "removeEmployeeRequest")
	@ResponsePayload
	public JAXBElement<RemoveEmployeeResponse> removeEmployee(@RequestPayload RemoveEmployeeRequest request) {
		
		RemoveEmployeeResponse response = new RemoveEmployeeResponse();
		
		boolean status = service.removeEmployee(request.getEmployeeId());
		
		response.setStatus(status);
		
		return new ObjectFactory().createRemoveEmployeeResponse(response);
		
	}

}
