package com.licence.app_repartie_adoption_back.Model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@Table(name = "tag")
public class Tag {

    @Id
    private int idTag;
    private String libTag;

    public int getIdTag() {
        return idTag;
    }

    public void setIdTag(int idTag) {
        this.idTag = idTag;
    }

    public String getLibTag() {
        return libTag;
    }

    public void setLibTag(String libTag) {
        this.libTag = libTag;
    }


}
