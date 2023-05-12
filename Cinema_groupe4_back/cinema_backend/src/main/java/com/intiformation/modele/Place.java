package com.intiformation.modele;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Place {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPlace;
	private long numeroPlace;
	private boolean isUsed;
	@ManyToOne
	@JoinColumn(name = "programmation_id", referencedColumnName = "id_programmation")
	private Programmation programmation;

	public Place() {
	}

	public Place(long numeroPlace, boolean isUsed) {
		this.numeroPlace = numeroPlace;
		this.isUsed = isUsed;
	}

	public Place(long idPlace, long numeroPlace, boolean isUsed) {
		this.idPlace = idPlace;
		this.numeroPlace = numeroPlace;
		this.isUsed = isUsed;
	}

	public Place(long numeroPlace, boolean isUsed, Programmation programmation) {
		super();
		this.numeroPlace = numeroPlace;
		this.isUsed = isUsed;
		this.programmation = programmation;
	}

	public long getIdPlace() {
		return idPlace;
	}

	public void setIdPlace(long idPlace) {
		this.idPlace = idPlace;
	}

	public long getNumeroPlace() {
		return numeroPlace;
	}

	public void setNumeroPlace(long numeroPlace) {
		this.numeroPlace = numeroPlace;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}

}
