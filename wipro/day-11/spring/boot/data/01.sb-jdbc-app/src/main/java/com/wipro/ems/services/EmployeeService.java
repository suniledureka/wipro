package com.wipro.ems.services;

import com.wipro.ems.dto.Employee;

public interface EmployeeService {
	public void saveEmployee(Employee emp);
	public void updateEmployee(int id, Employee emp);
	public void deleteEmployee(int id);
	public Employee getEmployee(int id);
	public void getAllEmployees();
}
