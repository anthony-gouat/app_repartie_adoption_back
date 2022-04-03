package com.licence.app_repartie_adoption_back.Model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@Table(name = "commentaire")
public class Commentaire {

    @Id
    private long idCommentaire;

    private long idUtil;

    private String contenuComm;

    private Date date;



    private Long idReponse;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getIdReponse() {
        return idReponse;
    }

    public long getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(int idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public long getIdUtil() {
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

    public void setIdReponse(Long idReponse) {
        this.idReponse = idReponse;
    }
}