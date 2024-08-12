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
		Optional<Contact> optContact = contactRepo.findByContactName("Pramod");
		if(optContact.isPresent()) {
			Contact ct = optContact.get();
			System.out.println(ct);
		}
		System.out.println("-".repeat(100));
		
		Contact contact = contactRepo.findByContactNumber(7485857497L);
		System.out.println(contact);
		System.out.println("-".repeat(100));
		
		optContact = contactRepo.findByContactNameAndContactNumber("Deepa", 7485969685L);
		if(optContact.isPresent()) {
			Contact ct = optContact.get();
			System.out.println(ct);
		}
		System.out.println("-".repeat(100));
		
		List<Contact> contacts = contactRepo.findByContactNameOrContactNumber("Deepa", 9848586879L);
		displayContacts(contacts);
		System.out.println("-".repeat(100));
		
		List<String> contactNames = contactRepo.findContactNames();
		System.out.println("---------- CONTACT PERSON NAMES ------------");
		contactNames.forEach(cname -> System.out.println(cname));
		/*
		for(String cname : contactNames) {
			System.out.println(cname);
		}
		*/
		System.out.println("-".repeat(100));
		
		optContact = contactRepo.findContactByName("Pramod");
		if(optContact.isPresent()) {
			Contact ct = optContact.get();
			System.out.println(ct);
		}
		System.out.println("-".repeat(100));
		
		contactNames = contactRepo.findContactNameStartsWith("M");
		contactNames.forEach(cname -> System.out.println(cname));
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
