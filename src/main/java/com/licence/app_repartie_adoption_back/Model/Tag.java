package com.licence.app_repartie_adoption_back.Model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;

@Data
@Entity
@Table(name = "tag")
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tag", nullable = false)
    private long idTag;

    @Column(name = "lib_tag", nullable = false, length = 50)
    private String libTag;

    public long getIdTag() {
        return idTag;
    }

    public void setIdTag(long idTag) {
        this.idTag = idTag;
    }

    public String getLibTag() {
        return libTag;
    }

    public void setLibTag(String libTag) {
        this.libTag = libTag;
    }


}
