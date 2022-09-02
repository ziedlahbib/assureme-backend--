package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Assurance;
import tn.esprit.spring.entity.FileDB;
import tn.esprit.spring.entity.Vehicule;
import tn.esprit.spring.service.IVehiculeService;

@CrossOrigin(origins = "http://localhost:4200/",exposedHeaders="Access-Control-Allow-Origin" )
@RestController
@RequestMapping("/vehicule")
public class VehiculeController {
	@Autowired
	IVehiculeService vehiculeserv;
	
	@PostMapping("/ajout-vehicule/{userid}")
	@ResponseBody
	public void addVehicule(@RequestBody Vehicule u,@PathVariable("userid") Long userid) {
		vehiculeserv.ajoutVehicule(u,userid);

	}
	@GetMapping("/get-vehcule/{id-veh}")
	@ResponseBody
	public Vehicule getvehiculebyid(@PathVariable("id-veh") Long idveh) {
		return vehiculeserv.affichDetailVehicule(idveh);

	}
	@GetMapping("/get-vehculeByUser/{id-user}")
	@ResponseBody
	public List<Vehicule> getvehiculebyiduser(@PathVariable("id-user") Long iduser) {
		return vehiculeserv.affichvehiculeByIDuser(iduser);

	}
	@PutMapping("/affecter-vehicule-assurance/{id-assu}/{id-veh}")
	@ResponseBody
	public Vehicule affectervehiculeauassurance(@PathVariable("id-assu") Long idassu,@PathVariable("id-veh") Long idveh) {
		return vehiculeserv.affectervehauassu(idassu, idveh);

	}
	@PutMapping("/desaaffecter-vehicule-assurance/{id-veh}")
	@ResponseBody
	public Vehicule affectervehiculeauassurance(@PathVariable("id-veh") Long idveh) {
		return vehiculeserv.desaffectervehauassu( idveh);

	}

	@PutMapping("/affecter-file-vehicule/{id-veh}/{id-file}")
	@ResponseBody
	public FileDB affecterfilevehicule(@PathVariable("id-veh") Long iduser,@PathVariable("id-file") Long idfile) {
		return vehiculeserv.affcterfilevehicule(iduser, idfile);

	}

}
