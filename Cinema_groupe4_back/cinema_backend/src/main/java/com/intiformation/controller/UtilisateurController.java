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

import com.intiformation.modele.Utilisateur;
import com.intiformation.service.UtilisateurService;

@RestController
@RequestMapping("utilisateur_api")
@CrossOrigin("http://localhost:4200")
public class UtilisateurController {

	@Autowired
	UtilisateurService utilisateurService;

	@PostMapping
	public Utilisateur addUtilisateurController(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.addUtilisateurService(utilisateur);
	}

	@PutMapping
	public Utilisateur updateUtilisateurController(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.updateUtilisateurService(utilisateur);
	}

	@GetMapping("getById/{id}")
	public Utilisateur getUtilisateurByIdController(@PathVariable("id") Long idUtilisateur) {
		return utilisateurService.getUtilisateurByIdService(idUtilisateur);
	}

	@GetMapping("getByEmail/{email}")
	public Utilisateur getUtilisateurByEmailController(@PathVariable("email") String email) {
		return utilisateurService.getUtilisateurByEmailService(email);
	}

	@GetMapping
	public List<Utilisateur> getAllUtilisateursController() {
		return utilisateurService.getAllUtilisateursService();
	}

	@DeleteMapping("/{id}")
	public void deleteUtilisateurController(@PathVariable("id") Long idUtilisateur) {
		utilisateurService.deleteUtilisateurService(idUtilisateur);
	}

}
