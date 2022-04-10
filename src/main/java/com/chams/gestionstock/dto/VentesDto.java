package com.chams.gestionstock.dto;

import com.chams.gestionstock.model.Ventes;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Builder
@Data
public class VentesDto {

    private Integer id;

    private String code;

    private Instant datevente;

    private String commentaire;

    public VentesDto fromEntity(Ventes ventes){
        return VentesDto.builder()
                .id(ventes.getId())
                .code(ventes.getCode())
                .datevente(ventes.getDatevente())
                .commentaire(ventes.getCommentaire())
                .build();
    }

    public Ventes toEntity(VentesDto ventesDto){
        Ventes ventes = new Ventes();
        ventes.setId(ventesDto.getId());
        ventes.setCode(ventesDto.getCode());
        ventes.setCommentaire(ventesDto.getCommentaire());
        ventes.setDatevente(ventesDto.getDatevente());

        return ventes;
    }
}
