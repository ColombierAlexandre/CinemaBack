package com.intiformation.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.intiformation.modele.Cinema;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Long> {

	Optional<Cinema> findByNom(String nom);

	@Query("SELECT c FROM Cinema c WHERE c.ville = :villeParam")
	List<Cinema> findAllByVille(@Param("villeParam") String ville);

}
