package com.chams.gestionstock.repository;

import com.chams.gestionstock.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Integer, Client> {
}
