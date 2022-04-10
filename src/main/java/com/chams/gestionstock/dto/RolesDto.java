package com.chams.gestionstock.dto;

import com.chams.gestionstock.model.Roles;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class RolesDto {

    private Integer id;

    private String rolenom;

    private UtilisateurDto utilisateur;

    public RolesDto fromEntity(Roles roles){
        return RolesDto.builder()
                .id(roles.getId())
                .rolenom(roles.getRolenom())
                .utilisateur(utilisateur.fromEntity(roles.getUtilisateur()))
                .build();
    }

    public Roles toEntity(RolesDto rolesDto){
        Roles roles = new Roles();
        roles.setId(rolesDto.getId());
        roles.setRolenom(rolesDto.getRolenom());
        roles.setUtilisateur(utilisateur.toEntity(rolesDto.getUtilisateur()));

        return roles;
    }
}
