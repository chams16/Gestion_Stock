package com.chams.gestionstock.dto;

import com.chams.gestionstock.model.CommandeClient;
import com.chams.gestionstock.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;


import java.time.Instant;
import java.util.List;

@Builder
@Data
public class CommandFournisseurDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private FournisseurDto fournisseur;

    private List<LignCommandeFournisseurDto> ligneCommandeFournisseurs;

    public CommandFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur){
        if(commandeFournisseur==null){
            return null;
        }

        return CommandFournisseurDto.builder()
                .id(commandeFournisseur.getId())
                .code(commandeFournisseur.getCode())
                .dateCommande(commandeFournisseur.getDateCommande())
                .fournisseur(fournisseur.fromEntity(commandeFournisseur.getFournisseur()))
                .build();

    }

    public CommandeFournisseur toEntity(CommandFournisseurDto commandFournisseurDto){
        if(commandFournisseurDto==null){
            return null;
        }

        CommandeFournisseur commandeFournisseur = new CommandeFournisseur();
        commandeFournisseur.setId(commandFournisseurDto.getId());
        commandeFournisseur.setFournisseur(fournisseur.toEntity(commandFournisseurDto.getFournisseur()));
        commandeFournisseur.setCode(commandFournisseurDto.getCode());
        commandeFournisseur.setDateCommande(commandFournisseurDto.getDateCommande());
        return commandeFournisseur;
    }
}
