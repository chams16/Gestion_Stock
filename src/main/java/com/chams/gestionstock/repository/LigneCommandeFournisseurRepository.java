package com.chams.gestionstock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LigneCommandeFournisseurRepository extends JpaRepository<Integer, LigneCommandeFournisseurRepository> {
}
