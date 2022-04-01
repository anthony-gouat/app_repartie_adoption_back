package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.Model.Commentaire;
import com.licence.app_repartie_adoption_back.Model.Commenter;
import com.licence.app_repartie_adoption_back.Repository.CommentaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/commentaires")
public class CommentaireController {

    @Autowired
    private CommentaireRepository cr;

    @GetMapping("/{id}")
    public ResponseEntity<Commentaire> getCommentaireById(@PathVariable(value="id")Long id) {
        Optional<Commentaire> commentaire = cr.findById(id);

        if (commentaire.isPresent()) {
            return ResponseEntity.ok().body(commentaire.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Commentaire addCommentaire(@Validated @RequestBody Commentaire commentaire) {
        return cr.save(commentaire);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCommentaire(@PathVariable(value = "id") long id){
        cr.deleteById(id);
    }
}
