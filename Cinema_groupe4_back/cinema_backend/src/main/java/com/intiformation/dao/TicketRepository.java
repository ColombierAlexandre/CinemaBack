package com.intiformation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiformation.modele.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
