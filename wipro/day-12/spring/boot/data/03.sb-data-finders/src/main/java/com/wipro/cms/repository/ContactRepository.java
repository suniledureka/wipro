package com.wipro.cms.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.cms.entity.Contact;

@Repository //optional
public interface ContactRepository extends CrudRepository<Contact, Integer> {

	Optional<Contact> findByContactName(String contactName);
	
	Contact findByContactNumber(Long contactNo);
	
	Optional<Contact> findByContactNameAndContactNumber(String contactName, Long contactNo);

	List<Contact> findByContactNameOrContactNumber(String contactName, Long contactNo);
	
	//@Query("select contactName from com.wipro.cms.entity.Contact") //HQL
	@Query(value = "select contact_name from contact_master", nativeQuery = true) //SQL
	List<String> findContactNames();
	
	//@Query("select ct from com.wipro.cms.entity.Contact ct where contactName= :cname")
	@Query(value = "select * from contact_master where contact_name=:cname", nativeQuery = true)
	Optional<Contact> findContactByName(String cname);
	
	@Query("select contactName from com.wipro.cms.entity.Contact ct where contactName LIKE :namePart%")
	List<String> findContactNameStartsWith(String namePart);
}
