package com.licence.app_repartie_adoption_back.Repository;

import com.licence.app_repartie_adoption_back.Model.Type;
import com.licence.app_repartie_adoption_back.Model.Utilisateur;
import org.springframework.data.repository.CrudRepository;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {
}