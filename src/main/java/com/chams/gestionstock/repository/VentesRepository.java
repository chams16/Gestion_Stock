package com.chams.gestionstock.repository;

import com.chams.gestionstock.model.Ventes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentesRepository extends JpaRepository<Ventes,Integer> {
}
