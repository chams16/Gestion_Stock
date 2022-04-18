package com.chams.gestionstock.repository;

import com.chams.gestionstock.model.LigneCommandeclient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LigneCommandeClientRepository extends JpaRepository<LigneCommandeclient,Integer> {
    List<LigneCommandeclient> findAllByCommandeClientId(Integer id);
}
