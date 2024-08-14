package com.wipro.data.oto.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	private Integer employeeId;
	private String employeeName;
	private Float employeeSal;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addr_id")//, referencedColumnName = "addressId"
	private Address address;
}
