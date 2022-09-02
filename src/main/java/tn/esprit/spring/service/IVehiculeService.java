package tn.esprit.spring.service;

import tn.esprit.spring.entity.FileDB;
import tn.esprit.spring.entity.Vehicule;
import java.util.List;
public interface IVehiculeService {
	public void ajoutVehicule(Vehicule veh,Long idUser);
	public void supprimervehicule(Long idveh);
	public void updatevehicule(Vehicule veh,Long idveh);
	public Vehicule affichDetailVehicule(Long idVeh);
	public List<Vehicule> affichervehcules();
	public List<Vehicule> affichvehiculeByIDuser(Long idUser);
	public Vehicule affectervehauassu(Long idassu,Long idveh);
	public Vehicule desaffectervehauassu(Long idveh);
	public FileDB affcterfilevehicule(Long idvehicule,Long idfile);


}
