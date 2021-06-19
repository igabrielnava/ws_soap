package com.hrms.services;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.hrms.beans.Employee;
import com.hrms.offline.repository.OfflineRepository;

@Component
public class EmployeeService {
	
	List<Employee> listOfEmployees = OfflineRepository.getEmployees();
	
	public Employee getEmployee(int employeeId) {
		
		Optional<Employee> employee = listOfEmployees.stream()
				.filter(emp -> emp.getEmployeeId() == employeeId)
				.findFirst();
		
		return employee.get();
		
	}
	
	public List<Employee> getAllEmployees(){
		
		return this.listOfEmployees;
		
	}
	
	public boolean removeEmployee(int employeeId) {
		
		Iterator<Employee> iterator = listOfEmployees.iterator();
		
		while(iterator.hasNext()) {
			Employee emp = iterator.next();
			if(employeeId == emp.getEmployeeId()) {
				iterator.remove();
				return true;
			}
		}
		
		return false;
		
	}
	
}
