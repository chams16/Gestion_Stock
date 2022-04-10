package com.chams.gestionstock.repository;

import com.chams.gestionstock.model.LigneCommandeclient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeClientRepository extends JpaRepository<Integer, LigneCommandeclient> {
}
