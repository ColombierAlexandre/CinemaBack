package com.intiformation.modele;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Programmation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_programmation")
	private long idProgrammation;
	private Date dateHeureProg;
	@ManyToOne
	@JoinColumn(name = "film_id", referencedColumnName = "visaExploitation")
	private Film film;
	@ManyToOne
	@JoinColumn(name = "salle_id", referencedColumnName = "idSalle")
	private Salle salle;

	public Programmation() {
	}

	public Programmation(long numeroPlace, boolean isUsed, Date dateHeureProg, List<Place> listePlaces) {
		this.dateHeureProg = dateHeureProg;
	}

	public Programmation(long numeroPlace, boolean isUsed, Date dateHeureProg, List<Place> listePlaces, Film film,
			Salle salle) {
		this.dateHeureProg = dateHeureProg;
		this.film = film;
		this.salle = salle;
	}

	public long getIdProgrammation() {
		return idProgrammation;
	}

	public void setIdProgrammation(long idProgrammation) {
		this.idProgrammation = idProgrammation;
	}

	public Date getDateHeureProg() {
		return dateHeureProg;
	}

	public void setDateHeureProg(Date dateHeureProg) {
		this.dateHeureProg = dateHeureProg;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

}
