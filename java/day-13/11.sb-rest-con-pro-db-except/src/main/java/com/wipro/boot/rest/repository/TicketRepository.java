package com.wipro.boot.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.boot.rest.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, String> {

}
