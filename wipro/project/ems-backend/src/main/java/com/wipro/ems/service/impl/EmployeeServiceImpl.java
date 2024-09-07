package com.wipro.ems.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.ems.entity.Employee;
import com.wipro.ems.exceptions.EmployeeNotFoundException;
import com.wipro.ems.repository.EmployeeRepository;
import com.wipro.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public Integer saveEmployee(Employee emp) {
		Integer id = employeeRepo.save(emp).getEmployeeId();
		return id;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList= employeeRepo.findAll();
		return empList;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		Optional<Employee> opt = employeeRepo.findById(id);
		if(opt.isPresent())
			return opt.get();
		else
			throw new EmployeeNotFoundException("No matching employee found with ID: "+id);
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		Employee emp = getEmployeeById(id);
		employeeRepo.delete(emp);
	}
}
