package com.licence.app_repartie_adoption_back.Model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Table(name = "animal")
public class Animal {
    @Id
    private int idAnimal;

    private String nomAnimal;

    private int age;

    private int idRace;

    private int idType;

    private boolean adopter;
}
