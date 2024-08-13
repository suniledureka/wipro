package com.wipro.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.data.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
