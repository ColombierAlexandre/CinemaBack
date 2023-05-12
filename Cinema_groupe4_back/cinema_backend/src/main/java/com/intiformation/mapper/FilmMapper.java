package com.intiformation.mapper;

import com.intiformation.businessObject.FilmBo;
import com.intiformation.modele.Film;

public class FilmMapper {

	public FilmBo filmToFilmBo(Film film) {
		FilmBo filmBo = new FilmBo();
		filmBo.setVisaExploitation(film.getVisaExploitation());
		filmBo.setTitre(film.getTitre());
		filmBo.setRealisateur(film.getRealisateur());
		filmBo.setDuree(film.getDuree());
		filmBo.setProducteur(film.getProducteur());
		filmBo.setActeurs(film.getActeurs());
		filmBo.setDateDeSortie(film.getDateDeSortie());
		filmBo.setListeCaracteristiques(film.getListeCaracteristiques());
		return filmBo;
	}

	public Film filmBoToFilm(FilmBo filmBo) {
		Film film = new Film();
		film.setVisaExploitation(filmBo.getVisaExploitation());
		film.setTitre(filmBo.getTitre());
		film.setRealisateur(filmBo.getRealisateur());
		film.setDuree(filmBo.getDuree());
		film.setProducteur(filmBo.getProducteur());
		film.setActeurs(filmBo.getActeurs());
		film.setDateDeSortie(filmBo.getDateDeSortie());
		film.setListeCaracteristiques(filmBo.getListeCaracteristiques());
		return film;
	}

}
