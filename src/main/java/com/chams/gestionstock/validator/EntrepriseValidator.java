package com.chams.gestionstock.validator;

import com.chams.gestionstock.dto.EntrepriseDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class EntrepriseValidator {

    public static List<String> validate(EntrepriseDto dto){

        List<String> errors = new ArrayList<>();



        if(dto==null){
            errors.add("veuillez donner le nom de client");
            errors.add("veuillez donner le code de client");
            errors.add("veuillez donner le mail de client");
            errors.add("veuillez donner le numTel de client");
            return errors;
        }
        if(!StringUtils.hasLength(dto.getNom())){
            errors.add("veuillez donner le nom de client");
        }
        if(!StringUtils.hasLength(dto.getCodeFiscale())){
            errors.add("veuillez donner le code Fiscal de client");
        }
        if(!StringUtils.hasLength(dto.getEmail())){
            errors.add("veuillez donner le mail de client");
        }
        if(!StringUtils.hasLength(dto.getNumTel())){
            errors.add("veuillez donner le numTel de client");
        }

        return errors;

    }
}
