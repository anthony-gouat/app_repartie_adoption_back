package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.ImagesId;
import com.licence.app_repartie_adoption_back.Model.Commentaire;
import com.licence.app_repartie_adoption_back.Model.Commenter;
import com.licence.app_repartie_adoption_back.Model.Images;
import com.licence.app_repartie_adoption_back.Repository.CommentaireRepository;
import com.licence.app_repartie_adoption_back.Repository.CommenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/commentaires")
public class CommentaireController {

    @Autowired
    private CommentaireRepository cr;

    @Autowired
    private CommenterRepository cmr;

    @GetMapping("/{id}")
    public ResponseEntity<Commentaire> getCommentaireById(@PathVariable(value="id")Long id) {
        Optional<Commentaire> commentaire = cr.findById(id);

        if (commentaire.isPresent()) {
            return ResponseEntity.ok().body(commentaire.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/animal/{idAnimal}")
    public List<Commentaire> getCommentaireByIdAnimal(@PathVariable(value="idAnimal")Long idAnimal) {
        List<Commenter> listeComment = (List<Commenter>) cmr.findAll();
        List<Commentaire> list = new ArrayList<>();
        for (Commenter commenter : listeComment) {
            if(commenter.getIdAnimal()==idAnimal){
                list.add(cr.findById(commenter.getIdCommentaire()).get());
            }
        }
        return list;
    }

    @PostMapping
    public Commentaire addCommentaire(@Validated @RequestBody Commentaire commentaire) {
        return cr.save(commentaire);
    }

    @PutMapping("/{id}")
    public Commentaire updateCommentaire(@Validated @RequestBody Commentaire commentaire, @PathVariable(value = "id") Long id) throws IOException {

        Optional<Commentaire> commentairebyId = cr.findById(id);
        Commentaire commentaire1 = null;
        if (commentairebyId.isPresent()) {
            commentaire1 = commentairebyId.get();
            if(commentaire.getContenuComm()!=null)commentaire1.setContenuComm(commentaire.getContenuComm());
            if(commentaire.getDate()!=null)commentaire1.setDate(commentaire.getDate());
            if(commentaire.getIdReponse()==null){
                commentaire1.setIdReponse(null);
            }
            else if(commentaire.getIdReponse()>=0)commentaire1.setIdReponse(commentaire.getIdReponse());
            return cr.save(commentaire1);
        }
        return null;
    }


    @DeleteMapping("/{id}")
    public void deleteCommentaire(@PathVariable(value = "id") long id){
        cr.deleteById(id);
    }
}
