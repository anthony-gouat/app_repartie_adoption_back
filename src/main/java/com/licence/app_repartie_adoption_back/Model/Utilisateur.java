package com.licence.app_repartie_adoption_back.Model;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;

@Data
@Entity
@Table(name="utilisateur")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_util", nullable = false)
    private int idUtil;
    @Column(name = "nom_util", nullable = false, length = 20)
    private String nomUtil;
    @Column(name = "prenom_util", nullable = false, length = 20)
    private String prenomUtil;
    @Column(name = "mail", nullable = false, length = 50)
    private String mail;
    @Column(name = "mdp", nullable = false, length = 20)
    private String mdp;
    @Column(name = "role", nullable = false, length = 30)
    private String role;
    @Column(length = 10)
    private String oputh;

    public int getIdUtil() {
        return idUtil;
    }

    public void setIdUtil(int idUtil) {
        this.idUtil = idUtil;
    }

    public String getNomUtil() {
        return nomUtil;
    }

    public void setNomUtil(String nomUtil) {
        this.nomUtil = nomUtil;
    }

    public String getPrenomUtil() {
        return prenomUtil;
    }

    public void setPrenomUtil(String prenomUtil) {
        this.prenomUtil = prenomUtil;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getOputh() {
        return oputh;
    }

    public void setOputh(String oputh) {
        this.oputh = oputh;
    }
}
