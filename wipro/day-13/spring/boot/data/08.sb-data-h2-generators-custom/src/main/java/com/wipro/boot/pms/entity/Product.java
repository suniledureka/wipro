package com.wipro.boot.pms.entity;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	//@GeneratedValue(generator = "pid_gen")
	//@GenericGenerator(name = "pid_gen", strategy = "com.wipro.boot.pms.entity.generators.ProductIdGenerator")
	//@GenericGenerator(name = "pid_gen", type = com.wipro.boot.pms.entity.generators.ProductIdGenerator.class)
	//private String productId;
	
	//@GeneratedValue(generator = "UUID")
	//@GenericGenerator(name = "UUID", type = org.hibernate.id.UUIDGenerator.class)
	@UuidGenerator
	private UUID productId;
	
	private String productName;
	private Float productPrice;
	
	public Product() {	}
	
	public Product(String productName, Float productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}
}
