package com.wipro.data.otm.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "emp_tbl")
@Data
@ToString(includeFieldNames = false, exclude = "addressList")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	private String employeeName;
	private Float employeeSal;
	
	@OneToMany(mappedBy = "emp", cascade = CascadeType.ALL)
	private List<Address> addressList;
}
