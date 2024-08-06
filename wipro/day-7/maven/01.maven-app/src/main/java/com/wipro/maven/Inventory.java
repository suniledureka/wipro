package com.wipro.maven;

import com.wipro.maven.models.Product;

public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product();
		
		prod.setProductId(34526);
		prod.setProductName("Moibile Phone");
		prod.setProductPrice(72000f);
		
		inventoryAdddition(prod);
	}

	private static void inventoryAdddition(Product prod) {
		System.out.println(prod);
		System.out.println("###--- Product Added to Store ---###");
	}

}
