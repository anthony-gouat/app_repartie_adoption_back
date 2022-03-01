package com.licence.app_repartie_adoption_back.Model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;

@Data
@Entity
@Table(name = "commenter")
public class Commenter {

    @Id
    private int idCommentaire;
    @Id
    private int idUtil;
}
