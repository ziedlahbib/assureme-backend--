package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Assurance;
import tn.esprit.spring.repository.AssuranceRepsitory;
@Service
public class AssuranceServiceImpl implements IAssuranceService {

	@Autowired
	AssuranceRepsitory assuRepo;
	@Override
	public void ajoutAssurance(Assurance assu) {
		// TODO Auto-generated method stub
		assuRepo.save(assu);
	}

	@Override
	public void updateAssurance(Assurance assu, Long idAssu) {
		// TODO Auto-generated method stub
		Assurance a=assuRepo.findById(idAssu).orElse(null);
		a.setAssistance(assu.getAssistance());
		a.setBris_de_glace(assu.getBris_de_glace());
		a.setGarantie_conducteur(assu.getGarantie_conducteur());
		a.setGarentie_incendie(assu.getGarentie_incendie());
		a.setProtection_juridique(assu.getProtection_juridique());
		a.setPrix(assu.getPrix());
		a.setVol(assu.getVol());
		assuRepo.save(a);
	}

	@Override
	public Assurance affichdetailAssurance(Long idAssu) {
		// TODO Auto-generated method stub
		return assuRepo.findById(idAssu).orElse(null);
	}

	@Override
	public List<Assurance> afficher() {
		// TODO Auto-generated method stub
		return assuRepo.findAll();
	}

	@Override
	public void supprimerAssurance(Long idAssu) {
		// TODO Auto-generated method stub
		assuRepo.deleteById(idAssu);
	}

	@Override
	public float calculprix(Assurance assu) {
		 float prix =0;
		if(assu.getAssistance().equalsIgnoreCase("yes"))
			prix=prix+20;
		if(assu.getBris_de_glace().equalsIgnoreCase("yes"))
			prix=prix+60;
		if(assu.getGarantie_conducteur().equalsIgnoreCase("yes"))
			prix=prix+20;
		if(assu.getGarentie_incendie().equalsIgnoreCase("yes"))
			prix=prix+100;
		if(assu.getProtection_juridique().equalsIgnoreCase("yes"))
			prix=prix+20;
		if(assu.getVol().equalsIgnoreCase("yes"))
			prix=prix+200;
		return prix;
	}

}
