package com.wipro.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "emp_tbl")
@Data
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer eid;
  private String name;
  private Double salary;
}
