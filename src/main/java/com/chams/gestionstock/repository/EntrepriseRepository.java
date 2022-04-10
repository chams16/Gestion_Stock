package com.chams.gestionstock.repository;

import com.chams.gestionstock.model.Entreprise;
import org.apache.el.parser.JJTELParserState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository extends JpaRepository<Integer, Entreprise> {
}
