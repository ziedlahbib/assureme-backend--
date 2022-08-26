package tn.esprit.spring.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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
public class Assurance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long assuId;


	@NonNull
	private String description;

	@NonNull
	private String prix;
	@OneToOne(cascade = CascadeType.ALL, mappedBy="assu")
	private Vehicule veh;
}
