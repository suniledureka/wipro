package com.wipro.ems.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
 @Id
 @GeneratedValue
 @Column(name = "EMP_ID")
 private Integer employeeId;
 
 @Column(name = "EMP_NAME")
 private String employeeName;
 
 @Column(name = "EMP_SAL")
 private Double employeeSal;
 
 @Column(name = "EMP_DEPT")
 private String employeeDept;
}
