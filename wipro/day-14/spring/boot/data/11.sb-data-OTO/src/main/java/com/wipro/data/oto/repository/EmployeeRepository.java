package com.wipro.data.oto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.data.oto.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
