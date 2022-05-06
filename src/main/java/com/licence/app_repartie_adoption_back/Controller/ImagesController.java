package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.ImagesId;
import com.licence.app_repartie_adoption_back.Model.Images;
import com.licence.app_repartie_adoption_back.Model.Tags;
import com.licence.app_repartie_adoption_back.Repository.ImageRepository;
import com.licence.app_repartie_adoption_back.Repository.ImagesRepository;
import com.licence.app_repartie_adoption_back.Repository.TagsRepository;
import com.licence.app_repartie_adoption_back.TagsId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/images")
public class ImagesController {

    @Autowired
    ImagesRepository imr;

    @Autowired
    ImageRepository ir;

    @GetMapping
    public List<Images> getAllImages(){
        return (List<Images>) imr.findAll();
    }

    /**
     * Ajoute un lien entre animal et image à la base
     * @param images
     * @return
     */
    @PostMapping
    public Images addImages(@Validated @RequestBody Images images) {
        return imr.save(images);
    }

    @DeleteMapping("/{idImage}/{idAnimal}")
    public void deleteImages(@PathVariable(value = "idImage") long idImage, @PathVariable(value = "idAnimal") long idAnimal) {
        ImagesId id = new ImagesId(idImage, idAnimal);
        ir.deleteById(idImage);
        imr.deleteById(id);
    }

    @DeleteMapping("/animal/{idAnimal}")
    public void deleteImagesByAnimal(@PathVariable(value = "idAnimal") long idAnimal) {

        List<Images> listeImages = (List<Images>) imr.findAll();
        for (Images image : listeImages) {
            if(image.getIdAnimal()==idAnimal){
                ImagesId id = new ImagesId(image.getIdImage(), idAnimal);
                imr.deleteById(id);
                ir.deleteById(image.getIdImage());
            }
        }
    }
}
