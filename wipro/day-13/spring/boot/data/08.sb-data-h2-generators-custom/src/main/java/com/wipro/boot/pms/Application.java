package com.wipro.boot.pms;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.boot.pms.entity.Product;
import com.wipro.boot.pms.repository.ProductRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepo;

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Product> products = Arrays.asList(
					new Product("Television", 63500f), 
					new Product("Computer", 45750f),
					new Product("Mobile", 72500f));

		productRepo.saveAll(products);

		List<Product> productsInStock = productRepo.findAll();
		productsInStock.forEach(prod -> LOGGER.info(prod.toString()));
	}

}
