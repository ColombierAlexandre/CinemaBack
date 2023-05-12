package com.intiformation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.dao.CaracteristiquesRepository;
import com.intiformation.modele.Caracteristiques;

@Service
public class CaracteristiquesService {

	@Autowired
	CaracteristiquesRepository caracteristiqueRepository;

	public Caracteristiques addCaracteristique(Caracteristiques caracteristique) {
		return caracteristiqueRepository.save(caracteristique);
	}

	public Caracteristiques updateCaracteristique(Caracteristiques caracteristique) {
		return caracteristiqueRepository.save(caracteristique);
	}

	public void deleteCaracteristique(Long id) {
		caracteristiqueRepository.deleteById(id);
	}

	public Caracteristiques getCaracteristiqueById(Long id) {
		Optional<Caracteristiques> optcaracteristique = caracteristiqueRepository.findById(id);
		Caracteristiques caracteristique = null;
		if (optcaracteristique.isPresent()) {
			caracteristique = optcaracteristique.get();
		}
		return caracteristique;
	}

	public List<Caracteristiques> getALlCaracteristique() {
		return caracteristiqueRepository.findAll();
	}

}
