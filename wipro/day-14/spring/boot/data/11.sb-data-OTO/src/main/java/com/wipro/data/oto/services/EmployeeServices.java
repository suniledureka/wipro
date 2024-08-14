package com.wipro.data.oto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.data.oto.entity.Address;
import com.wipro.data.oto.entity.Employee;
import com.wipro.data.oto.repository.EmployeeRepository;

@Service
public class EmployeeServices {
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public void saveEmployee() {
		Employee emp = new Employee();
		emp.setEmployeeId(101);
		emp.setEmployeeName("Praveen Kumar");
		emp.setEmployeeSal(5750.75f);
		
		Address addr = new Address("Sanath Nagar", "Hyderabad", "Telangana");
		emp.setAddress(addr);
		
		employeeRepo.save(emp);
	}
	
	public void searchEmployeeById(Integer id) {
		Optional<Employee> optEmp = employeeRepo.findById(id);
		if(optEmp.isPresent()) {
			Employee emp = optEmp.get();
			System.out.println(emp);
			Address addr = emp.getAddress();
			System.out.println(addr);
		}
	}
	
	public void deleteEmployeeById(int id) {
		employeeRepo.deleteById(id);
	}
}
