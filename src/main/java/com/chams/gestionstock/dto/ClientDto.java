package com.chams.gestionstock.dto;

import com.chams.gestionstock.model.Adress;
import com.chams.gestionstock.model.Client;
import com.chams.gestionstock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdressDto adress;

    private String photo;

    private String mail;

    private String numTel;

    private List<LignCommandeClientDto> commandeClients;

    private AdressDto adresse;

    public static ClientDto fromEntity(Client client){
        if(client ==null){
            return null;
        }
        return ClientDto.builder()
                .id(client.getId())
                .nom(client.getNom())
                .prenom(client.getPrenom())
                .adresse(AdressDto.fromEntity(client.getAdress()))
                .photo(client.getPhoto())
                .mail(client.getMail())
                .numTel(client.getNumTel())
                .build();
    }

    public static Client toEntity(ClientDto clientDto){
        if(clientDto==null){
            return null;
        }
        Client client = new Client();
        client.setId(clientDto.getId());
        client.setNom(clientDto.getNom());
        client.setPrenom(clientDto.getPrenom());
        client.setAdress(client.getAdress());
        client.setPhoto(clientDto.getPhoto());
        client.setMail(clientDto.getMail());
        client.setNumTel(clientDto.getNumTel());
        return client;
    }
}
