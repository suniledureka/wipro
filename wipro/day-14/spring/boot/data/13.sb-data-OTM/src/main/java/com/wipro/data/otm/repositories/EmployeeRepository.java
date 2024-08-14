package com.wipro.data.otm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.data.otm.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
