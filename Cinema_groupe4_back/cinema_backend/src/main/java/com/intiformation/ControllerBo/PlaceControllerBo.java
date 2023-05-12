package com.intiformation.ControllerBo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.businessObject.PlaceBo;
import com.intiformation.mapper.PlaceMapper;
import com.intiformation.modele.Place;
import com.intiformation.service.PlaceService;

@RestController
@RequestMapping("placeBo_api")
@CrossOrigin("http://localhost:4200")
public class PlaceControllerBo {

	@Autowired
	private PlaceService placeService;
	private PlaceMapper placeMapper;
	
	@GetMapping("/{id}")
	public PlaceBo getPlaceBoById(@PathVariable("id") Long idPlaceBo) {
		return placeMapper.placeToPlaceBo(placeService.getPlaceById(idPlaceBo));	
	}
	
	@GetMapping
	public List<PlaceBo> getAllPlaceBo() {
		List<PlaceBo> listePlaceBo = new ArrayList<>();
		for(Place place : placeService.getAllPlace()) {
			listePlaceBo.add(placeMapper.placeToPlaceBo(place));
		}		
		return listePlaceBo;
	}
	
	@GetMapping("/allProg/{id}")
	public List<PlaceBo> getAllPlaceByProgrammation(@PathVariable("id") Long idProg) {
		List<PlaceBo> listePlaceBo = new ArrayList<>();
		for(Place place : placeService.getAllPlaceForShow(idProg)) {
			listePlaceBo.add(placeMapper.placeToPlaceBo(place));
		}		
		return listePlaceBo;
	}
	
}
