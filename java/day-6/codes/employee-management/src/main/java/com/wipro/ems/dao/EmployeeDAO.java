package com.wipro.ems.dao;

import java.util.List;

import com.wipro.ems.dto.Employee;

public interface EmployeeDAO {
	public Integer saveEmployee(Employee emp) throws Exception;
	
	public Integer updateEmployee(int eno, Employee emp) throws Exception;
	
	public Integer deleteEmployeeById(int eid) throws Exception;
	
	public Employee findEmployeeById(int eid) throws Exception;
	
	public List<Employee> findAllEmployees() throws Exception;	
}
