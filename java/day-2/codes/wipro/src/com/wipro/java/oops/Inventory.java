package com.wipro.java.oops;

public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product();
		
		//System.out.println(prod.productId + " | " + prod.productName + " | " + prod.productPrice);
		System.out.println(prod.getProductId() + " | " + prod.getProductName()+ " | " + prod.getProductPrice());
		
		prod.setProductId(1001L);
		prod.setProductName("Mobile Phone");
		prod.setProductPrice(75000f);
		
		System.out.println(prod.getProductId() + " | " + prod.getProductName()+ " | " + prod.getProductPrice());
		
		System.out.println("\"prod\" is of type = " + prod.getClass().getName());
		System.out.println("\"prod\" is of type = " + prod.getClass().getSimpleName());
		
		System.out.println("hashCode() = " + prod.hashCode());
		System.out.println("hashCode() in hex_decimal form = " + Integer.toHexString(prod.hashCode()));
		System.out.println();
		
		System.out.println(prod); //toString()
	}
}
