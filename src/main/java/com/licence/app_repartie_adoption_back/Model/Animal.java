package com.licence.app_repartie_adoption_back.Model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;

@Entity
@javax.persistence.Table(name = "animal")
@Table
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_animal", nullable = false)
    private long idAnimal;

    @Column(name = "nom_animal", nullable = false, length = 35)
    private String nomAnimal;

    @Column(name = "age", nullable = false)
    private long age;

    @Column(name = "id_race", nullable = false)
    private long idRace;

    @Column(name = "id_type", nullable = false)
    private long idType;

    @Column(name = "adopter", nullable = false)
    private boolean adopter;

    public long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    public long getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getIdRace() {
        return idRace;
    }

    public void setIdRace(int idRace) {
        this.idRace = idRace;
    }

    public long getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public boolean getAdopter() {
        return adopter;
    }

    public void setAdopter(boolean adopter) {
        this.adopter = adopter;
    }
}
