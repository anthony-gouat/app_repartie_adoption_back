package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.CouleursId;
import com.licence.app_repartie_adoption_back.ImagesId;
import com.licence.app_repartie_adoption_back.Model.Images;
import com.licence.app_repartie_adoption_back.Model.Tag;
import com.licence.app_repartie_adoption_back.Model.Tags;
import com.licence.app_repartie_adoption_back.Repository.TagRepository;
import com.licence.app_repartie_adoption_back.Repository.TagsRepository;
import com.licence.app_repartie_adoption_back.TagsId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tags")
public class TagsController {
    @Autowired
    TagsRepository tgr;

    @Autowired
    TagRepository tr;

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

    @DeleteMapping("/{idTag}/{idAnimal}")
    public void deleteTags(@PathVariable(value = "idTag") long idTag, @PathVariable(value = "idAnimal") long idAnimal) {
        tgr.deleteById(new TagsId(idTag, idAnimal));
    }

    @DeleteMapping("/animal/{idAnimal}")
    public void deleteTagsByAnimal(@PathVariable(value = "idAnimal") long idAnimal) {

        List<Tags> listeTags = (List<Tags>) tgr.findAll();
        for (Tags tag : listeTags) {
            if(tag.getIdAnimal()==idAnimal){
                TagsId id = new TagsId(tag.getIdTag(), idAnimal);
                tgr.deleteById(id);
            }
        }
    }

}
