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
     * @param idCommentaire
     * @param idAnimal
     */
    @DeleteMapping("/delete/{idCommentaire}/{idAnimal}")
    public void deleteCommentaire(@PathVariable(value = "idCommentaire") long idCommentaire,@PathVariable(value = "idAnimal") long idAnimal){
        CommenterId id = new CommenterId(idCommentaire,idAnimal);
        cr.deleteById(id);
    }
}
