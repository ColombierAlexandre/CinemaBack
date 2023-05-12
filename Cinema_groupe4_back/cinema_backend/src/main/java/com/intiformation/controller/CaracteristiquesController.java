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

import com.intiformation.modele.Caracteristiques;
import com.intiformation.service.CaracteristiquesService;

@RestController
@RequestMapping("caracteristiques_api")
@CrossOrigin("http://localhost:4200")
public class CaracteristiquesController {

	@Autowired
	CaracteristiquesService caracteristiqueservice;

	@PostMapping
	public Caracteristiques ajouterCaracteristique(@RequestBody Caracteristiques caracteristique) {
		return caracteristiqueservice.addCaracteristique(caracteristique);
	}

	@PutMapping
	public Caracteristiques updateCaracteristiques(@RequestBody Caracteristiques caracteristique) {
		return caracteristiqueservice.updateCaracteristique(caracteristique);
	}

	@DeleteMapping("/{id}")
	public void supprimerCaracteristique(@PathVariable("id") Long id) {
		caracteristiqueservice.deleteCaracteristique(id);
	}

	@GetMapping("/{id}")
	public Caracteristiques obtenirUneCaracteristiqueParId(@PathVariable("id") Long id) {
		return caracteristiqueservice.getCaracteristiqueById(id);
	}

	@GetMapping
	public List<Caracteristiques> obtenirListeCaracteristiques() {
		return caracteristiqueservice.getALlCaracteristique();
	}

}
