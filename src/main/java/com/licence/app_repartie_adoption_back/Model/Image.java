package com.licence.app_repartie_adoption_back.Model;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;

@Data
@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_img;

    @Lob
    private String lien;

    public long getId_img() {
        return id_img;
    }

    public void setId_img(long id_img) {
        this.id_img = id_img;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

}
