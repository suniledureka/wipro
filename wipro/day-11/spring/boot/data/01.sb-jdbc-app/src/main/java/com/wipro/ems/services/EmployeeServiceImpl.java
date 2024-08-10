package com.wipro.ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ems.dao.EmployeeDAO;
import com.wipro.ems.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	
	@Override
	public void saveEmployee(Employee emp) {
		int n = dao.saveEmployee(emp);
		if(n > 0)
			System.out.println("###-- Employee Saved ---###");
		else
			System.err.println("$$$ -- Employee could not be saved ---$$$");
	}

	@Override
	public void updateEmployee(int id, Employee emp) {
		int n = dao.updateEmployee(id, emp);
		if(n > 0)
			System.out.println("###-- Employee Updated ---###");
		else
			System.err.println("$$$ -- Employee could not be Updated ---$$$");
	}

	@Override
	public void deleteEmployee(int id) {
		int n = dao.deleteEmployeeById(id);
		if(n > 0)
			System.out.println("###-- Employee Deleted ---###");
		else
			System.err.println("$$$ -- Employee could not be Deleted ---$$$");
	}

	@Override
	public Employee getEmployee(int id) {
		return dao.findEmployeeById(id);
	}

	@Override
	public void getAllEmployees() {
		List<Employee> employees = dao.findAllEmployees();
		for(Employee emp : employees) {
			System.out.println(emp);
		}
	}

}
