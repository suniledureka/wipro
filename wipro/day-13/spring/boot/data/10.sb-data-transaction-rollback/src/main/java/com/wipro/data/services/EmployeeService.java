package com.wipro.data.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.data.entities.Employee;
import com.wipro.data.repositories.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;

	@Transactional(rollbackOn = Exception.class)
	public void saveEmployee() {
		Employee e = new Employee();
		e.setName("Sanjay");
		e.setSalary(3000.00);

		Employee savedEmp = empRepo.save(e); // saving emp
		System.out.println(savedEmp);

		//int i = 10/0; //java.lang.ArithmeticException
	}
}
