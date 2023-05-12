package com.intiformation.businessObject;

import java.sql.Date;

import jakarta.persistence.Column;

public class UtilisateurBo {

	private long id;
	private String email;
	private String motDePasse;
	private String nom;
	private String prenom;
	private String ville;
	private String numeroEtRue;
	private int codePostal;
	@Column(name = "numero_cb")
	private Long numeroCB;
	private short criptogramme;
	private Date dateNaissance;
	
	public UtilisateurBo() {
	}
	
	public UtilisateurBo(String email, String motDePasse, String nom, String prenom, String ville, String numeroEtRue,
			int codePostal, Long numeroCB, short criptogramme, Date dateNaissance) {
		this.email = email;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.numeroEtRue = numeroEtRue;
		this.codePostal = codePostal;
		this.numeroCB = numeroCB;
		this.criptogramme = criptogramme;
		this.dateNaissance = dateNaissance;
	}
	
	public UtilisateurBo(long id, String email, String motDePasse, String nom, String prenom, String ville,
			String numeroEtRue, int codePostal, Long numeroCB, short criptogramme, Date dateNaissance) {
		this.id = id;
		this.email = email;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.numeroEtRue = numeroEtRue;
		this.codePostal = codePostal;
		this.numeroCB = numeroCB;
		this.criptogramme = criptogramme;
		this.dateNaissance = dateNaissance;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNumeroEtRue() {
		return numeroEtRue;
	}

	public void setNumeroEtRue(String numeroEtRue) {
		this.numeroEtRue = numeroEtRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public Long getNumeroCB() {
		return numeroCB;
	}

	public void setNumeroCB(Long numeroCB) {
		this.numeroCB = numeroCB;
	}

	public short getCriptogramme() {
		return criptogramme;
	}

	public void setCriptogramme(short criptogramme) {
		this.criptogramme = criptogramme;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
}
