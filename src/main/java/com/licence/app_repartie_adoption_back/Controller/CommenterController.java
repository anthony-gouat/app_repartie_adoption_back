package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.CommenterId;
import com.licence.app_repartie_adoption_back.Model.Commenter;
import com.licence.app_repartie_adoption_back.Repository.CommenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/commenter")
public class CommenterController {

    @Autowired
    private CommenterRepository cr;

    /**
     * Récupère un commentaire lié à un animal
     * @param idAnimal
     * @param idCommentaire
     * @return
     */
    @GetMapping("/{idAnimal}/{idCommentaire}")
    public ResponseEntity<Commenter> findCommenterById(@PathVariable(value = "idAnimal") long idAnimal, @PathVariable(value = "idCommentaire") long idCommentaire) {
        CommenterId id = new CommenterId(idCommentaire, idAnimal);
        Optional<Commenter> commenter = cr.findById(id);

        if(commenter.isPresent()) {
            return ResponseEntity.ok().body(commenter.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    /**
     * Ajoute un commentaire lié à un animal
     * @param commenter
     * @return
     */
    @PostMapping
    public Commenter addCommentaire(@Validated @RequestBody Commenter commenter) {
        return cr.save(commenter);
    }

    /**
     * Supprime un commentaire
     * @param id_commentaire
     * @param id_recette
     */
    @DeleteMapping("/delete/{id_commentaire}/{id_recette}")
    public void deleteCommentaire(@PathVariable(value = "id_commentaire") long id_commentaire,@PathVariable(value = "id_recette") long id_recette){
        CommenterId id = new CommenterId(id_commentaire,id_recette);
        cr.deleteById(id);
    }
}
