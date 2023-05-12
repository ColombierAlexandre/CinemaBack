package com.intiformation.mapper;

import com.intiformation.businessObject.SalleBo;
import com.intiformation.modele.Salle;

public class SalleMapper {
	
	public SalleBo salleToSalleBo(Salle salle) {
		SalleBo salleBo = new SalleBo();
		salleBo.setIdSalle(salle.getIdSalle());
		salleBo.setNumero(salle.getNumero());
		salleBo.setNombreDePlaces(salle.getNombreDePlaces());
		return salleBo;
	}
	
	public Salle salleBoToSalle(SalleBo salleBo) {
		Salle salle = new Salle();
		salle.setIdSalle(salleBo.getIdSalle());
		salle.setNumero(salleBo.getNumero());
		salle.setNombreDePlaces(salleBo.getNombreDePlaces());
		return salle;
	}

}
