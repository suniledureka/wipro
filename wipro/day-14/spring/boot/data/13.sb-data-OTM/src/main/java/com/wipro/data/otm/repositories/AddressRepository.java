package com.wipro.data.otm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.data.otm.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
