package com.licence.app_repartie_adoption_back.Model;

import com.licence.app_repartie_adoption_back.CommenterId;
import com.licence.app_repartie_adoption_back.Repository.CommenterRepository;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;

@Data
@Entity
@Table(name = "commenter")
@IdClass(CommenterId.class)
public class Commenter {

    @Id
    //@Column(name = "id_commentaire", nullable = false)
    private Long idCommentaire;

    @Id
    //@Column(name = "id_animal", nullable = false)
    private Long idAnimal;


    public Long getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(Long idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }
}
