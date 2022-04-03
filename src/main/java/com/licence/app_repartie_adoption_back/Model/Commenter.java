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
    @Column(name = "id_comm", nullable = false)
    private Long id_commentaire;

    @Id
    @Column(name = "id_recette", nullable = false)
    private Long id_recette;

    public Long getId_commentaire() {
        return id_commentaire;
    }

    public void setId_commentaire(Long id_commentaire) {
        this.id_commentaire = id_commentaire;
    }

    public Long getId_recette() {
        return id_recette;
    }

    public void setId_recette(Long id_recette) {
        this.id_recette = id_recette;
    }


}
