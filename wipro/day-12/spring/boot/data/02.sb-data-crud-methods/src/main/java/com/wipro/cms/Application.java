package com.wipro.cms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.cms.entity.Contact;
import com.wipro.cms.repository.ContactRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private ContactRepository contactRepo;
	
	@Override
	public void run(String... args) throws Exception {
		//--- to get the number of contacts  ---
		long noOfContacts = contactRepo.count();
		System.out.println("no of contacts = " + noOfContacts);
		System.out.println("-".repeat(100));
		
		//--- to check whether a Contact is existing based on the specified contactId  ---
		boolean isExists = contactRepo.existsById(1001);
		System.out.println("contact with cintactId: 1001 exists = "+ isExists);
		System.out.println("-".repeat(100));
		
		//--- to get a Contact based on contactId (ID property value  ---
		Optional<Contact> optContact = contactRepo.findById(1001);
		if(optContact.isPresent()) {
			Contact ct = optContact.get();
			System.out.println(ct);
		}else {
			System.err.println("no matching contact found for the id");
		}
		System.out.println("-".repeat(100));
		
		//--- to get Contacts based on multiple contactIds ---
		List<Integer> contactIds = Arrays.asList(1001,2004,1003,4500,1006);		
		Iterable<Contact> contacts = contactRepo.findAllById(contactIds);
		displayContacts(contacts);
		System.out.println("-".repeat(100));
		
		//--- to get all the Contacts  ---
		Iterable<Contact> contacts1 = contactRepo.findAll();
		displayContacts(contacts1);
		System.out.println("-".repeat(100));
		
		//-- to delete a Contact using different technique
		contactRepo.deleteById(1007);
	}

	private void displayContacts(Iterable<Contact> contacts) {
		for(Contact ct : contacts) {
			System.out.println(ct);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
