package com.wipro.data.oto.services;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.data.oto.entities.Passport;
import com.wipro.data.oto.entities.Person;
import com.wipro.data.oto.repositories.PassportRepository;
import com.wipro.data.oto.repositories.PersonRepository;

@Service
public class PersonServices {
	@Autowired
	private PersonRepository personRepo;
	
	@Autowired
	private PassportRepository passportRepo;
	
	public void savePerson() {
		Person p = new Person();
		p.setName("Praveen");
		p.setGender("Male");

		Passport pp = new Passport();
		pp.setPassportNum("RS798945765T");
		pp.setIssuedDate(LocalDate.now());
		pp.setExpDate(LocalDate.now().plusYears(10));

		// associating person with passport
		p.setPassport(pp);
		
		// associating passport with person
	    pp.setPerson(p);

		personRepo.save(p);
		System.out.println("Record inserted...");
	}

	public void getPerson() {
		Optional<Person> personOpt =  personRepo.findById(1);
		if(personOpt.isPresent()) {
			Person p = personOpt.get();
			System.out.println(p);
			Passport pp = p.getPassport();
			System.out.println(pp);
		}
	}

	public void deletePerson() {
		personRepo.deleteById(1);		
	}
	
	public void deletePassport() {
		passportRepo.deleteById(1); 
	}
}
