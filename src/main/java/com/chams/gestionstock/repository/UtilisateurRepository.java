package com.chams.gestionstock.repository;

import com.chams.gestionstock.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
public interface UtilisateurRepository extends JpaRepository<Integer, Utilisateur> {
}
