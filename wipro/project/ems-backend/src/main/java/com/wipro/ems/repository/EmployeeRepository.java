package com.wipro.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
