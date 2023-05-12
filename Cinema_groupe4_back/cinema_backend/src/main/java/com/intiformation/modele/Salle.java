package com.intiformation.modele;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Salle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idSalle;
	private int numero;
	private int nombreDePlaces;
	@ManyToOne
	@JoinColumn(name = "cinema", referencedColumnName = "idCinema")
	private Cinema cinema;

	public Salle() {
	}

	public Salle(int numero, int nombreDePlaces, Cinema cinema) {
		this.numero = numero;
		this.nombreDePlaces = nombreDePlaces;
		this.cinema = cinema;
	}

	public Salle(long idSalle, int numero, int nombreDePlaces, Cinema cinema) {
		this.idSalle = idSalle;
		this.numero = numero;
		this.nombreDePlaces = nombreDePlaces;
		this.cinema = cinema;
	}

	public long getIdSalle() {
		return idSalle;
	}

	public void setIdSalle(long idSalle) {
		this.idSalle = idSalle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNombreDePlaces() {
		return nombreDePlaces;
	}

	public void setNombreDePlaces(int nombreDePlaces) {
		this.nombreDePlaces = nombreDePlaces;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

}