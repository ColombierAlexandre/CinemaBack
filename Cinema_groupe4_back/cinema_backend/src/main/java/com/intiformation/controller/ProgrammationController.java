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

import com.intiformation.businessObject.ProgrammationBo;
import com.intiformation.mapper.ProgrammationMapper;
import com.intiformation.modele.Programmation;
import com.intiformation.service.ProgrammationService;

@RestController
@RequestMapping("/programmation_api")
@CrossOrigin("http://localhost:4200")
public class ProgrammationController {

	@Autowired
	ProgrammationService programmationService;
	ProgrammationMapper programmationMapper;


	@PostMapping("/programmationBo")
	public ProgrammationBo ajouterProgrammationBo(@RequestBody ProgrammationBo programmationBo) {
		programmationService.addProgrammation(programmationMapper.programmationBoToProgrammation(programmationBo));
		return programmationBo;
	}

	@PostMapping
	public Programmation ajouterProgrammation(@RequestBody Programmation programmation) {
		return programmationService.addProgrammation(programmation);
	}

	@PutMapping
	public Programmation updateProgrammation(@RequestBody Programmation programmation) {
		return programmationService.updateProgrammation(programmation);
	}

	@DeleteMapping("/{id}")
	public void deleteProgrammation(@PathVariable("id") Long idProgrammation) {
		programmationService.deleteProgrammation(idProgrammation);
	}

	@GetMapping("/programmationBo/{id}")
	public ProgrammationBo getProgrammationBoById(@PathVariable("id") Long idProgrammation) {
		return programmationMapper
				.programmationToProgrammationBo(programmationService.getProgrammationById(idProgrammation));
	}

	@GetMapping("/{id}")
	public Programmation getProgrammationById(@PathVariable("id") Long idProgrammation) {
		return programmationService.getProgrammationById(idProgrammation);
	}

	@GetMapping
	public List<Programmation> getAllProgrammation() {
		return programmationService.getAllProgrammation();
	}

}
