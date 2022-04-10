package com.chams.gestionstock.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
public class Ventes extends AbstractEntity{

    private String code;

    private Instant datevente;

    private String commentaire;

    @Column(name = "identreprise")
    private Integer idEntreprise;
}
