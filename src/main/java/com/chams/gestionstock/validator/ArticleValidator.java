package com.chams.gestionstock.validator;


import com.chams.gestionstock.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidator {

    public static List<String> validate(ArticleDto articleDto) {

        List<String> errors = new ArrayList<>();

        if(articleDto==null){
            errors.add("veuillez renseigner lecode de l'article");
            errors.add("veuillez renseigner la designation de l'article");
            errors.add("veuillez renseigner le prix unitaire HT de l'article");
            errors.add("veuillez renseigner le taux TVA de l'article");
            errors.add("veuillez renseigner le Prix TTC de l'article");
            errors.add("veuillez renseigner la category de l'article");
            return errors;
        }
        if(!StringUtils.hasLength(articleDto.getCodeArticle())){
            errors.add("veuillez renseigner lecode de l'article");
        }
        if(!StringUtils.hasLength(articleDto.getDesignation())){
            errors.add("veuillez renseigner la designation de l'article");
        }
        if(articleDto.getPrixUnitaireHt()==null){
            errors.add("veuillez renseigner le prix unitaire HT de l'article");
        }
        if(articleDto.getTauxTva()==null){
            errors.add("veuillez renseigner le taux TVA de l'article");
        }
        if(articleDto.getPrixUnitaireTtc()==null){
            errors.add("veuillez renseigner le Prix TTC de l'article");
        }
        if(articleDto.getCategory()==null){
            errors.add("veuillez renseigner la category de l'article");
        }



        return errors;
    }
}
