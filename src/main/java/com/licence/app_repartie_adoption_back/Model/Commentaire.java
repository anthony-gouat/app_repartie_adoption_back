package com.licence.app_repartie_adoption_back.Model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Table(name = "commentaire")
public class Commentaire {
    @Id
    private int idCommentaire;

    private int idUtil;

    private String contenuComm;
}
