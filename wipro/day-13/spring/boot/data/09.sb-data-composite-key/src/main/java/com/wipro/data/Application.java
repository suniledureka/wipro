package com.wipro.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.data.entities.PersonPK;
import com.wipro.data.services.PersonService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private PersonService pService;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		pService.savePerson();
		
		PersonPK pks = new PersonPK();
		pks.setPersonId(101);
		pks.setPassportNum("JIKJ2135YU");
		
		pService.getPersonById(pks);
	}

}
