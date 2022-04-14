package com.chams.gestionstock.Service;

import com.chams.gestionstock.dto.CommandFournisseurDto;
import com.chams.gestionstock.model.EtatCommande;

import java.math.BigDecimal;
import java.util.List;

public interface CommandeFournisseurService {

    CommandFournisseurDto save(CommandFournisseurDto dto);

    CommandFournisseurDto updateEtatCommande(Integer idCommande, EtatCommande etatCommande);

    CommandFournisseurDto updateQuantiteCommande(Integer idCommande, Integer idLigneCommande, BigDecimal quantite);

    CommandFournisseurDto updateFournisseur(Integer idCommande, Integer idFournisseur);

    CommandFournisseurDto updateArticle(Integer idCommande, Integer idLigneCommande, Integer idArticle);

    // Delete article ==> delete LigneCommandeFournisseur
    CommandFournisseurDto deleteArticle(Integer idCommande, Integer idLigneCommande);

    CommandFournisseurDto findById(Integer id);

    CommandFournisseurDto findByCode(String code);

    List<CommandFournisseurDto> findAll();

    List<CommandFournisseurDto> findAllLignesCommandesFournisseurByCommandeFournisseurId(Integer idCommande);

    void delete(Integer id);
}
