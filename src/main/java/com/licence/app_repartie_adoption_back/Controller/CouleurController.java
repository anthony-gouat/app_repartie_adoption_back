package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.Model.*;
import com.licence.app_repartie_adoption_back.Repository.CouleurRepository;
import com.licence.app_repartie_adoption_back.Repository.CouleursRepository;
import com.licence.app_repartie_adoption_back.Repository.ImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/couleur")
public class CouleurController {

    @Autowired
    private CouleurRepository cr;

    @Autowired
    CouleursRepository clr;

    /**
     * Récupération de la liste des couleurs
     * @return une liste de couleur
     */
    @GetMapping
    public List<Couleur> getAllCouleur() {
        return (List<Couleur>) cr.findAll();
    }

    /**
     * Récupération du libellé d'une couleur grâce à son id
     * @param id
     * @return une couleur
     */
    @GetMapping("/{id}")
    public ResponseEntity<Couleur> getCouleurById(@PathVariable(value = "id")Long id) {
        Optional<Couleur> couleur = cr.findById(id);
        if(couleur.isPresent()) {
            return ResponseEntity.ok().body(couleur.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/animal/{idAnimal}")
    public List<Couleur> getCouleursByIdAnimal(@PathVariable(value = "idAnimal") long idAnimal) {
        List<Couleurs> lien = (List<Couleurs>) clr.findAll();
        List<Long> ids = new ArrayList<Long>();
        for (Couleurs couleurs : lien)
            if(couleurs.getIdAnimal()==idAnimal) ids.add(couleurs.getIdCouleur());
        return (List<Couleur>) cr.findAllById(ids);
    }
}
