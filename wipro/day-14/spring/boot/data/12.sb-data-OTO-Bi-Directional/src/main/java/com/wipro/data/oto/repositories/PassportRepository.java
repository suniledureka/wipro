package com.wipro.data.oto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.data.oto.entities.Passport;

public interface PassportRepository extends JpaRepository<Passport, Integer> {

}
