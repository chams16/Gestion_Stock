package com.chams.gestionstock.repository;

import com.chams.gestionstock.model.CommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeFournisseurRepository extends JpaRepository<Integer, CommandeFournisseur> {
}
