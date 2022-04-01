package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.Model.Animal;
import com.licence.app_repartie_adoption_back.Model.Couleur;
import com.licence.app_repartie_adoption_back.Repository.AnimalRepository;
import com.licence.app_repartie_adoption_back.Repository.CouleurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/animaux")
public class AnimalController {
    @Autowired
    private AnimalRepository ar;

    /**
     * Apelle de la liste des animaux stockées en base de données
     * @return la liste des tout les animaux
     */
    @GetMapping("/")
    public List<Animal> getAllAnimaux() {
        return (List<Animal>) ar.findAll();
    }

    /**
     * Apelle les infos pour un animal spécifique avec son id passé en paramètre
     * @param id
     * @return un animal
     */
    @GetMapping("/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable(value = "id") long id) {
        Optional<Animal> animal = ar.findById(id);
        if(animal.isPresent()) {
            return ResponseEntity.ok().body(animal.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * Recherche les animaux par type
     * @param idType
     * @return une liste d'animaux
     */
    @GetMapping("/type/{idType}")
    public List<Animal> getAnimauxByType(@PathVariable(value = "idType") long idType) {
        List<Animal> lesAnimaux = null;
        for (Animal unA:getAllAnimaux()) {
            if(unA.getIdType() == idType) {
                lesAnimaux.add(unA);
            }
        }
        return lesAnimaux;
    }

    /**
     * Recherche les animaux par race
     * @param idRace
     * @return une liste d'animaux
     */
    @GetMapping("/race/{idRace}")
    public List<Animal> getAnimauxByRace(@PathVariable(value = "idRace") long idRace) {
        List<Animal> lesAnimaux = null;
        for (Animal unA:getAllAnimaux()) {
            if(unA.getIdRace() == idRace) {
                lesAnimaux.add(unA);
            }
        }
        return lesAnimaux;
    }

    /**
     * Recherche les animaux par age
     * @param age
     * @return une liste d'animaux
     */
    @GetMapping("/age/{age}")
    public List<Animal> getAnimauxByAge(@PathVariable(value = "age") long age) {
        List<Animal> lesAnimaux = null;
        for (Animal unA:getAllAnimaux()) {
            if(unA.getAge() == age) {
                lesAnimaux.add(unA);
            }
        }
        return lesAnimaux;
    }

    /**
     * Ajoute un animal à la base
     * @param animal
     * @return
     */
    @PostMapping
    public Animal addAnimal(@Validated @RequestBody Animal animal) {
        return ar.save(animal);
    }

    /**
     * Modifie un animal
     * @param animal
     * @param id
     * @param response
     * @return
     * @throws IOException
     */
    @PutMapping("/update/{id}")
    public Animal updateAnimal(@Validated @RequestBody Animal animal, @PathVariable(value = "id") Long id, HttpServletResponse response) throws IOException {

        Optional<Animal> animalById = ar.findById(id);
        Animal animal1 = null;
        if (animalById.isPresent()) {
            animal1 = animalById.get();
            if (animal.getNomAnimal() != null) {
                animal1.setNomAnimal(animal.getNomAnimal());
            }
            if (animal.getAge() != 0) {
                animal1.setAge(animal.getAge());
            }
            if (animal.getIdRace() != 0) {
                animal1.setIdRace(animal.getIdRace());
            }
            if (animal.getIdType() != 0) {
                animal1.setIdType(animal.getIdType());
            }
            animal1.setAdopter(animal.isAdopter());
            return ar.save(animal1);
        }
        response.setStatus(404);
        response.getWriter().write("Animal inconnue");
        response.getWriter().close();
        return null;
    }
}
