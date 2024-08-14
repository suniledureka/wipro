package com.wipro.data.otm.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wipro.data.otm.entities.Address;
import com.wipro.data.otm.entities.Employee;
import com.wipro.data.otm.repositories.AddressRepository;
import com.wipro.data.otm.repositories.EmployeeRepository;

@Service
public class EmployeeServices {	
	private EmployeeRepository empRepo;
	private AddressRepository addrRepo;
	
	public EmployeeServices(EmployeeRepository empRepo, AddressRepository addrRepo) {
		super();
		this.empRepo = empRepo;
		this.addrRepo = addrRepo;
	}
	
	public void saveEmployee() {
		Employee emp =  new Employee();
		emp.setEmployeeName("Sunil Joseph");
		emp.setEmployeeSal(7500.5f);
		
		Address addr1 = new Address("Pala", "Kottayam", "Kerala", "Permanent", emp);
		Address addr2 = new Address("Banjara Hills", "Hyderabad", "Telangana", "Present", emp);
		
		List<Address> addresses = Arrays.asList(addr1, addr2);
		
		emp.setAddressList(addresses);
		
		empRepo.save(emp);
	}
}
