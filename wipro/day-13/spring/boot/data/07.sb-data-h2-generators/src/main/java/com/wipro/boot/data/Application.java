package com.wipro.boot.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.boot.data.entity.Product;
import com.wipro.boot.data.repository.ProductRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private ProductRepository productRepo;
	
	@PostConstruct
	public void doInitialization() {
		 List<Product> products = Arrays.asList(
					new Product("Television", 63500f),
					new Product("Computer", 45750f),
					new Product("Mobile", 72500f)
				);
		
		productRepo.saveAll(products);
		System.out.println("=".repeat(100));
		
		List<Product> productsInStock = productRepo.findAll();
		productsInStock.forEach(prod -> System.out.println(prod));		
	}
}
