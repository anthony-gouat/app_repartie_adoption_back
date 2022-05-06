package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.Model.Image;
import com.licence.app_repartie_adoption_back.Model.Images;
import com.licence.app_repartie_adoption_back.Model.Tag;
import com.licence.app_repartie_adoption_back.Repository.ImageRepository;
import com.licence.app_repartie_adoption_back.Repository.ImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/image")
public class ImageController {
    @Autowired
    ImageRepository ir;

    @Autowired
    ImagesRepository imr;
    /**
     * Apelle de la liste des images stockées en base de données
     * @return la liste des toutes les images
     */
    @GetMapping
    public List<Image> getAllImages() {
        return (List<Image>) ir.findAll();
    }

    @GetMapping("/{idImage}")
    public ResponseEntity<Image> getImageById(@PathVariable(value = "idImage") long idImage) {
        Optional<Image> image = ir.findById(idImage);
        if(image.isPresent()) {
            return ResponseEntity.ok().body(image.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/animal/{idAnimal}")
    public List<Image> getImagesByIdAnimal(@PathVariable(value = "idAnimal") long idAnimal) {
        List<Images> lien = (List<Images>) imr.findAll();
        List<Long> ids = new ArrayList<Long>();
        for (Images images : lien)
            if(images.getIdAnimal()==idAnimal) ids.add(images.getIdImage());
        return (List<Image>) ir.findAllById(ids);
    }

    /**
     * Ajoute une image à la base
     * @param image
     * @return image
     */
    @PostMapping
    public Image addTag(@Validated @RequestBody Image image) {
        return ir.save(image);
    }

}
