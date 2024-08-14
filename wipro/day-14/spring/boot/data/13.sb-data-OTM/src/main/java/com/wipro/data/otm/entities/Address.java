package com.wipro.data.otm.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "addr_tbl")
@Data
@ToString(includeFieldNames = false, exclude = "emp")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	private String street;
	private String city;
	private String state;
	private String type;
	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	private Employee emp;

	public Address(String street, String city, String state, String type, Employee emp) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.type = type;
		this.emp = emp;
	}
	
	
}
