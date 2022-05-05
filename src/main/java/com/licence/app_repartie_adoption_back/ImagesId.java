package com.licence.app_repartie_adoption_back;

import java.io.Serializable;

public class ImagesId implements Serializable {
    private Long idImage;
    private Long idAnimal;

    public ImagesId(Long idImage, Long idAnimal) {
        this.idImage = idImage;
        this.idAnimal = idAnimal;
    }

    public ImagesId() {

    }
}
