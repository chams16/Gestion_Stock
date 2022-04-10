package com.chams.gestionstock.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Entreprise extends AbstractEntity {

    @Column(name = "nom")
    private String nom;

    private String description;

    @Embedded
    private Adress adresse;

    private String codeFiscale;

    private String photo;

    private String email;

    private String numTel;

    private String siteWeb;

    @OneToMany(mappedBy = "entreprise")
    private List<Utilisateur> utilisateurs;
}
