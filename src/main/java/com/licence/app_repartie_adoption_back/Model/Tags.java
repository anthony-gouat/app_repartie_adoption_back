package com.licence.app_repartie_adoption_back.Model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
@Table(name = "tags")
public class Tags {
    @Id
    private int idTag;
    private int idAnimal;
}
