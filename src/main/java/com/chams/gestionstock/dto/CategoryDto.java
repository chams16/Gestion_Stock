package com.chams.gestionstock.dto;

import com.chams.gestionstock.model.Article;
import com.chams.gestionstock.model.Category;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.util.List;

@Builder
@Data
public class CategoryDto {

    private ArticleDto articleDto;

    private Integer id;

    private String code;

    private String designation;

    private List<ArticleDto> articles;

    public static CategoryDto fromEntity(Category category){
        if(category==null){
            return null;
        }

        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();
    }

    public static Category toEntity(CategoryDto category) {
        if(category==null){
            return null;
        }
        Category category1 =new Category();
        category1.setId(category.getId());
        category1.setCode(category.getCode());
        category1.setDesignation(category.getDesignation());
        return category1;
    }
}
