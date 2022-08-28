package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.User;
import tn.esprit.spring.entity.Vehicule;

import tn.esprit.spring.repository.UserRepository;
import tn.esprit.spring.repository.VehiculeRepository;

@Service
public class VehiculeServiceImpl implements IVehiculeService {

	@Autowired
	VehiculeRepository vehRepo;
	@Autowired
	UserRepository userRepo;
	@Override
	public void ajoutVehicule(Vehicule veh,Long idUser) {
		// TODO Auto-generated method stub
		User u =userRepo.getById(idUser);
		veh.setUser(u);
		vehRepo.save(veh);
	}

	@Override
	public void supprimervehicule(Long idveh) {
		
		vehRepo.deleteById(idveh);;
	}

	@Override
	public void updatevehicule(Vehicule veh,Long idveh) {
		// TODO Auto-generated method stub
		Vehicule v =vehRepo.findById(idveh).orElse(null);
		v.setAlimentation(veh.getAlimentation());
		v.setAssu(veh.getAssu());
		v.setCarosserie(veh.getCarosserie());
		v.setDate_achat(veh.getDate_achat());
		v.setDate_mise_cir(veh.getDate_mise_cir());
		v.setMarque(veh.getMarque());
		v.setModele(veh.getModele());
		v.setPuissance(veh.getPuissance());
		
	}

	@Override
	public Vehicule affichDetailVehicule(Long idVeh) {
		// TODO Auto-generated method stub
		return vehRepo.findById(idVeh).orElse(null);
	}

	@Override
	public List<Vehicule> affichervehcules() {
		// TODO Auto-generated method stub
		return vehRepo.findAll();
	}

	@Override
	public List<Vehicule> affichvehiculeByIDuser(Long idUser) {
		// TODO Auto-generated method stub
		User u = userRepo.findById(idUser).orElse(null);
		return u.getVeh();
	}

}
