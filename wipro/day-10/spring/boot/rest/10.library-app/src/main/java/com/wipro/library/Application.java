package com.wipro.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "L M S", 
							    version = "1.0.1", 
							    description = "Library Management System",
							    contact = @Contact(name = "Sunil Joseph", 
							    				   email = "sunil.j@example.com", 
							    				   url = "https://www.wipro.com"),
							    license = @License(name = "WIPRO 2.0",
							    				   url = "https://www.wipro.com")),

				externalDocs = @ExternalDocumentation(
							description =  "L M S REST API Documentation",
							url = "https://www.wipro.com/swagger-ui.html"))
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
