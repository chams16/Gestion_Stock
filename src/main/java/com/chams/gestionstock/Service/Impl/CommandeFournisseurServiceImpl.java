package com.chams.gestionstock.Service.Impl;

import com.chams.gestionstock.Service.CommandeFournisseurService;
import com.chams.gestionstock.dto.CommandFournisseurDto;
import com.chams.gestionstock.model.EtatCommande;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CommandeFournisseurServiceImpl implements CommandeFournisseurService {
    @Override
    public CommandFournisseurDto save(CommandFournisseurDto dto) {
        return null;
    }

    @Override
    public CommandFournisseurDto updateEtatCommande(Integer idCommande, EtatCommande etatCommande) {
        return null;
    }

    @Override
    public CommandFournisseurDto updateQuantiteCommande(Integer idCommande, Integer idLigneCommande, BigDecimal quantite) {
        return null;
    }

    @Override
    public CommandFournisseurDto updateFournisseur(Integer idCommande, Integer idFournisseur) {
        return null;
    }

    @Override
    public CommandFournisseurDto updateArticle(Integer idCommande, Integer idLigneCommande, Integer idArticle) {
        return null;
    }

    @Override
    public CommandFournisseurDto deleteArticle(Integer idCommande, Integer idLigneCommande) {
        return null;
    }

    @Override
    public CommandFournisseurDto findById(Integer id) {
        return null;
    }

    @Override
    public CommandFournisseurDto findByCode(String code) {
        return null;
    }

    @Override
    public List<CommandFournisseurDto> findAll() {
        return null;
    }

    @Override
    public List<CommandFournisseurDto> findAllLignesCommandesFournisseurByCommandeFournisseurId(Integer idCommande) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
