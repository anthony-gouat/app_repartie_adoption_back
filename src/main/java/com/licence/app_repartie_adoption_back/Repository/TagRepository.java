package com.licence.app_repartie_adoption_back.Repository;

import com.licence.app_repartie_adoption_back.Model.Image;
import com.licence.app_repartie_adoption_back.Model.Tag;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Tag, Long> {
}
