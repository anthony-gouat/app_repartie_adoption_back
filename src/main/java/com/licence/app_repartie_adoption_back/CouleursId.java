package com.licence.app_repartie_adoption_back;

import java.io.Serializable;

public class CouleursId implements Serializable {
    private Long idCouleur;
    private Long idAnimal;

    public CouleursId(Long idCouleur, Long idAnimal) {
        this.idCouleur = idCouleur;
        this.idAnimal = idAnimal;
    }
}
