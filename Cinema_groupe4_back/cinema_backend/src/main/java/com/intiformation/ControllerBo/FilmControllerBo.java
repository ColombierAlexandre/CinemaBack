package com.intiformation.ControllerBo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.businessObject.FilmBo;
import com.intiformation.mapper.FilmMapper;
import com.intiformation.modele.Film;
import com.intiformation.service.FilmService;

@RestController
@RequestMapping("filmBo_api")
@CrossOrigin("http://localhost:4200")
public class FilmControllerBo {

	@Autowired
	private FilmService filmService;
	@Autowired
	private FilmMapper filmMapper;
	
	@GetMapping("/{id}")
	public FilmBo getFilmBoById(@PathVariable("id") int idFilm) {
		return filmMapper.filmToFilmBo(filmService.getFilmById(idFilm));	
	}
	
	@GetMapping("/titre/{titreParam}")
	public FilmBo getFilmBoByName(@PathVariable("titreParam") String titre) {
		return filmMapper.filmToFilmBo(filmService.getFilmByTitre(titre));	
	}
	
	@GetMapping
	public List<FilmBo> getAllFilmBo() {
		List<FilmBo> listeFilmBo = new ArrayList<>();
		for(Film film : filmService.getALlFilm()) {
			listeFilmBo.add(filmMapper.filmToFilmBo(film));
		}		
		return listeFilmBo;
	}
	
}
