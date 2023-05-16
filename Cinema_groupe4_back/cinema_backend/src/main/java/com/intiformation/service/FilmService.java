package com.intiformation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.intiformation.dao.FilmRepository;
import com.intiformation.modele.Film;

@Service
public class FilmService {

	@Autowired
	FilmRepository filmRepository;

	public Film addFilm(Film film) {
		return filmRepository.save(film);
	}

	public Film updateFilm(Film film) {
		return filmRepository.save(film);
	}

	public void deleteFilm(int id) {
		filmRepository.deleteById(id);
	}

	public Film getFilmById(int id) {
		Optional<Film> optfilm = filmRepository.findById(id);
		Film film = null;
		if (optfilm.isPresent()) {
			film = optfilm.get();
		}
		return film;
	}
	
	public List<Film> getALlFilm() {
		return filmRepository.findAll(Sort.by(Direction.DESC, "dateDeSortie"));
	}

	public Film getFilmByTitre(String titre) {
		Optional<Film> optfilm = filmRepository.findByTitre(titre);
		Film film = null;
		if (optfilm.isPresent()) {
			film = optfilm.get();
		}
		return film;
	}

}
