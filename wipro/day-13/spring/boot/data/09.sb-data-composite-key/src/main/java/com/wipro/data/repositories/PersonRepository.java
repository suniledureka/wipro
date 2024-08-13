package com.wipro.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.data.entities.Person;
import com.wipro.data.entities.PersonPK;

public interface PersonRepository extends JpaRepository<Person, PersonPK> {

}
