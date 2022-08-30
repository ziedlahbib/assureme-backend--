package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Assurance;
import tn.esprit.spring.entity.Mpack;

public interface IAssuranceService {

	public void ajoutAssurance(Assurance assu);
	public void updateAssurance(Assurance assu,Long idAssu);
	public void supprimerAssurance (Long idAssu);
	public Assurance affichdetailAssurance(Long idAssu);
	public List<Assurance> afficher();
	public float calculprix(Assurance assu);
	public List<Assurance> meilleurassurance(Mpack mpack);
	public float minimumprice(Mpack mpack);
}
