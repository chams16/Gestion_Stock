package com.chams.gestionstock.repository;

import com.chams.gestionstock.model.MvtStk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MvtStckRepository extends JpaRepository<MvtStk,Integer> {
}
