package tn.esprit.spring.controller;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Assurance;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.service.IAssuranceService;

@CrossOrigin(origins = "http://localhost:4200/",exposedHeaders="Access-Control-Allow-Origin" )
@RestController
@RequestMapping("/Assurance")
public class AssuranceController {

	@Autowired
	IAssuranceService assuservice;
	@PostMapping("/ajout-asssurance")
	@ResponseBody
	public void addUser(@RequestBody Assurance u) {
		assuservice.ajoutAssurance(u);

	}
	@PutMapping("/update-assurance/{id-assu}")
	@ResponseBody
	public void affecterutilisateur(@RequestBody Assurance u,@PathVariable("id-assu") Long idassu) {
		assuservice.updateAssurance(u, idassu);

	}
	@DeleteMapping("/delete-assurance/{id-assu}")
	@ResponseBody
	public void deleteassurance(@PathVariable("id-assu") Long idassu) {
		assuservice.supprimerAssurance(idassu);

	}
	@GetMapping("/get-assu/{id-assu}")
	@ResponseBody
	public Assurance getassurancebyid(@PathVariable("id-assu") Long idassu) {
		return assuservice.affichdetailAssurance(idassu);

	}
	
	@GetMapping("/get-assurance")
	@ResponseBody
	public List<Assurance> getassurances() {
		return assuservice.afficher();

	}
	@PutMapping("/calcule-prix")
	@ResponseBody
	public float getprix(@RequestBody Assurance u) {
		return assuservice.calculprix(u);

	}
}
