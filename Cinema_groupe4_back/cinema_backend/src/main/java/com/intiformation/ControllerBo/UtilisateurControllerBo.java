package com.intiformation.ControllerBo;

import java.util.ArrayList;
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

import com.intiformation.businessObject.UtilisateurBo;
import com.intiformation.mapper.UtilisateurMapper;
import com.intiformation.modele.Utilisateur;
import com.intiformation.service.UtilisateurService;

@RestController
@RequestMapping("utilisateurBo_api")
@CrossOrigin("http://localhost:4200")
public class UtilisateurControllerBo {
	
	@Autowired
	private UtilisateurService utilisateurService;
	private UtilisateurMapper utilisateurMapper;
	
	@PostMapping
	public UtilisateurBo addUtilisateurBo(@RequestBody Utilisateur utilisateur) {
		return utilisateurMapper.utilisateurToUtilisateurBo(utilisateurService.addUtilisateurService(utilisateur));
	}
	
	@PutMapping
	public UtilisateurBo updateUtilisateurBo(@RequestBody Utilisateur utilisateur) {
		return utilisateurMapper.utilisateurToUtilisateurBo(utilisateurService.updateUtilisateurService(utilisateur));
	}
	
	@DeleteMapping("/{id}")
	public void deleteUtilisateurController(@PathVariable("id") long idUtilisateurBo) {
			utilisateurService.deleteUtilisateurService(idUtilisateurBo);
	}
	
	@GetMapping("/{id}")
	public UtilisateurBo getUtilisateurBoById(@PathVariable("id") long idUtilisateur) {
		return utilisateurMapper.utilisateurToUtilisateurBo(utilisateurService.getUtilisateurByIdService(idUtilisateur));
	}
	
	@GetMapping("/mail/{mailParam}")
	public UtilisateurBo getUtilisateurBoByMail(@PathVariable("mailParam")String email) {
		return utilisateurMapper.utilisateurToUtilisateurBo(utilisateurService.getUtilisateurByEmailService(email));
	}
	
	@GetMapping
	public List<UtilisateurBo> getAllUtilisateursBo() {
		List<UtilisateurBo> listeUtilisateurBo = new ArrayList<>();
		for(Utilisateur utilisateur : utilisateurService.getAllUtilisateursService()) {
			listeUtilisateurBo.add(utilisateurMapper.utilisateurToUtilisateurBo(utilisateur));
		}
		return listeUtilisateurBo;
	}

}
