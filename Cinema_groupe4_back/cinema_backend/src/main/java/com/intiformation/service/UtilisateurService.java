package com.intiformation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.dao.UtilisateurRepository;
import com.intiformation.modele.Utilisateur;

@Service
public class UtilisateurService {

	@Autowired
	UtilisateurRepository utilisateurDao;

	public Utilisateur addUtilisateurService(Utilisateur utilisateur) {
		return utilisateurDao.save(utilisateur);
	}

	public Utilisateur updateUtilisateurService(Utilisateur utilisateur) {
		return utilisateurDao.save(utilisateur);
	}

	public Utilisateur getUtilisateurByIdService(Long idUtilisateur) {
		Optional<Utilisateur> optionalUtilisateur = utilisateurDao.findById(idUtilisateur);
		if (optionalUtilisateur.isPresent()) {
			return optionalUtilisateur.get();
		} else {
			System.out.println("Utilisateur non trouvé :(");
			return null;
		}
	}

	public Utilisateur getUtilisateurByEmailService(String email) {
		Optional<Utilisateur> optionalUtilisateur = utilisateurDao.findByEmail(email);
		if (optionalUtilisateur.isPresent()) {
			return optionalUtilisateur.get();
		} else {
			System.out.println("Utilisateur non trouvé :(");
			return null;
		}
	}

	public List<Utilisateur> getAllUtilisateursService() {
		return utilisateurDao.findAll();
	}

	public void deleteUtilisateurService(Long idUtilisateur) {
		utilisateurDao.deleteById(idUtilisateur);
	}

}
