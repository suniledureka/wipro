package com.wipro.boot.rest.services;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServices {
	
	public String findEmployeeByIdAndName(Integer id, String name) {
		//logic to get the employee details from DB 
		String emp = null;
		
		if(id >= 101) {
			emp = "Employee Details of emp: " + name;
		}
		
		return emp;
	}
}
