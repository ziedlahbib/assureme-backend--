package tn.esprit.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Assurance;


@Repository
public interface AssuranceRepsitory extends JpaRepository<Assurance, Long> {

}
