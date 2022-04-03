package com.licence.app_repartie_adoption_back.Model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Table(name = "couleur")
public class Couleur {
    @Id
    private long idCouleur;

    private String libelleCouleur;

    public long getIdCouleur() {
        return idCouleur;
    }

    public void setIdCouleur(int idCouleur) {
        this.idCouleur = idCouleur;
    }

    public String getLibelleCouleur() {
        return libelleCouleur;
    }

    public void setLibelleCouleur(String libelleCouleur) {
        this.libelleCouleur = libelleCouleur;
    }
}
