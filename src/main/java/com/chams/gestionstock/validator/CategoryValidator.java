package com.chams.gestionstock.validator;

import com.chams.gestionstock.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {

    public static List<String> validate(CategoryDto categoryDto){
        List<String> errors = new ArrayList<>();


        if(categoryDto==null || !StringUtils.hasLength(categoryDto.getCode())){
            errors.add("veuillez renseigner le code de category");

        }

        return errors;
    }
}
