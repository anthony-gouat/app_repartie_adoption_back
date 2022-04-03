package com.licence.app_repartie_adoption_back.Repository;

import com.licence.app_repartie_adoption_back.CouleursId;
import com.licence.app_repartie_adoption_back.Model.Couleurs;
import org.springframework.data.repository.CrudRepository;

public interface CouleursRepository extends CrudRepository<Couleurs, CouleursId> {
}
