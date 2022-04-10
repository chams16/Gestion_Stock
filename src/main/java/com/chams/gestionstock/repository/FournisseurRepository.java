package com.chams.gestionstock.repository;

import com.chams.gestionstock.model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseurRepository extends JpaRepository<Integer, Fournisseur> {
}
