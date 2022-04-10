package com.chams.gestionstock.dto;

import com.chams.gestionstock.model.Adress;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Builder
@Data
public class AdressDto {

    private String adresse1;

    private String adresse2;

    private String ville;

    private String codePostal;

    private String pays;

    public AdressDto fromEntity(Adress adress){
        if(adress==null){
            return null;
        }
        return AdressDto.builder()
                .adresse1(adress.getAdresse1())
                .adresse2(adress.getAdresse2())
                .pays(adress.getPays())
                .ville(adress.getVille())
                .codePostal(adress.getCodePostal())
                .build();
    }

    public Adress toEntity(AdressDto adressDto){
        if(adressDto==null){
            return null;
        }
        Adress adress = new Adress();
        adress.setAdresse1(adressDto.getAdresse1());
        adress.setAdresse2(adressDto.getAdresse2());
        adress.setCodePostal(adressDto.getCodePostal());
        adress.setPays(adressDto.getPays());
        adress.setVille(adressDto.getVille());

        return adress;
    }
}
