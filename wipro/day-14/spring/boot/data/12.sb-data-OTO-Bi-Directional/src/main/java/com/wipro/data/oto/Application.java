package com.wipro.data.oto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.data.oto.services.PersonServices;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private PersonServices services;
	
	@PostConstruct
	public void businessLogic() {
		//services.savePerson();
		services.getPerson();
	}
}
