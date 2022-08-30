package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mpack implements Serializable {
	private static final long serialVersionUID = 1L;

	private String lieu_sattionnemnt;
	private float salaire;
	private int annepermis;
	private int age;
	private int ageauto;
	private int puissance;
	private String mode_financement;
	private String sit_matrimoniale;
	private String conjointpermis;
	private float ageconjpermis;


}
