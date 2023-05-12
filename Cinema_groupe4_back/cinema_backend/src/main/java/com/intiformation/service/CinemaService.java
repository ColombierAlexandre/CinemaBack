package com.intiformation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.dao.CinemaRepository;
import com.intiformation.modele.Cinema;

@Service
public class CinemaService {

	@Autowired
	CinemaRepository cineRepo;

	public Cinema create(Cinema cinema) {
		return cineRepo.save(cinema);
	}

	public List<Cinema> getAllCinema() {
		return cineRepo.findAll();
	}

	public Cinema getCinemaById(long id) {
		Optional<Cinema> optionalCinema = cineRepo.findById(id);
		if (optionalCinema != null) {
			Cinema cinema = optionalCinema.get();
			return cinema;
		} else {
			return null;
		}
	}

	public Cinema getCinemaByNom(String nom) {
		Optional<Cinema> optionalCinema = cineRepo.findByNom(nom);
		if (optionalCinema != null) {
			Cinema cinema = optionalCinema.get();
			return cinema;
		} else {
			return null;
		}

	}

	public List<Cinema> getCinemaByVille(String ville) {
		return cineRepo.findAllByVille(ville);

	}

	public Cinema modifier(Cinema cinema) {

		if (getCinemaById(cinema.getIdCinema()) != null) {
			return cineRepo.save(cinema);
		} else {
			return null;
		}
	}

	public void delete(Cinema cinema) {
		cineRepo.delete(cinema);
	}

}
