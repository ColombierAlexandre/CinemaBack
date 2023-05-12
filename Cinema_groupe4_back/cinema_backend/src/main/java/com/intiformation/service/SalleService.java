package com.intiformation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.dao.SalleRepository;
import com.intiformation.modele.Salle;

@Service
public class SalleService {

	@Autowired
	SalleRepository salleRepo;

	public Salle create(Salle salle) {
		return salleRepo.save(salle);

	}

	public List<Salle> getAllSalle() {
		return salleRepo.findAll();
	}

	public Salle getSalleById(long id) {
		Optional<Salle> optionalSalle = salleRepo.findById(id);
		if (optionalSalle != null) {
			Salle salle = optionalSalle.get();
			return salle;
		} else {
			return null;
		}
	}

	public Salle getSalleByNumero(int numero) {
		Optional<Salle> optionalSalle = salleRepo.findByNumero(numero);
		if (optionalSalle != null) {
			Salle salle = optionalSalle.get();
			return salle;
		} else {
			return null;
		}

	}

	public List<Salle> getSalleByIdCinema(long idCinema) {
		return salleRepo.findAllByIdCinema(idCinema);

	}

	public Salle modifier(Salle salle) {

		if (salle.getIdSalle() != 0) {
			return salleRepo.save(salle);
		} else {
			return null;
		}
	}

	public void delete(Salle salle) {
		salleRepo.delete(salle);

	}
}
