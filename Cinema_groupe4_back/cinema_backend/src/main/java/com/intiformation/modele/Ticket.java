package com.intiformation.modele;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ticket {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reservation")
	private long id;
	private String nom;
	private String prenom;
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "programmation_id", referencedColumnName = "id_programmation")
	private Programmation programmation;
	

	public Ticket() {
	}

	public Ticket(String nom, String prenom, Programmation programmation, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.programmation = programmation;
		this.email = email;
	}

	public Ticket(long id, String nom, String prenom, Programmation programmation, String email) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.programmation = programmation;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Programmation getProgrammation() {
		return programmation;
	}

	public void setProgrammation(Programmation programmation) {
		this.programmation = programmation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

	
	
}