package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import tn.esprit.spring.entity.Assurance;


@Repository
public interface AssuranceRepsitory extends JpaRepository<Assurance, Long> {
	@Query("Select c FROM Assurance c where c.prix >=:prix")
	List<Assurance> listassuranceparprixsup(@Param("prix") float prix);

}
