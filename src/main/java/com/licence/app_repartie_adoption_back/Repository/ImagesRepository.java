package com.licence.app_repartie_adoption_back.Repository;

import com.licence.app_repartie_adoption_back.ImagesId;
import com.licence.app_repartie_adoption_back.Model.Images;
import org.springframework.data.repository.CrudRepository;

public interface ImagesRepository extends CrudRepository<Images, ImagesId> {
}