package tn.esprit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Assurance;
import tn.esprit.spring.entity.PackPersonalise;
import tn.esprit.spring.repository.PackPersonaliseRepository;

@Service
public class PackServiceImpl implements IPackService {
	@Autowired
	PackPersonaliseRepository packpersRepo;

	@Override
	public void ajoutPack(PackPersonalise pack) {
		// TODO Auto-generated method stub
		packpersRepo.save(pack);
	}

	@Override
	public void updatePack(PackPersonalise pack, Long idPAck) {
		// TODO Auto-generated method stub
		PackPersonalise a=packpersRepo.findById(idPAck).orElse(null);
		a.setAssistance(pack.getAssistance());
		a.setBris_de_glace(pack.getBris_de_glace());
		a.setGarantie_conducteur(pack.getGarantie_conducteur());
		a.setGarentie_incendie(pack.getGarentie_incendie());
		a.setProtection_juridique(pack.getProtection_juridique());
		a.setPrix(pack.getPrix());
		a.setVol(pack.getVol());
		packpersRepo.save(a);
		
	}

	@Override
	public void supprimerPack(Long idPAck) {
		// TODO Auto-generated method stub
		packpersRepo.deleteById(idPAck);
		
	}

	@Override
	public PackPersonalise affichdetailPAck(Long idPack) {
		// TODO Auto-generated method stub
		return packpersRepo.findById(idPack).orElse(null);
	}

}
