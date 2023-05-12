package com.intiformation.ControllerBo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.businessObject.ProgrammationBo;
import com.intiformation.mapper.ProgrammationMapper;
import com.intiformation.modele.Film;
import com.intiformation.modele.Programmation;
import com.intiformation.service.ProgrammationService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("programmationBo_api")
@CrossOrigin("http://localhost:4200")
public class ProgrammationControllerBo {

	@Autowired
	ProgrammationService programmationService;
	ProgrammationMapper programmationMapper;

	@GetMapping("/{id}")
	public ProgrammationBo getProgrammationBoById(@PathVariable("id") Long idProgrammation) {
		return programmationMapper
				.programmationToProgrammationBo(programmationService.getProgrammationById(idProgrammation));
	}

	@GetMapping
	public List<ProgrammationBo> getAllProgrammationByFilm(@RequestBody Film film) {
		List<ProgrammationBo> listeProgrammationBo = new ArrayList<>();
		for (Programmation programmation : programmationService.getAllProgrammationByFilm(film)) {
			listeProgrammationBo.add(programmationMapper.programmationToProgrammationBo(programmation));
		}
		return listeProgrammationBo;
	}
}
