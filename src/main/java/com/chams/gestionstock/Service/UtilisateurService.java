package com.chams.gestionstock.Service;

import com.chams.gestionstock.dto.UtilisateurDto;

import java.util.List;

public interface UtilisateurService {

    UtilisateurDto save(UtilisateurDto dto);

    UtilisateurDto findById(Integer id);

    List<UtilisateurDto> findAll();

    void delete(Integer id);

    UtilisateurDto findByEmail(String email);

    //UtilisateurDto changerMotDePasse(ChangerMotDePasseUtilisateurDto dto);
}
