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

import com.intiformation.modele.Cinema;
import com.intiformation.service.CinemaService;

@RestController
@RequestMapping("cinema_api")
@CrossOrigin("http://localhost:4200")
public class CinemaController {

	@Autowired
	CinemaService cineServ;

	@PostMapping
	public Cinema AjouterCinema(@RequestBody Cinema cinema) {
		return cineServ.create(cinema);
	}

	@DeleteMapping
	public void SupprimerCinema(@RequestBody Cinema cinema) {
		cineServ.delete(cinema);
	}

	@PutMapping
	public Cinema ModifierCinema(@RequestBody Cinema cinema) {
		return cineServ.modifier(cinema);
	}

	@GetMapping("/getid/{id}")
	public Cinema ObtenirCinemaParId(@PathVariable("id") long idCinema) {
		return cineServ.getCinemaById(idCinema);
	}

	@GetMapping("/getnom/{nom}")
	public Cinema ObtenirCinemaParNom(@PathVariable("nom") String nom) {
		return cineServ.getCinemaByNom(nom);
	}

	@GetMapping("/getville/{ville}")
	public List<Cinema> ObtenirCinemaParVille(@PathVariable("ville") String ville) {
		return cineServ.getCinemaByVille(ville);
	}

	@GetMapping
	public List<Cinema> ObtenirTousCinemas() {
		return cineServ.getAllCinema();
	}

}
