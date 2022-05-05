package com.licence.app_repartie_adoption_back.Model;

import com.licence.app_repartie_adoption_back.CouleursId;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@Table(name = "couleurs")
@IdClass(CouleursId.class)
public class Couleurs {

    @Id
    @Column(name = "id_animal", nullable = false)
    private Long idAnimal;

    @Id
    @Column(name = "id_couleur", nullable = false)
    private Long idCouleur;

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public Long getIdCouleur() {
        return idCouleur;
    }

    public void setIdCouleur(Long idCouleur) {
        this.idCouleur = idCouleur;
    }


}
