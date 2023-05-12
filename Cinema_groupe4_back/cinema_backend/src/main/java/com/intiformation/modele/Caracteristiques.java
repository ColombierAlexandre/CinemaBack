package com.intiformation.modele;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Caracteristiques {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCarac;
	private String caracteristique;
	@ManyToMany(mappedBy = "listeCaracteristiques", cascade = CascadeType.ALL)
	private List<Film> listeFilm;

	public Caracteristiques() {
	}

	public Caracteristiques(String caracteristique) {
		this.caracteristique = caracteristique;
	}

	public Caracteristiques(long idCarac, String caracteristique) {
		this.idCarac = idCarac;
		this.caracteristique = caracteristique;
	}

	public long getIdCarac() {
		return idCarac;
	}

	public void setIdCarac(long idCarac) {
		this.idCarac = idCarac;
	}

	public String getCaracteristique() {
		return caracteristique;
	}

	public void setCaracteristique(String caracteristique) {
		this.caracteristique = caracteristique;
	}

}
