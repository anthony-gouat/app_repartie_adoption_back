package com.licence.app_repartie_adoption_back.Repository;

import com.licence.app_repartie_adoption_back.CommenterId;
import com.licence.app_repartie_adoption_back.Model.Commenter;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CommenterRepository extends CrudRepository<Commenter, CommenterId> {
}
