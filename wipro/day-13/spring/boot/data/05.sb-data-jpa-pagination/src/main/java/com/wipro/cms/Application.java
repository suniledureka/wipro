package com.wipro.cms;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.wipro.cms.entity.Contact;
import com.wipro.cms.services.ContactServices;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ContactServices contactService = context.getBean(ContactServices.class);
		
		List<Contact> contacts = contactService.doPagination();
		
		contacts.forEach(ct -> System.out.println(ct));
		
		context.close();
	}

}
