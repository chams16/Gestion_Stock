package com.chams.gestionstock.repository;

import com.chams.gestionstock.dto.CommandClientDto;
import com.chams.gestionstock.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommandeClientRepository extends JpaRepository<CommandeClient,Integer> {
    List<CommandeClient> findAllByClientId(Integer id);

    Optional<CommandClientDto> findByCode(String code);
}
