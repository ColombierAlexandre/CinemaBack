package com.intiformation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.dao.PlaceRepository;
import com.intiformation.modele.Place;

@Service
public class PlaceService {

	@Autowired
	PlaceRepository placeRepository;

	public Place addPlace(Place place) {
		return placeRepository.save(place);
	}

	public Place updatePlace(Place place) {
		return placeRepository.save(place);
	}

	public void deletePlace(Long idPlace) {
		placeRepository.deleteById(idPlace);
	}

	public Place getPlaceById(Long idPlace) {
		Optional<Place> optPlace = placeRepository.findById(idPlace);
		if (optPlace.isPresent()) {
			return optPlace.get();
		}
		return null;
	}

	public List<Place> getAllPlace() {
		return placeRepository.findAll();
	}

	public List<Place> getAllPlaceForShow(Long idProg) {
		return placeRepository.getAllPlaceForShow(idProg);
	}

}
