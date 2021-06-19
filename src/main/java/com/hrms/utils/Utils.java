package com.hrms.utils;

import com.hrms.EmployyeDetails;
import com.hrms.beans.Employee;

public class Utils {
	
	public static EmployyeDetails mapemployee(Employee employee) {
		
		EmployyeDetails employeeDetails = new EmployyeDetails();
		
		employeeDetails.setEmployeeId(employee.getEmployeeId());
		employeeDetails.setEmployeeName(employee.getEmployeeName());
		employeeDetails.setLocation(employee.getLocation());
		employeeDetails.setZipcode(employee.getZipcode());
		
		return employeeDetails;
		
	}
	
}
