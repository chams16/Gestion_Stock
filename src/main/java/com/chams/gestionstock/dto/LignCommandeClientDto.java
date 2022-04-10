package com.chams.gestionstock.dto;

import com.chams.gestionstock.model.Article;
import com.chams.gestionstock.model.CommandeClient;
import com.chams.gestionstock.model.LigneCommandeclient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Builder
@Data
public class LignCommandeClientDto {

    private Integer id;

    private ArticleDto article;

    private CommandClientDto commandeClient;

    private BigDecimal quantite;

    private BigDecimal prixunitaire;

    public LignCommandeClientDto fromEntity(LigneCommandeclient ligneCommandeclient){
        if(ligneCommandeclient==null){
            return null;
        }
        return LignCommandeClientDto.builder()
                .id(ligneCommandeclient.getId())
                .article(article.fromEntity(ligneCommandeclient.getArticle()))
                .commandeClient(commandeClient.fromEntity(ligneCommandeclient.getCommandeClient()))
                .quantite(ligneCommandeclient.getQuantite())
                .prixunitaire(ligneCommandeclient.getPrixunitaire())
                .build();
    }

    public LigneCommandeclient toEntity(LignCommandeClientDto lignCommandeClientDto){
        if(lignCommandeClientDto==null){
            return null;
        }

        LigneCommandeclient ligneCommandeclient = new LigneCommandeclient();
        ligneCommandeclient.setId(lignCommandeClientDto.getId());
        ligneCommandeclient.setArticle(ligneCommandeclient.getArticle());
        ligneCommandeclient.setCommandeClient(ligneCommandeclient.getCommandeClient());
        ligneCommandeclient.setQuantite(lignCommandeClientDto.getQuantite());
        return ligneCommandeclient;
    }
}
