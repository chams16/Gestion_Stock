package com.chams.gestionstock.dto;

import com.chams.gestionstock.model.Adress;
import com.chams.gestionstock.model.CommandeFournisseur;
import com.chams.gestionstock.model.Fournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Builder
@Data
public class FournisseurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdressDto adress;

    private String photo;

    private String mail;

    private String numTel;

    private List<LignCommandeFournisseurDto> commandeFournisseurs;

    public FournisseurDto fromEntity(Fournisseur fournisseur){
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .adress(adress.fromEntity(fournisseur.getAdress()))
                .photo(fournisseur.getPhoto())
                .mail(fournisseur.getMail())
                .numTel(fournisseur.getNumTel())
                .build();
    }

    public Fournisseur toEntity(FournisseurDto fournisseurDto){
        Fournisseur fournisseur = new Fournisseur();

        fournisseur.setAdress(adress.toEntity(fournisseurDto.getAdress()));
        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setNom(fournisseurDto.getNom());
        fournisseur.setPrenom(fournisseurDto.getPrenom());
        fournisseur.setMail(fournisseurDto.getMail());
        fournisseur.setNumTel(fournisseurDto.getNumTel());
        fournisseur.setPhoto(fournisseurDto.getPhoto());
        return fournisseur;
    }
}
