package com.chams.gestionstock.dto;

import com.chams.gestionstock.model.Adress;
import com.chams.gestionstock.model.Entreprise;
import com.chams.gestionstock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Builder
@Data
public class EntrepriseDto {

    private Integer id;

    private String nom;

    private String description;

    private AdressDto adresse;

    private String codeFiscale;

    private String photo;

    private String email;

    private String numTel;

    private String siteWeb;

    private List<UtilisateurDto> utilisateurs;

    public EntrepriseDto fromEntity(Entreprise entreprise){
        if(entreprise==null){
            return null;
        }
        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .description(entreprise.getDescription())
                .adresse(adresse.fromEntity(entreprise.getAdresse()))
                .codeFiscale(entreprise.getCodeFiscale())
                .photo(entreprise.getPhoto())
                .email(entreprise.getEmail())
                .numTel(entreprise.getNumTel())
                .siteWeb(entreprise.getSiteWeb())
                .build();
    }

    public Entreprise toEntity(EntrepriseDto entrepriseDto){
        if(entrepriseDto==null){
            return null;
        }
        Entreprise entreprise = new Entreprise();
        entreprise.setId(entrepriseDto.getId());
        entreprise.setNom(entrepriseDto.getNom());
        entreprise.setDescription(entrepriseDto.getDescription());
        entreprise.setNumTel(entrepriseDto.getNumTel());
        entreprise.setPhoto(entrepriseDto.getPhoto());
        entreprise.setEmail(entrepriseDto.getEmail());
        entreprise.setAdresse(entreprise.getAdresse());
        entreprise.setCodeFiscale(entrepriseDto.getCodeFiscale());
        entreprise.setSiteWeb(entrepriseDto.getSiteWeb());
    return entreprise;
    }
}
