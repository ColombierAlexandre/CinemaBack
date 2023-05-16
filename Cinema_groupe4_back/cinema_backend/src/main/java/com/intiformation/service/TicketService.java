package com.intiformation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.dao.TicketRepository;
import com.intiformation.modele.Ticket;

@Service
public class TicketService {
	
	@Autowired
	TicketRepository ticketRepository;
	
	public Ticket addTicketService(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	public Ticket updateTicketService(Ticket ticket) {
		return ticketRepository.save(ticket);
	}

	public Ticket getTicketByIdService(Long idTicket) {
		Optional<Ticket> optionalTicket = ticketRepository.findById(idTicket);
		if (optionalTicket.isPresent()) {
			return optionalTicket.get();
		} else {
			System.out.println("Réservation non trouvé :(");
			return null;
		}
	}

	public List<Ticket> getAllTicketsService() {
		return ticketRepository.findAll();
	}

	public void deleteTicketService(Long idTicket) {
		ticketRepository.deleteById(idTicket);
	}
	
	
}