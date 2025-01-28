package com.wipro.ems.services;

import com.wipro.ems.dto.Employee;

public interface EmployeeServices {
	public void saveEmployee(Employee emp) throws Exception;
	
	public Employee getEmployeeById(Integer eno) throws Exception;
	
	public void getAllEmployees() throws Exception;
	
	public void updateEmployeeById(int eno, Employee emp) throws Exception;
	
	public void deleteEmployeeById(int eno) throws Exception;
}
