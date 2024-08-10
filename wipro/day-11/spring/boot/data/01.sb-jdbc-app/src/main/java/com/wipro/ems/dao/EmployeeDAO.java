package com.wipro.ems.dao;

import java.util.List;

import com.wipro.ems.dto.Employee;

public interface EmployeeDAO {
	public Integer saveEmployee(Employee emp);
	public Integer updateEmployee(int id, Employee emp);
	public Integer deleteEmployeeById(int eid);
	public Employee findEmployeeById(int eid);
	public List<Employee> findAllEmployees();
}
