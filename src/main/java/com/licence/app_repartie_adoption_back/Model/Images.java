package com.licence.app_repartie_adoption_back.Model;

import com.licence.app_repartie_adoption_back.CouleursId;
import com.licence.app_repartie_adoption_back.ImagesId;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@Table(name = "images")
@IdClass(ImagesId.class)
public class Images {
    @Id
    @Column(name = "id_img", nullable = false)
    private Long idImage;

    @Id
    @Column(name = "id_animal", nullable = false)
    private Long idAnimal;

    public Long getId_img() {
        return idImage;
    }

    public void setId_img(Long id_img) {
        this.idImage = id_img;
    }

    public Long getId_animal() {
        return idAnimal;
    }

    public void setId_animal(Long id_animal) {
        this.idAnimal = id_animal;
    }
}
