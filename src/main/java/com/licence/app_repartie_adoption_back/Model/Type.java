package com.licence.app_repartie_adoption_back.Model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;

@Data
@Entity
@Table(name = "type")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type", nullable = false)
    private int idType;
    @Column(name = "libelle_type", nullable = false, length = 50)
    private String libelleType;

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getLibelleType() {
        return libelleType;
    }

    public void setLibelleType(String libelleType) {
        this.libelleType = libelleType;
    }
}
