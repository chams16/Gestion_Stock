package com.chams.gestionstock.validator;


import com.chams.gestionstock.dto.FournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidator {

    public static List<String> validate(FournisseurDto dto) {

        List<String> errors = new ArrayList<>();


        if(dto==null){
            errors.add("veuillez donner le nom de client");
            errors.add("veuillez donner le prenom de client");
            errors.add("veuillez donner le mail de client");
            errors.add("veuillez donner le numTel de client");
            return errors;
        }
        if(!StringUtils.hasLength(dto.getNom())){
            errors.add("veuillez donner le nom de client");
        }
        if(!StringUtils.hasLength(dto.getPrenom())){
            errors.add("veuillez donner le prenom de client");
        }
        if(!StringUtils.hasLength(dto.getMail())){
            errors.add("veuillez donner le mail de client");
        }
        if(!StringUtils.hasLength(dto.getNumTel())){
            errors.add("veuillez donner le numTel de client");
        }

        return errors;
    }

    }
