package com.intiformation.businessObject;

import com.intiformation.modele.Cinema;

public class SalleBo {

	private long idSalle;
	private int numero;
	private int nombreDePlaces;
	private Cinema cinema;
	
	public SalleBo() {

	}

	public SalleBo(int numero, int nombreDePlaces, Cinema cinema) {
		this.numero = numero;
		this.nombreDePlaces = nombreDePlaces;
		this.cinema = cinema;
	}

	public SalleBo(long idSalle, int numero, int nombreDePlaces, Cinema cinema) {
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
