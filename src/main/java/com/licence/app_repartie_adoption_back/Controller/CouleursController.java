package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.CommenterId;
import com.licence.app_repartie_adoption_back.CouleursId;
import com.licence.app_repartie_adoption_back.Model.Couleurs;
import com.licence.app_repartie_adoption_back.Repository.CouleursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/couleurs")
public class CouleursController {

    @Autowired
    private CouleursRepository cr;

    /**
     * Récupère une couleur lié à un animal
     * @param idAnimal
     * @param idCouleur
     * @return
     */
    @GetMapping("/{idAnimal}/{idCouleur}")
    public ResponseEntity<Couleurs> findCouleursById(@PathVariable(value = "idAnimal") long idAnimal, @PathVariable(value = "idCouleur") long idCouleur) {
        CouleursId id = new CouleursId(idCouleur, idAnimal);
        Optional<Couleurs> couleurs = cr.findById(id);

        if(couleurs.isPresent()) {
            return ResponseEntity.ok().body(couleurs.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * Ajoute une couleur lié à un animal
     * @param couleurs
     * @return
     */
    @PostMapping
    public Couleurs addCouleurs(@Validated @RequestBody Couleurs couleurs) {
        return cr.save(couleurs);
    }

    /**
     * Supprime une couleur lié à un animal
     * @param idAnimal
     * @param idCouleur
     */

    @DeleteMapping("/{idAnimal}/{idCouleur}")
    public void deleteCouleurs(@PathVariable(value = "idAnimal") long idAnimal, @PathVariable(value = "idCouleur") long idCouleur) {
        CouleursId id = new CouleursId(idCouleur, idAnimal);
        cr.deleteById(id);
    }
}

