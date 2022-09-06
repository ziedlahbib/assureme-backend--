package tn.esprit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Assurance;
import tn.esprit.spring.entity.PackPersonalise;
import tn.esprit.spring.service.IAssuranceService;
import tn.esprit.spring.service.IPackService;

@CrossOrigin(origins = "http://localhost:4200/",exposedHeaders="Access-Control-Allow-Origin" )
@RestController
@RequestMapping("/pack")
public class PackController {
	@Autowired
	IPackService packservice;
	@PostMapping("/ajout-pack")
	@ResponseBody
	public PackPersonalise addpack(@RequestBody PackPersonalise u) {
		return packservice.ajoutPack(u);

	}
	@PutMapping("/update-pack/{id-assu}")
	@ResponseBody
	public void updatepack(@RequestBody PackPersonalise u,@PathVariable("id-assu") Long idassu) {
		packservice.updatePack(u, idassu);

	}
	@DeleteMapping("/delete-pack/{id-assu}")
	@ResponseBody
	public void deletepack(@PathVariable("id-assu") Long idassu) {
		packservice.supprimerPack(idassu);

	}
	@GetMapping("/get-pack/{id-assu}")
	@ResponseBody
	public PackPersonalise getassurancebyid(@PathVariable("id-assu") Long idassu) {
		return packservice.affichdetailPAck(idassu);

	}

}
