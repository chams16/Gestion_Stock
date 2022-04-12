package com.chams.gestionstock.repository;

import com.chams.gestionstock.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Rolesrpository extends JpaRepository<Roles,Integer> {
}
