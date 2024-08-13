package com.wipro.cms.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
	
	public List<Contact> doPagination(){
		/*
		Page<Contact> page = contactRepo.findAll(Pageable.ofSize(5));
		List<Contact> contacts = page.getContent();
		*/
		
		int pageNo = 1; //0;
		int pageSize = 5;
		
		Page<Contact> page = contactRepo.findAll(PageRequest.of(pageNo, pageSize));
		List<Contact> contacts = page.getContent();
		
		return contacts;
	}

	public void displayContactsInPages() {
				
	}
}
