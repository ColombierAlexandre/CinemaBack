package com.intiformation.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.intiformation.modele.Salle;

@Repository
public interface SalleRepository extends JpaRepository<Salle, Long> {

	Optional<Salle> findByNumero(int Numero);

	@Query("SELECT s FROM Salle s WHERE s.cinema = :cineParam")
	List<Salle> findAllByIdCinema(@Param("cineParam") long IdCinema);

}
