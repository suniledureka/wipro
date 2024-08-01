package com.wipro.java.oops;

public class InventoryApp {

	public static void main(String[] args) {
		Product prod = new Product();
		//System.out.println(prod.productId); //The field Product.productId is not visible
		System.out.println(prod.getProductId() + " - " + prod.getProductName());
		
		prod.setProductId(101);
		prod.setProductName("Mobile Phone");
		System.out.println(prod.getProductId() + " - " + prod.getProductName());
		System.out.println("-".repeat(80));
		
		System.out.println("\"prod\" is of type = " + prod.getClass().getName());
		System.out.println("\"prod\" is of type = " + prod.getClass().getSimpleName());
		System.out.println();
		
		int hCode = prod.hashCode();
		System.out.println("hashCode of \"prod\" = " + hCode);
		System.out.println("hashCode of \"prod\" in hexa_decimal format = " + Integer.toHexString(hCode));
		System.out.println("-".repeat(80));
		
		System.out.println(prod); //calls toString()
		System.out.println(prod.toString());
	}
}
