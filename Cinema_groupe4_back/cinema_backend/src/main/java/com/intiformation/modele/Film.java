package com.intiformation.modele;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Film {

	@Id
	private int visaExploitation;
	private String titre;
	private String synopsis;
	private Time duree;
	private String realisateur;
	private String producteur;
	private List<String> acteurs;
	private Date dateDeSortie;
	private String afficheUrl;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Caracteristiques_join_Film", joinColumns = @JoinColumn(name = "IdFilm"), inverseJoinColumns = @JoinColumn(name = "IdCarac"))
	private List<Caracteristiques> listeCaracteristiques;

	public Film() {
	}

	public Film(int visaExploitation, String titre, String synopsis, Time duree, String realisateur, String producteur,
			List<String> acteurs, Date dateDeSortie, String afficheUrl, List<Caracteristiques> listeCaracteristiques) {
		super();
		this.visaExploitation = visaExploitation;
		this.titre = titre;
		this.synopsis = synopsis;
		this.duree = duree;
		this.realisateur = realisateur;
		this.producteur = producteur;
		this.acteurs = acteurs;
		this.dateDeSortie = dateDeSortie;
		this.afficheUrl = afficheUrl;
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

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Time getDuree() {
		return duree;
	}

	public void setDuree(Time duree) {
		this.duree = duree;
	}

	public String getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
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

	public String getAfficheUrl() {
		return afficheUrl;
	}

	public void setAfficheUrl(String afficheUrl) {
		this.afficheUrl = afficheUrl;
	}

	public List<Caracteristiques> getListeCaracteristiques() {
		return listeCaracteristiques;
	}

	public void setListeCaracteristiques(List<Caracteristiques> listeCaracteristiques) {
		this.listeCaracteristiques = listeCaracteristiques;
	}

	

}
