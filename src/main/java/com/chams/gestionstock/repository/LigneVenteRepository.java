package com.chams.gestionstock.repository;

import com.chams.gestionstock.model.LigneVente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneVenteRepository extends JpaRepository<Integer, LigneVente> {
}
