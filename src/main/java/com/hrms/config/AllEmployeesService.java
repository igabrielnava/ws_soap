package com.hrms.config;

import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.hrms.EmployyeDetails;
import com.hrms.GetAllEmployeesRequest;
import com.hrms.GetAllEmployeesResponse;
import com.hrms.ObjectFactory;
import com.hrms.constantes.Constantes;
import com.hrms.services.EmployeeService;
import com.hrms.utils.Utils;

@Endpoint
public class AllEmployeesService {
	
	@Autowired
	private EmployeeService service;
	
	@PayloadRoot(namespace = Constantes.NAMESPACE, localPart = "getAllEmployeesRequest")
	@ResponsePayload
	public JAXBElement<GetAllEmployeesResponse> getAllEmployees(@RequestPayload GetAllEmployeesRequest request){
		
		GetAllEmployeesResponse response = new GetAllEmployeesResponse();
				
		List<EmployyeDetails> employyeDetails = service.getAllEmployees()
				.stream()
				.map(emp -> Utils.mapemployee(emp))
				.collect(Collectors.toList());
		
		response.getEmployyeDetails().addAll(employyeDetails);
		
		return new ObjectFactory().createGetAllEmployeesResponse(response);
	}
	
}
