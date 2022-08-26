package tn.esprit.spring.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class User {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long userId;
	private String userName;

	private String address;
	private Boolean active;

	@ManyToMany(cascade = CascadeType.PERSIST, fetch
	= FetchType.EAGER)
	private Set<Role> roles;

	private String city;
	
	private Long code_postale;

	private String tel;
	@NonNull
//	@Size(max = 50)
//	@Email
	private String email;

	
	private String firstName;

	
	private String gender;

	
	private String lastName;

	@NonNull
//	@Size(min = 8, max = 60)
	private String password;
	@NonNull
	private String profession;
	@Temporal(TemporalType.DATE)
	private Date birthday;

	@NonNull
	private String date_obtention_permis;
	@NonNull
	private String sit_matr;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="user")
	private List<Vehicule> veh;
	
}
