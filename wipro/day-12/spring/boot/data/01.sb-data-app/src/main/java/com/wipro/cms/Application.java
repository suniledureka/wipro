package com.wipro.cms;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.wipro.cms.entity.Contact;
import com.wipro.cms.repository.ContactRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		ContactRepository contactRepo = context.getBean(ContactRepository.class);
		//System.out.println(contactRepo.getClass().getName());
		
		//-- save or update a Contact to persistence store - DB Table ---
		Contact contact = new Contact();
		contact.setContactId(1002);
		contact.setContactName("Pramod");
		contact.setContactNumber(9848586879L);
		
		//contactRepo.save(contact);
		Contact savedContact =contactRepo.save(contact);
		System.out.println(savedContact);
		
		//--- saving multiple contacts ---
		Contact ct1 = new Contact(1003, "Anirdh", 7878454514L);
		Contact ct2 = new Contact(1004, "Chris", 7485857497L);
		Contact ct3 = new Contact(1005, "Valerie", 6584748596L);
		Contact ct4 = new Contact(1006, "Deepa", 7485969685L);

		List<Contact> contacts = Arrays.asList(ct1, ct2, ct3, ct4);
		contactRepo.saveAll(contacts);
	}
}
