package com.wipro.ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.ems.entity.Employee;
import com.wipro.ems.service.EmployeeService;

@RestController
@RequestMapping("/ems")
@CrossOrigin(origins = "*")
public class EmployeeRestController {
	 @Autowired
	 private EmployeeService service;

	 @PostMapping("/save")
	 public ResponseEntity<String> saveEmployee(@RequestBody Employee emp){
		 Integer id = service.saveEmployee(emp);
		 return new ResponseEntity<String>("Employee Saved with ID: "+id, HttpStatus.CREATED);
	 }
	 
	 @GetMapping("/all")
	 public ResponseEntity<List<Employee>> getAllEmployees(){
		 List<Employee> emps = service.getAllEmployees();
		 return new ResponseEntity<List<Employee>>(emps,HttpStatus.OK);	 
	 }
	 
	 @GetMapping("/find/{id}")
	 public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id){
		 Employee emp = service.getEmployeeById(id);
		 return new ResponseEntity<Employee>(emp,HttpStatus.OK);
	 } 
	 
	 @DeleteMapping("/delete/{id}")
	 public ResponseEntity<String> deleteEmployee(@PathVariable Integer id){
		 service.deleteEmployeeById(id);
		 return new ResponseEntity<String>("Employee with ID: "+id+" Deleted!", HttpStatus.OK);
	 }	 
	 
	 @PutMapping("/modify/{id}")
	 public ResponseEntity<String> updateEmployee(@PathVariable Integer id, @RequestBody Employee emp){
		 Employee em = service.getEmployeeById(id);
		 em.setEmployeeName(emp.getEmployeeName());
		 em.setEmployeeSal(emp.getEmployeeSal());
		 em.setEmployeeDept(emp.getEmployeeDept());
		 
		 service.saveEmployee(em);
		 
		 return new ResponseEntity<String>("Employee with ID: "+id+" Updated",HttpStatus.OK);
	 }	 
	 
}
