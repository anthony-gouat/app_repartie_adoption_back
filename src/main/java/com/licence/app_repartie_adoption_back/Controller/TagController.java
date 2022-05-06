package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.Model.*;
import com.licence.app_repartie_adoption_back.Repository.ImageRepository;
import com.licence.app_repartie_adoption_back.Repository.ImagesRepository;
import com.licence.app_repartie_adoption_back.Repository.TagRepository;
import com.licence.app_repartie_adoption_back.Repository.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tag")
public class TagController {
    @Autowired
    TagRepository tr;

    @Autowired
    TagsRepository tgr;

    /**
     * Apelle de la liste des tags stockées en base de données
     * @return la liste des toutes les tags
     */
    @GetMapping
    public List<Tag> getAlltags() {
        return (List<Tag>) tr.findAll();
    }

    @GetMapping("/{idTag}")
    public ResponseEntity<Tag> getTagById(@PathVariable(value = "idTag") long idTag) {
        Optional<Tag> tag = tr.findById(idTag);
        if(tag.isPresent()) {
            return ResponseEntity.ok().body(tag.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/animal/{idAnimal}")
    public List<Tag> getTagsByIdAnimal(@PathVariable(value = "idAnimal") long idAnimal) {
        List<Tags> lien = (List<Tags>) tgr.findAll();
        List<Long> ids = new ArrayList<Long>();
        for (Tags tags : lien)
            if(tags.getIdAnimal()==idAnimal) ids.add(tags.getIdTag());
        return (List<Tag>) tr.findAllById(ids);
    }

    /**
     * Ajoute un tag à la base
     * @param tag
     * @return tag
     */
    @PostMapping
    public Tag addTag(@Validated @RequestBody Tag tag) {
        return tr.save(tag);
    }

}