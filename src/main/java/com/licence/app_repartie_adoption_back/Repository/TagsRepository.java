package com.licence.app_repartie_adoption_back.Repository;

import com.licence.app_repartie_adoption_back.Model.Tags;
import com.licence.app_repartie_adoption_back.TagsId;
import org.springframework.data.repository.CrudRepository;

public interface TagsRepository extends CrudRepository<Tags, TagsId> {
}
