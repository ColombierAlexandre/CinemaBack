package com.intiformation.mapper;

import org.springframework.stereotype.Component;

import com.intiformation.businessObject.CinemaBo;
import com.intiformation.modele.Cinema;

@Component
public class CinemaMapper {
	
	public CinemaBo cinemaToCinemaBo(Cinema cinema) {
		CinemaBo cinemaBo = new CinemaBo();
		cinemaBo.setIdCinema(cinema.getIdCinema());
		cinemaBo.setNom(cinema.getNom());;
		cinemaBo.setTelephone(cinema.getTelephone());
		cinemaBo.setMail(cinema.getMail());
		cinemaBo.setRue(cinema.getRue());
		cinemaBo.setVille(cinema.getVille());
		cinemaBo.setCodePostal(cinema.getCodePostal());
		return cinemaBo;
	}
	
	public Cinema cinemaBoToCinema(CinemaBo cinemaBo) {
		Cinema cinema = new Cinema();
		cinema.setIdCinema(cinemaBo.getIdCinema());
		cinema.setNom(cinemaBo.getNom());;
		cinema.setTelephone(cinemaBo.getTelephone());
		cinema.setMail(cinemaBo.getMail());
		cinema.setRue(cinemaBo.getRue());
		cinema.setVille(cinemaBo.getVille());
		cinema.setCodePostal(cinemaBo.getCodePostal());
		return cinema;
	}
	
}
