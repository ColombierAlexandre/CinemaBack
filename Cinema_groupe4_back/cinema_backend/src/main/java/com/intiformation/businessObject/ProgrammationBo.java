package com.intiformation.businessObject;

import java.util.Date;
import java.util.List;

import com.intiformation.modele.Film;
import com.intiformation.modele.Place;
import com.intiformation.modele.Salle;

public class ProgrammationBo {

	private long idProgrammation;
	private Date dateHeureProg;
	private Film film;
	private Salle salle;
	private List<Place> listePlaces;
	
	public ProgrammationBo() {
	}

	public ProgrammationBo(Date dateHeureProg, Film film, Salle salle) {
		this.dateHeureProg = dateHeureProg;
		this.film = film;
		this.salle = salle;
	}

	public ProgrammationBo(long idProgrammation, Date dateHeureProg, Film film, Salle salle) {
		this.idProgrammation = idProgrammation;
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

	public List<Place> getListePlaces() {
		return listePlaces;
	}

	public void setListePlaces(List<Place> listePlaces) {
		this.listePlaces = listePlaces;
	}
	
}
