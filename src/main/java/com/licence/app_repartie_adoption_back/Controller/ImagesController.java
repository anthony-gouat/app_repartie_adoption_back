package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.Model.Images;
import com.licence.app_repartie_adoption_back.Model.Tags;
import com.licence.app_repartie_adoption_back.Repository.ImagesRepository;
import com.licence.app_repartie_adoption_back.Repository.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/images")
public class ImagesController {

    @Autowired
    ImagesRepository imr;

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

}
