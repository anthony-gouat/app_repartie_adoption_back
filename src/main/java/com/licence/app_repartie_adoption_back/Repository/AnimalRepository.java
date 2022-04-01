package com.licence.app_repartie_adoption_back.Repository;

import com.licence.app_repartie_adoption_back.Model.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
