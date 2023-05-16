package com.intiformation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.modele.Ticket;
import com.intiformation.service.TicketService;


@RestController
@RequestMapping("Ticket_api")
@CrossOrigin("http://localhost:4200")
public class TicketController {
	
	@Autowired
	TicketService TicketService;
	
	@PostMapping
	public Ticket addTicketController(@RequestBody Ticket ticket) {
		return TicketService.addTicketService(ticket);
	}

	@PutMapping
	public Ticket updateTicketController(@RequestBody Ticket ticket) {
		return TicketService.updateTicketService(ticket);
	}

	@GetMapping("getById/{id}")
	public Ticket getTicketByIdController(@PathVariable("id") Long idTicket) {
		return TicketService.getTicketByIdService(idTicket);
	}

	@GetMapping
	public List<Ticket> getAllTicketsController() {
		return TicketService.getAllTicketsService();
	}

	@DeleteMapping("/{id}")
	public void deleteTicketController(@PathVariable("id") Long idTicket) {
		TicketService.deleteTicketService(idTicket);
	}
	
	
}