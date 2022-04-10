package com.chams.gestionstock.dto;

import com.chams.gestionstock.model.Client;
import com.chams.gestionstock.model.CommandeClient;
import com.chams.gestionstock.model.LigneCommandeclient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandClientDto {

    private Integer id;

    private String code;

    private Instant dateCommande;

    private ClientDto client;

    private List<LignCommandeClientDto> ligneCommandeclients;


    public CommandClientDto fromEntity(CommandeClient commandeClient){
        if(commandeClient==null){
            return null;
        }

        return CommandClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .dateCommande(commandeClient.getDateCommande())
                .client(client.fromEntity(commandeClient.getClient()))
                .build();

    }

    public CommandeClient toEntity(CommandClientDto commandClientDto){
        if(commandClientDto==null){
            return null;
        }

        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(commandClientDto.getId());
        commandeClient.setClient(commandeClient.getClient());
        commandeClient.setCode(commandClientDto.getCode());
        commandeClient.setDateCommande(commandeClient.getDateCommande());
        return commandeClient;
    }
}
