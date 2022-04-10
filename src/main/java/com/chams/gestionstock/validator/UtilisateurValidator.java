package com.chams.gestionstock.validator;

import com.chams.gestionstock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public static List<String> validate(UtilisateurDto utilisateurDto){

        List<String> errors = new ArrayList<>();

        if(utilisateurDto==null){
            errors.add("veuillez remplir le nom");
            errors.add("veuillez remplir le prenom");
            errors.add("veuillez remplir le mot de passe");
            errors.add("veuillez remplir le adresse");
            errors.add("veuillez remplir l'email");
            return errors;
        }

        if(!StringUtils.hasLength(utilisateurDto.getNom())){
            errors.add("veuillez remplir le nom");
        }
        if(!StringUtils.hasLength(utilisateurDto.getPrenom())){
            errors.add("veuillez remplir le prenom");
        }
        if(!StringUtils.hasLength(utilisateurDto.getMotDePasse())){
            errors.add("veuillez remplir le mot de passe");
        }
        if(!StringUtils.hasLength(utilisateurDto.getMail())){
            errors.add("veuillez remplir l'email");
        }
        if(utilisateurDto.getDateDeNaissance()==null){
            errors.add("veuillez renseigner la date de naissance");
        }
        if(utilisateurDto.getAdress()==null){
            errors.add("veuillez remplir le adresse");
        }else{
            if(!StringUtils.hasLength(utilisateurDto.getAdress().getAdresse1())){
                errors.add("veuillez remplir l'adresse1");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdress().getVille())){
                errors.add("veuillez remplir la ville");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdress().getCodePostal())){
                errors.add("veuillez remplir le code postal");
            }
            if(!StringUtils.hasLength(utilisateurDto.getAdress().getPays())){
                errors.add("veuillez remplir la pays");
            }
        }
        return errors;
    }
}
