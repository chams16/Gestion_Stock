package com.chams.gestionstock.dto;

import com.chams.gestionstock.model.LigneVente;
import com.chams.gestionstock.model.Ventes;
import lombok.Builder;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Builder
@Data
public class LignVenteDto {

    private Integer id;

    private VentesDto ventes;

    private BigDecimal quantite;

    private BigDecimal prixunitaire;

    public LignVenteDto fromEntity(LigneVente ligneVente){
        return LignVenteDto.builder()
                .id(ligneVente.getId())
                .prixunitaire(ligneVente.getPrixunitaire())
                .ventes(ventes.fromEntity(ligneVente.getVentes()))
                .quantite(ligneVente.getQuantite())
                .build();
    }

    public LigneVente toEntity(LignVenteDto lignVenteDto){
        LigneVente ligneVente = new LigneVente();

        ligneVente.setId(lignVenteDto.getId());
        ligneVente.setVentes(ligneVente.getVentes());
        ligneVente.setPrixunitaire(lignVenteDto.getPrixunitaire());
        ligneVente.setQuantite(lignVenteDto.getQuantite());
        return ligneVente;
    }
}
