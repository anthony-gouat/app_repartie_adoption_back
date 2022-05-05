package com.licence.app_repartie_adoption_back.Model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "commentaire")
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_commentaire", nullable = false)
    private long idCommentaire;

    @Column(name = "id_util", nullable = false)
    private long idUtil;

    @Lob
    @Column(name = "contenu_comm", nullable = false)
    private String contenuComm;

    @Column(name = "date")
    private Date date;

    @Column(name = "id_reponse")
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