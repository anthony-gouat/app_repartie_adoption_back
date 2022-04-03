package com.licence.app_repartie_adoption_back;

import javax.persistence.Embeddable;
import java.io.Serializable;


public class CommenterId implements Serializable {
    private Long idCommentaire;
    private Long idAnimal;

    public CommenterId(Long idCommentaire, Long idAnimal) {
        this.idCommentaire = idCommentaire;
        this.idAnimal = idAnimal;
    }

    public CommenterId() {

    }
}
