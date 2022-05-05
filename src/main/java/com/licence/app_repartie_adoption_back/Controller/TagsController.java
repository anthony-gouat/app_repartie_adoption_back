package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.Model.Tag;
import com.licence.app_repartie_adoption_back.Model.Tags;
import com.licence.app_repartie_adoption_back.Repository.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tags")
public class TagsController {
    @Autowired
    TagsRepository tgr;

    @GetMapping
    public List<Tags> getAllTags(){
        return (List<Tags>) tgr.findAll();
    }

    /**
     * Ajoute un lien entre animal et tag à la base
     * @param tags
     * @return
     */
    @PostMapping
    public Tags addTag(@Validated @RequestBody Tags tags) {
        return tgr.save(tags);
    }
}
