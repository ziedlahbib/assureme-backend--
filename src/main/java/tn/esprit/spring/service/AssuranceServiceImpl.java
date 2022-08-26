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
		a.setDescription(assu.getDescription());
		a.setPrix(assu.getPrix());
		
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

}
