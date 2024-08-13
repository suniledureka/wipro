package com.wipro.data.services;

import java.util.Optional;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.data.entities.Person;
import com.wipro.data.entities.PersonPK;
import com.wipro.data.repositories.PersonRepository;

@Service
public class PersonService {
	private PersonRepository personRepo;

	public PersonService(PersonRepository personRepo) {
		super();
		this.personRepo = personRepo;
	}

	public void savePerson() {
		PersonPK pks = new PersonPK();
		pks.setPersonId(101);
		pks.setPassportNum("JIKJ2135YU");

		Person p = new Person();
		p.setName("Sunil");
		p.setGender("Male");
		p.setEmail("sunil@gmail.com");

		// setting primary keys
		p.setPersonPk(pks);

		personRepo.save(p);
		System.out.println("person saved...");
	}

	public void getPersonById(PersonPK pks) {
		Optional<Person> findById = personRepo.findById(pks);

		if (findById.isPresent()) {
		  Person person = findById.get();
		  System.out.println(person);
		}
	}	
}
