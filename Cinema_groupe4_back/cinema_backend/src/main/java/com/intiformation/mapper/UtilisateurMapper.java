package com.intiformation.mapper;

import org.springframework.stereotype.Component;

import com.intiformation.businessObject.UtilisateurBo;
import com.intiformation.modele.Utilisateur;

@Component
public class UtilisateurMapper {
	
	public UtilisateurBo utilisateurToUtilisateurBo(Utilisateur utilisateur) {
		UtilisateurBo utilisateurBo = new UtilisateurBo();
		utilisateurBo.setId(utilisateur.getId());
		utilisateurBo.setEmail(utilisateur.getEmail());
		utilisateurBo.setMotDePasse(utilisateur.getMotDePasse());
		utilisateurBo.setNom(utilisateur.getNom());
		utilisateurBo.setPrenom(utilisateur.getVille());
		utilisateurBo.setNumeroEtRue(utilisateur.getNumeroEtRue());
		utilisateurBo.setCodePostal(utilisateur.getCodePostal());
		utilisateurBo.setNumeroCB(utilisateur.getNumeroCB());
		utilisateurBo.setCriptogramme(utilisateur.getCriptogramme());
		utilisateurBo.setDateNaissance(utilisateur.getDateNaissance());
		return utilisateurBo;
	}
	
	public Utilisateur utilisateurBoToUtilisateur(UtilisateurBo utilisateurBo) {
		Utilisateur utilisateur = new Utilisateur();
		utilisateur.setId(utilisateur.getId());
		utilisateur.setEmail(utilisateur.getEmail());
		utilisateur.setMotDePasse(utilisateur.getMotDePasse());
		utilisateur.setNom(utilisateur.getNom());
		utilisateur.setPrenom(utilisateur.getVille());
		utilisateur.setNumeroEtRue(utilisateur.getNumeroEtRue());
		utilisateur.setCodePostal(utilisateur.getCodePostal());
		utilisateur.setNumeroCB(utilisateur.getNumeroCB());
		utilisateur.setCriptogramme(utilisateur.getCriptogramme());
		utilisateur.setDateNaissance(utilisateur.getDateNaissance());
		return utilisateur;
	}

}
