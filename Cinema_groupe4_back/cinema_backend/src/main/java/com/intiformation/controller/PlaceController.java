package com.intiformation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.modele.Place;
import com.intiformation.modele.Programmation;
import com.intiformation.service.PlaceService;

@RestController
@RequestMapping("/place_api")
@CrossOrigin("http://localhost:4200")
public class PlaceController {

	@Autowired
	PlaceService placeService;

	@PostMapping
	public Place ajouterPlace(@RequestBody Place place) {
		return placeService.addPlace(place);
	}

	@PutMapping
	public Place updatePlace(@RequestBody Place place) {
		return placeService.updatePlace(place);
	}

	@DeleteMapping("/{id}")
	public void deletePlace(@PathVariable("id") Long idPlace) {
		placeService.deletePlace(idPlace);
	}

	@GetMapping("/{id}")
	public Place getPlaceById(@PathVariable("id") Long idPlace) {
		return placeService.getPlaceById(idPlace);
	}

	@GetMapping
	public List<Place> getAllProgrammation() {
		return placeService.getAllPlace();
	}
	
	@PostMapping("/getAllProgForShow")
	public List<Place> getAllPlaceForShow(@RequestBody Programmation programmation) {
		return placeService.getAllPlaceForShow(programmation);
	}


}
