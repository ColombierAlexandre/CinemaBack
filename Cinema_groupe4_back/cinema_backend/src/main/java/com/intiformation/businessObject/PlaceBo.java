package com.intiformation.businessObject;

import com.intiformation.modele.Programmation;

public class PlaceBo {
	
	private long idPlace;
	private long numeroPlace;
	private boolean isUsed;
	private Programmation programmation;
	
	public PlaceBo() {
	}

	public PlaceBo(long numeroPlace, boolean isUsed, Programmation programmation) {
		this.numeroPlace = numeroPlace;
		this.isUsed = isUsed;
		this.programmation = programmation;
	}

	public PlaceBo(long idPlace, long numeroPlace, boolean isUsed, Programmation programmation) {
		this.idPlace = idPlace;
		this.numeroPlace = numeroPlace;
		this.isUsed = isUsed;
		this.programmation = programmation;
	}

	public long getIdPlace() {
		return idPlace;
	}

	public void setIdPlace(long idPlace) {
		this.idPlace = idPlace;
	}

	public long getNumeroPlace() {
		return numeroPlace;
	}

	public void setNumeroPlace(long numeroPlace) {
		this.numeroPlace = numeroPlace;
	}

	public boolean isUsed() {
		return isUsed;
	}

	public void setIsUsed(boolean isUsed) {
		this.isUsed = isUsed;
	}

	public Programmation getProgrammation() {
		return programmation;
	}

	public void setProgrammation(Programmation programmation) {
		this.programmation = programmation;
	}
	
}
