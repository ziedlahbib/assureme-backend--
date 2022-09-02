package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
public class Vehicule implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long vehId;
	@Temporal(TemporalType.DATE)
	private Date date_achat;
	@Temporal(TemporalType.DATE)
	private Date date_mise_cir;
	@NonNull
	@Enumerated(EnumType.STRING)
	private Marque marque;
	@NonNull
	@Enumerated(EnumType.STRING)
	private Modele modele;
	@NonNull
	@Enumerated(EnumType.STRING)
	private Carosserie carosserie;
	@NonNull
	@Enumerated(EnumType.STRING)
	private Alimentation alimentation;
	@NonNull
	@Enumerated(EnumType.STRING)
	private Puissance puissance;
	private String etat_assu;
	@ManyToOne
	@JsonBackReference
	private User user;
	@ManyToOne
	@JsonIgnore
	private Assurance assu;
	@ManyToOne
	@JsonIgnore
	private PackPersonalise pack;
	@OneToMany(mappedBy="veh")
	@JsonManagedReference
	private List<FileDB> files;
}
