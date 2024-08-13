package com.wipro.cms.services;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.wipro.cms.entity.Contact;
import com.wipro.cms.repository.ContactRepository;

@Service
public class ContactServices {
	private ContactRepository contactRepo;
	
	//-- constructor injection
	public ContactServices(ContactRepository contactRepo) {
		super();
		this.contactRepo = contactRepo;
	}	
	
	public List<Contact> getContactsInOrder(){
		//-- Approach-1 - in sorting
		//List<Contact> contactsInOrder = contactRepo.findByOrderByContactName();
		//List<Contact> contactsInOrder = contactRepo.findByOrderByContactNameAsc();
		//List<Contact> contactsInOrder = contactRepo.findByOrderByContactNameDesc();
		
		//-- Approach-2 - in sorting
		//List<Contact> contactsInOrder = contactRepo.findAll(Sort.by("contactName"));
		//List<Contact> contactsInOrder = contactRepo.findAll(Sort.by("contactName", "contactNumber"));
		//List<Contact> contactsInOrder = contactRepo.findAll(Sort.by("contactName").ascending());
		List<Contact> contactsInOrder = contactRepo.findAll(Sort.by("contactName").descending());
		
		return contactsInOrder;
	}
}
