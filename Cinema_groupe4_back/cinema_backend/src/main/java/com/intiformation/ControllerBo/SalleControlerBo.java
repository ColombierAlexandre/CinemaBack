package com.intiformation.ControllerBo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.businessObject.SalleBo;
import com.intiformation.mapper.SalleMapper;
import com.intiformation.modele.Salle;
import com.intiformation.service.SalleService;

@RestController
@RequestMapping("salleBo_api")
@CrossOrigin("http://localhost:4200")
public class SalleControlerBo {

	@Autowired
	private SalleService salleService;
	private SalleMapper salleMapper;
	
	@GetMapping("/salle")
	public SalleBo getSalleBoById(@RequestBody Salle salle) {
		return salleMapper.salleToSalleBo(salle);
	}
	
	@GetMapping
	public List<SalleBo> getAllSalle (){
		List<SalleBo> listeSalleBo = new ArrayList<>();
		for(Salle salle : salleService.getAllSalle()) {
			listeSalleBo.add(salleMapper.salleToSalleBo(salle));
		}
		return listeSalleBo;
	}
	
	
	
}
