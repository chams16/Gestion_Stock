package com.chams.gestionstock.dto;

import com.chams.gestionstock.model.Adress;
import com.chams.gestionstock.model.Entreprise;
import com.chams.gestionstock.model.Roles;
import com.chams.gestionstock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Builder
@Data
public class UtilisateurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdressDto adress;

    private Instant dateDeNaissance;

    private String photo;

    private String mail;

    private String motDePasse;

    private EntrepriseDto entreprise;

    private List<RolesDto> roles;

    public UtilisateurDto fromEntity(Utilisateur utilisateur){
        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .adress(adress.fromEntity(utilisateur.getAdress()))
                .dateDeNaissance(utilisateur.getDateDeNaissance())
                .photo(utilisateur.getPhoto())
                .mail(utilisateur.getMail())
                .motDePasse(utilisateur.getMotDePasse())
                .entreprise(entreprise.fromEntity(utilisateur.getEntreprise()))
                .build();
    }

    public Utilisateur toEntity(UtilisateurDto utilisateurDto){
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(utilisateurDto.getId());
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setPrenom(utilisateurDto.getPrenom());
        utilisateur.setDateDeNaissance(utilisateur.getDateDeNaissance());
        utilisateur.setAdress(utilisateur.getAdress());
        utilisateur.setPhoto(utilisateurDto.getPhoto());
        utilisateur.setMail(utilisateurDto.getMail());
        utilisateur.setMotDePasse(utilisateurDto.getMotDePasse());
        utilisateur.setEntreprise(utilisateur.getEntreprise());

        return utilisateur;
    }
}
