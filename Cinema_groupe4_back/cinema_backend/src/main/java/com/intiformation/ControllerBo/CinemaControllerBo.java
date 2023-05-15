package com.intiformation.ControllerBo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.businessObject.CinemaBo;
import com.intiformation.mapper.CinemaMapper;
import com.intiformation.modele.Cinema;
import com.intiformation.service.CinemaService;

@RestController
@RequestMapping("cinemaBo_api")
@CrossOrigin("http://localhost:4200")
public class CinemaControllerBo {

	@Autowired
	private CinemaService cinemaService;
	@Autowired
	private CinemaMapper cinemaMapper;

	@GetMapping("/{id}")
	public CinemaBo getCinemaBoById(@PathVariable("id") Long idCinemaBo) {
		return cinemaMapper.cinemaToCinemaBo(cinemaService.getCinemaById(idCinemaBo));	
	}
	
	@GetMapping("/{name}")
	public CinemaBo getCinemaBoByName(@PathVariable("name") String name) {
		return cinemaMapper.cinemaToCinemaBo(cinemaService.getCinemaByNom(name));	
	}
	
	@GetMapping
	public List<CinemaBo> getAllCinemaBo() {
		List<CinemaBo> listeCinemaBo = new ArrayList<>();
		for(Cinema cinema : cinemaService.getAllCinema()) {
			listeCinemaBo.add(cinemaMapper.cinemaToCinemaBo(cinema));
		}		
		return listeCinemaBo;
	}
	
	@GetMapping("/allCineBoVille/{villeParam}")
	public List<CinemaBo> getAllCinemaBoByVille(@PathVariable("villeParam")String ville) {
		List<CinemaBo> listeCinemaBo = new ArrayList<>();
		for(Cinema cinema : cinemaService.getCinemaByVille(ville)) {
			listeCinemaBo.add(cinemaMapper.cinemaToCinemaBo(cinema));
		}
		return listeCinemaBo;
	}
}
