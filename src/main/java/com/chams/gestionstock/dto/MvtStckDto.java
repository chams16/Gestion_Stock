package com.chams.gestionstock.dto;

import com.chams.gestionstock.model.Article;
import com.chams.gestionstock.model.MvtStk;
import com.chams.gestionstock.model.TypeMvt;
import lombok.Builder;
import lombok.Data;


import java.math.BigDecimal;
import java.time.Instant;

@Builder
@Data
public class MvtStckDto {

    private Integer id;

    private ArticleDto article;

    private Instant dateMvt;

    private BigDecimal quantite;

    private TypeMvt typeMvt;

    public MvtStckDto fromEntity(MvtStk mvtStk){
        return MvtStckDto.builder()
                .id(mvtStk.getId())
                .article(article.fromEntity(mvtStk.getArticle()))
                .dateMvt(mvtStk.getDateMvt())
                .quantite(mvtStk.getQuantite())
                .typeMvt(mvtStk.getTypeMvt())
                .build();
    }

    public MvtStk toEntity(MvtStckDto mvtStckDto){
        MvtStk mvtStk = new MvtStk();

        mvtStk.setId(mvtStckDto.getId());
        mvtStk.setArticle(article.toEntity(mvtStckDto.getArticle()));
        mvtStk.setDateMvt(mvtStckDto.getDateMvt());
        mvtStk.setQuantite(mvtStckDto.getQuantite());
        mvtStk.setTypeMvt(mvtStckDto.getTypeMvt());
        return mvtStk;
    }
}
