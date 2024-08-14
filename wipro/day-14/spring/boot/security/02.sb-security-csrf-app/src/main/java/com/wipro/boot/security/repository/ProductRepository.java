package com.wipro.boot.security.repository;

import java.util.ArrayList;
import java.util.List;
import com.wipro.boot.security.models.Product;

public class ProductRepository {
	public static List<Product> getProducts(){
		List<Product> productsList = new ArrayList<Product>(
					List.of(new Product(101, "Mobile"),
							new Product(102, "Computer"), 
							new Product(103, "Laptop") )
				);
		
		return productsList;
	}
}
