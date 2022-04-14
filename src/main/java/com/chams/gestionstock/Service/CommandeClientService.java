package com.chams.gestionstock.Service;

import com.chams.gestionstock.dto.CommandClientDto;
import com.chams.gestionstock.dto.LignCommandeClientDto;
import com.chams.gestionstock.model.EtatCommande;

import java.math.BigDecimal;
import java.util.List;

public interface CommandeClientService {

    CommandClientDto save(CommandClientDto dto);

    CommandClientDto updateEtatCommande(Integer idCommande, EtatCommande etatCommande);

    CommandClientDto updateQuantiteCommande(Integer idCommande, Integer idLigneCommande, BigDecimal quantite);

    CommandClientDto updateClient(Integer idCommande, Integer idClient);

    CommandClientDto updateArticle(Integer idCommande, Integer idLigneCommande, Integer newIdArticle);

    // Delete article ==> delete LigneCommandeClient
    CommandClientDto deleteArticle(Integer idCommande, Integer idLigneCommande);

    CommandClientDto findById(Integer id);

    CommandClientDto findByCode(String code);

    List<CommandClientDto> findAll();

    List<LignCommandeClientDto> findAllLignesCommandesClientByCommandeClientId(Integer idCommande);

    void delete(Integer id);
}
