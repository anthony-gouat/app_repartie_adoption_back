package com.licence.app_repartie_adoption_back;

import java.io.Serializable;

public class TagsId implements Serializable {
    private Long idTag;
    private Long idAnimal;

    public TagsId(Long idTag, Long idAnimal) {
        this.idTag = idTag;
        this.idAnimal = idAnimal;
    }

    public TagsId() {

    }
}
