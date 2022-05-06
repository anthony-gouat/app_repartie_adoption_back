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

    public Long getIdImage() {
        return idImage;
    }

    public void setIdImage(Long idImage) {
        this.idImage = idImage;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }
}
