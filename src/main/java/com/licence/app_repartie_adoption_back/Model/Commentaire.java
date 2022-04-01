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

    public int getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(int idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public int getIdUtil() {
        return idUtil;
    }

    public void setIdUtil(int idUtil) {
        this.idUtil = idUtil;
    }

    public String getContenuComm() {
        return contenuComm;
    }

    public void setContenuComm(String contenuComm) {
        this.contenuComm = contenuComm;
    }
}