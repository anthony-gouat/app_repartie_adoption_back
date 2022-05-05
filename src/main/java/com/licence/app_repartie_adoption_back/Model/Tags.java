package com.licence.app_repartie_adoption_back.Model;

import com.licence.app_repartie_adoption_back.TagsId;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Data
@Entity
@Table(name = "tags")
@IdClass(TagsId.class)
public class Tags {
    @Id
    @Column(name = "id_tag", nullable = false)
    private long idTag;

    @Id
    @Column(name = "id_animal", nullable = false)
    private long idAnimal;

    public long getIdTag() {
        return idTag;
    }

    public void setIdTag(long idTag) {
        this.idTag = idTag;
    }

    public long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(long idAnimal) {
        this.idAnimal = idAnimal;
    }


}
