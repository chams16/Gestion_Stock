package com.chams.gestionstock.Service.Impl;

import com.chams.gestionstock.Service.CommandeClientService;
import com.chams.gestionstock.dto.ArticleDto;
import com.chams.gestionstock.dto.CommandClientDto;
import com.chams.gestionstock.dto.LignCommandeClientDto;
import com.chams.gestionstock.dto.MvtStckDto;
import com.chams.gestionstock.exceptions.EntityNotFoundException;
import com.chams.gestionstock.exceptions.ErrorCodes;
import com.chams.gestionstock.exceptions.InvalidEntityException;
import com.chams.gestionstock.exceptions.InvalidOperationException;
import com.chams.gestionstock.model.*;
import com.chams.gestionstock.repository.ArticleRepository;
import com.chams.gestionstock.repository.ClientRepository;
import com.chams.gestionstock.repository.CommandeClientRepository;
import com.chams.gestionstock.repository.LigneCommandeClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class CommandeClientServiceImpl implements CommandeClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private CommandeClientRepository commandeClientRepository;
    @Autowired
    private ArticleRepository articleRepository;
    @Autowired
    private LigneCommandeClientRepository ligneCommandeClientRepository;

    @Override
    public CommandClientDto save(CommandClientDto dto) {

        List<String> errors = new ArrayList<>();

        if (!errors.isEmpty()) {
            log.error("Commande client n'est pas valide");
            throw new InvalidEntityException("La commande client n'est pas valide", ErrorCodes.COMMANDE_CLIENT_NOT_VALID, errors);
        }

        Optional<Client> client = clientRepository.findById(dto.getClient().getId());
        if (client.isEmpty()) {
            log.warn("Client with ID {} was not found in the DB", dto.getClient().getId());
            throw new EntityNotFoundException("Aucun client avec l'ID" + dto.getClient().getId() + " n'a ete trouve dans la BDD",
                    ErrorCodes.CLIENT_NOT_FOUND);
        }

        List<String> articleErrors = new ArrayList<>();

        if (dto.getLigneCommandeclients() != null) {
            dto.getLigneCommandeclients().forEach(ligCmdClt -> {
                if (ligCmdClt.getArticle() != null) {
                    Optional<Article> article = articleRepository.findById(ligCmdClt.getArticle().getId());
                    if (article.isEmpty()) {
                        articleErrors.add("L'article avec l'ID " + ligCmdClt.getArticle().getId() + " n'existe pas");
                    }
                } else {
                    articleErrors.add("Impossible d'enregister une commande avec un aticle NULL");
                }
            });
        }

        if (!articleErrors.isEmpty()) {
            log.warn("");
            throw new InvalidEntityException("Article n'existe pas dans la BDD", ErrorCodes.ARTICLE_NOT_FOUND, articleErrors);
        }
        dto.setDateCommande(Instant.now());
        CommandeClient savedCmdClt = commandeClientRepository.save(CommandClientDto.toEntity(dto));

        if (dto.getLigneCommandeclients() != null) {
            dto.getLigneCommandeclients().forEach(ligCmdClt -> {
                LigneCommandeclient ligneCommandeClient = LignCommandeClientDto.toEntity(ligCmdClt);
                ligneCommandeClient.setCommandeClient(savedCmdClt);
                //ligneCommandeClient.setIdEntreprise(dto.get);
                LigneCommandeclient savedLigneCmd = ligneCommandeClientRepository.save(ligneCommandeClient);

                //effectuerSortie(savedLigneCmd);
            });
        }


        if (!articleErrors.isEmpty()) {
            log.warn("");
            throw new InvalidEntityException("Article n'existe pas dans la BDD", ErrorCodes.ARTICLE_NOT_FOUND, articleErrors);
        }

        return CommandClientDto.fromEntity(savedCmdClt);
    }


    @Override
    public CommandClientDto updateEtatCommande(Integer idCommande, EtatCommande etatCommande) {
        return null;
    }

    @Override
    public CommandClientDto updateQuantiteCommande(Integer idCommande, Integer idLigneCommande, BigDecimal quantite) {
        return null;
    }

    @Override
    public CommandClientDto updateClient(Integer idCommande, Integer idClient) {
        return null;
    }

    @Override
    public CommandClientDto updateArticle(Integer idCommande, Integer idLigneCommande, Integer newIdArticle) {
        return null;
    }

    @Override
    public CommandClientDto deleteArticle(Integer idCommande, Integer idLigneCommande) {
        return null;
    }

    @Override
    public CommandClientDto findById(Integer id) {
        if(id==null){
            log.error("");
            return null;
        }
        return commandeClientRepository.findById(id).map(CommandClientDto::fromEntity).orElseThrow(()->(
            new EntityNotFoundException( "Aucune commande client n'a ete trouve avec l'ID " + id, ErrorCodes.COMMANDE_CLIENT_NOT_FOUND)
        ));
    }

    @Override
    public CommandClientDto findByCode(String code) {
        if(code==null){
            log.error("");
            return null;
        }
//        return commandeClientRepository.findByCode(code).map(CommandClientDto::fromEntity).orElseThrow(()->(
//                new EntityNotFoundException(
//                        "Aucune commande client n'a ete trouve avec le CODE " + code, ErrorCodes.COMMANDE_CLIENT_NOT_FOUND
//                )
//                ));
        return null;
    }

    @Override
    public List<CommandClientDto> findAll() {
        return commandeClientRepository.findAll().stream()
                .map(CommandClientDto::fromEntity)
                .collect(Collectors.toList());
    }

    @Override
    public List<LignCommandeClientDto> findAllLignesCommandesClientByCommandeClientId(Integer idCommande) {
        return null;
    }

    @Override
    public void delete(Integer id) {
        if (id == null) {
            log.error("Commande client ID is NULL");
            return;
        }
        List<LigneCommandeclient> ligneCommandeClients = ligneCommandeClientRepository.findAllByCommandeClientId(id);
        if (!ligneCommandeClients.isEmpty()) {
            throw new InvalidOperationException("Impossible de supprimer une commande client deja utilisee",
                    ErrorCodes.COMMANDE_CLIENT_ALREADY_IN_USE);
        }
        commandeClientRepository.deleteById(id);
    }
}
