package tn.esprit.spring.service;

import com.sun.xml.bind.v2.runtime.reflect.Lister.Pack;

import tn.esprit.spring.entity.Assurance;
import tn.esprit.spring.entity.PackPersonalise;

public interface IPackService {
	public PackPersonalise ajoutPack(PackPersonalise pack);
	public void updatePack(PackPersonalise pack,Long idPAck);
	public void supprimerPack (Long idPAck);
	public PackPersonalise affichdetailPAck(Long idPack);

}
