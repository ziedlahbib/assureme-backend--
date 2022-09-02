package tn.esprit.spring.service;

import tn.esprit.spring.entity.Assurance;
import tn.esprit.spring.entity.PackPersonalise;

public interface IPackService {
	public void ajoutPack(PackPersonalise pack);
	public void updatePack(PackPersonalise pack,Long idPAck);
	public void supprimerPack (Long idPAck);
	public PackPersonalise affichdetailPAck(Long idPack);

}
