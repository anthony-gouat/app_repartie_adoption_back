package com.licence.app_repartie_adoption_back.Model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;

@Data
@Entity
@Table(name = "couleur")
public class Couleur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_couleur", nullable = false)
    private long idCouleur;

    @Column(name = "libelle_couleur", nullable = false, length = 10)
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
