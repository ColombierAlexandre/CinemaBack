package com.intiformation.mapper;

import org.springframework.stereotype.Component;

import com.intiformation.businessObject.PlaceBo;
import com.intiformation.modele.Place;

@Component
public class PlaceMapper {
	
	public PlaceBo placeToPlaceBo(Place place) {
		PlaceBo placeBo = new PlaceBo();
		placeBo.setIdPlace(place.getIdPlace());
		placeBo.setNumeroPlace(place.getNumeroPlace());
		placeBo.setIsUsed(place.isUsed());
		return placeBo;
	}
	
	public Place placeBoToPlace(PlaceBo placeBo) {
		Place place = new Place();
		place.setIdPlace(placeBo.getIdPlace());
		place.setNumeroPlace(placeBo.getNumeroPlace());
		place.setUsed(placeBo.isUsed());
		return place;
	}
}
