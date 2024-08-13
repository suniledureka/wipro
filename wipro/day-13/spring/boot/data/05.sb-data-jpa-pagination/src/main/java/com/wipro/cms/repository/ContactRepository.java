package com.wipro.cms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wipro.cms.entity.Contact;

@Repository //optional
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
