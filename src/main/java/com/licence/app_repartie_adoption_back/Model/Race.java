package com.licence.app_repartie_adoption_back.Model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;

@Data
@Entity
@Table(name = "race")
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_race", nullable = false)
    private int idRace;
    @Column(name = "libelle_race", nullable = false, length = 50)
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
