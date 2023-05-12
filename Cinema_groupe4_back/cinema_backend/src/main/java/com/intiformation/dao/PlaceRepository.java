package com.intiformation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.intiformation.modele.Place;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {

	@Query("SELECT p FROM Place p WHERE p.programmation = :progParam")
	List<Place> getAllPlaceForShow(@Param("progParam") Long idProg);

}
