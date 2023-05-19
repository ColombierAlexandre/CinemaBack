package com.intiformation.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.intiformation.modele.Cinema;
import com.intiformation.modele.Film;
import com.intiformation.modele.Programmation;

@Repository
public interface ProgrammationRepository extends JpaRepository<Programmation, Long>{
	
	@Query("SELECT p FROM Programmation p WHERE p.film = :filmParam")
	List<Programmation> findAllByFilm(@Param("filmParam") Film film);
	
	@Query("SELECT p FROM Programmation p WHERE p.film = :film AND p.salle.cinema = :cinema")
	  List<Programmation> findAllByFilmAndCinema(@Param("film") Film film, @Param("cinema") Cinema cinema);
}