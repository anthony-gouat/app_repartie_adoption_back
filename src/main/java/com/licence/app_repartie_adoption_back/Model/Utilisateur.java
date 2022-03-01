package com.licence.app_repartie_adoption_back.Model;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Table(name="utilisateur")
public class Utilisateur {
    @Id
    private int idUtil;
    private String nomUtil;
    private String prenomUtil;
    private String mail;
    private String mdp;
    private String role;
    private String token;
    private String oputh;
}
