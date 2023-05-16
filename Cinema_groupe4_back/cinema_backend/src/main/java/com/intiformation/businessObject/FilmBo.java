package com.intiformation.businessObject;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import com.intiformation.modele.Caracteristiques;

public class FilmBo {

	private int visaExploitation;
	private String titre;
	private String realisateur;
	private Time duree;
	private String producteur;
	private List<String> acteurs;
	private Date dateDeSortie;
	private List<Caracteristiques> listeCaracteristiques;
	
	public FilmBo() {
		super();
	}

	public FilmBo(String titre, String realisateur, Time duree, String producteur, List<String> acteurs, Date dateDeSortie,
			List<Caracteristiques> listeCaracteristiques) {
		super();
		this.titre = titre;
		this.realisateur = realisateur;
		this.duree = duree;
		this.producteur = producteur;
		this.acteurs = acteurs;
		this.dateDeSortie = dateDeSortie;
		this.listeCaracteristiques = listeCaracteristiques;
	}

	public FilmBo(int visaExploitation, String titre, String realisateur, Time duree, String producteur,
			List<String> acteurs, Date dateDeSortie, List<Caracteristiques> listeCaracteristiques) {
		super();
		this.visaExploitation = visaExploitation;
		this.titre = titre;
		this.realisateur = realisateur;
		this.duree = duree;
		this.producteur = producteur;
		this.acteurs = acteurs;
		this.dateDeSortie = dateDeSortie;
		this.listeCaracteristiques = listeCaracteristiques;
	}

	public int getVisaExploitation() {
		return visaExploitation;
	}

	public void setVisaExploitation(int visaExploitation) {
		this.visaExploitation = visaExploitation;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}

	public Time getDuree() {
		return duree;
	}

	public void setDuree(Time duree) {
		this.duree = duree;
	}

	public String getProducteur() {
		return producteur;
	}

	public void setProducteur(String producteur) {
		this.producteur = producteur;
	}

	public List<String> getActeurs() {
		return acteurs;
	}

	public void setActeurs(List<String> acteurs) {
		this.acteurs = acteurs;
	}

	public Date getDateDeSortie() {
		return dateDeSortie;
	}

	public void setDateDeSortie(Date dateDeSortie) {
		this.dateDeSortie = dateDeSortie;
	}

	public List<Caracteristiques> getListeCaracteristiques() {
		return listeCaracteristiques;
	}

	public void setListeCaracteristiques(List<Caracteristiques> listeCaracteristiques) {
		this.listeCaracteristiques = listeCaracteristiques;
	}
	
	
}
