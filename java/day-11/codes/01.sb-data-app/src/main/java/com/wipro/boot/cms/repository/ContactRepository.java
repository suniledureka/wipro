package com.wipro.boot.cms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.boot.cms.entities.Contact;

@Repository  //optional
public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
