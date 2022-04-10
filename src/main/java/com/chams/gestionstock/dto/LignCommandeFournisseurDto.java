package com.chams.gestionstock.dto;

import com.chams.gestionstock.model.Article;
import com.chams.gestionstock.model.CommandeFournisseur;
import com.chams.gestionstock.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Builder
@Data
public class LignCommandeFournisseurDto {

    private Integer id;

    private ArticleDto article;

    private CommandFournisseurDto commandeFournisseur;

    private BigDecimal quantite;

    private BigDecimal prixunitaire;

    public LignCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur){
        return LignCommandeFournisseurDto.builder()
                .id(ligneCommandeFournisseur.getId())
                .article(article.fromEntity(ligneCommandeFournisseur.getArticle()))
                .commandeFournisseur(commandeFournisseur.fromEntity(ligneCommandeFournisseur.getCommandeFournisseur()))
                .quantite(ligneCommandeFournisseur.getQuantite())
                .prixunitaire(ligneCommandeFournisseur.getPrixunitaire())
                .build();
    }

    public LigneCommandeFournisseur toEntity(LignCommandeFournisseurDto lignCommandeFournisseurDto){

        LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur();
        ligneCommandeFournisseur.setId(lignCommandeFournisseurDto.getId());
        ligneCommandeFournisseur.setArticle(ligneCommandeFournisseur.getArticle());
        ligneCommandeFournisseur.setCommandeFournisseur(ligneCommandeFournisseur.getCommandeFournisseur());
        ligneCommandeFournisseur.setQuantite(lignCommandeFournisseurDto.getQuantite());
        ligneCommandeFournisseur.setPrixunitaire(lignCommandeFournisseurDto.getPrixunitaire());
        return ligneCommandeFournisseur;
    }
}
