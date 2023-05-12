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

import com.intiformation.modele.Film;
import com.intiformation.service.FilmService;

@RestController
@RequestMapping("film_api")
@CrossOrigin("http://localhost:4200")
public class FilmController {
	
	@Autowired
	FilmService filmservice;


	@PostMapping
	public Film ajouterFilm(@RequestBody Film film) {
		return filmservice.addFilm(film);
	}

	@PutMapping
	public Film updateFilm(@RequestBody Film film) {
		return filmservice.updateFilm(film);
	}

	@DeleteMapping("/{id}")
	public void supprimerFilm(@PathVariable("id") int id) {
		filmservice.deleteFilm(id);
	}

	@GetMapping("/{id}")
	public Film obtenirUnFilmParId(@PathVariable("id") int id) {
		return filmservice.getFilmById(id);
	}

	@GetMapping("/titre/{titre}")
	public Film obtenirUnFilmParTitre(@PathVariable("titre") String titre) {
		return filmservice.getFilmByTitre(titre);
	}

	@GetMapping
	public List<Film> obtenirListeFilms() {
		return filmservice.getALlFilm();
	}

}
