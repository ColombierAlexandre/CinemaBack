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

import com.intiformation.modele.Salle;
import com.intiformation.service.SalleService;

@RestController
@RequestMapping("salle_api")
@CrossOrigin("http://localhost:4200")
public class SalleController {

	@Autowired
	SalleService salleServ;

	@PostMapping
	public Salle AjouterSalle(@RequestBody Salle salle) {
		return salleServ.create(salle);
	}

	@DeleteMapping
	public void SupprimerSalle(@RequestBody Salle salle) {
		salleServ.delete(salle);
	}

	@PutMapping
	public Salle ModifierCinema(@RequestBody Salle salle) {
		return salleServ.modifier(salle);
	}

	@GetMapping("/getid/{id}")
	public Salle ObtenirSalleParId(@PathVariable("id") long idSalle) {
		return salleServ.getSalleById(idSalle);
	}

	@GetMapping("/getnumero/{numero}")
	public Salle ObtenirSalleParNumero(@PathVariable("numero") int numero) {
		return salleServ.getSalleByNumero(numero);
	}

	@GetMapping("/get/{cinema}")
	public List<Salle> ObtenirSalleParIdCinema(@PathVariable("cinema") long idCinema) {
		return salleServ.getSalleByIdCinema(idCinema);
	}

	@GetMapping
	public List<Salle> ObtenirToutesSalles() {
		return salleServ.getAllSalle();
	}

}