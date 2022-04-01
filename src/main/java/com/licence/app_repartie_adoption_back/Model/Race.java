package com.licence.app_repartie_adoption_back.Model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Table(name = "race")
public class Race {

    @Id
    private int idRace;
    private String libelleRace;

    public int getIdRace() {
        return idRace;
    }

    public void setIdRace(int idRace) {
        this.idRace = idRace;
    }

    public String getLibelleRace() {
        return libelleRace;
    }

    public void setLibelleRace(String libelleRace) {
        this.libelleRace = libelleRace;
    }


}
