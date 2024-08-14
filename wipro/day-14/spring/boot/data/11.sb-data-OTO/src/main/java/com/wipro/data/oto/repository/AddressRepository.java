package com.wipro.data.oto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.data.oto.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
