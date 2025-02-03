package com.wipro.boot.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.wipro.boot.cms.entities.Contact;
import com.wipro.boot.cms.repository.ContactRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		//get the repository bean
		ContactRepository contactRepo = context.getBean(ContactRepository.class);
		
		//--save a Contact
		Contact contact = new Contact();
		contact.setContactId(101);
		contact.setContactName("Sanjay");
		contact.setContactNumber("9848586878");
		
		contactRepo.save(contact);
		System.out.println("Contact Saved!!");
		context.close();
	}
}
