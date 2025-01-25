package com.wipro.java.util;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		Set<Product> products = new TreeSet<Product>(new ProductComparator());
		
		Product prod1 = new Product(78L, "Mobile", 75000.5f);
		Product prod2 = new Product(56L, "Laptop", 45000.5f);
		Product prod3 = new Product(92L, "PC", 35000.5f);
		Product prod4 = new Product(25L, "Tablet", 26000.5f);
		
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		products.add(prod4);
		
		for(Product prod : products) {
			System.out.println(prod);
		}
	}
}

class ProductComparator implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		long diff = o1.getProductId() - o2.getProductId();
		
		if(diff > 0) {
			return 1;
		}else if(diff < 0) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
