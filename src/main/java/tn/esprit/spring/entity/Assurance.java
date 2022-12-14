package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Assurance implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long assuId;



	@NonNull
	private float prix;

	@NonNull
	private String garantie_conducteur;
	@NonNull
	private String bris_de_glace;
	@NonNull
	private String vol;
	@NonNull
	private String assistance;
	@NonNull
	private String protection_juridique;
	@NonNull
	private String garentie_incendie;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="assu")
	@JsonIgnore
	private List<Vehicule> veh;
}
