package com.wipro;

import java.lang.reflect.Field;

import com.wipro.models.Product;

public class PrivateAccessTest {

	public static void main(String[] args) throws Exception {
		Product prod = new Product();
		System.out.println(prod);
		
		Class<?> clzProduct = Class.forName("com.wipro.models.Product");
		
		Field prodNameField = clzProduct.getDeclaredField("productName");
		prodNameField.setAccessible(true);
		
		prodNameField.set(prod, "Mobile Phone");
		
		System.out.println(prod);
	}
}
