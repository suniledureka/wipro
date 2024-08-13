package com.wipro.boot.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCT_DTLS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	@Id
	private Integer productId;
	private String productName;
	private Float productPrice;
}
