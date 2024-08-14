package com.wipro.data.oto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.data.oto.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
