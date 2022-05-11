package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.Model.Type;
import com.licence.app_repartie_adoption_back.Model.Utilisateur;
import com.licence.app_repartie_adoption_back.Repository.TypeRepository;
import com.licence.app_repartie_adoption_back.Repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.List;

@RestController
@RequestMapping("/api/utilisateur")
public class UtilisateurController {

    @Autowired
    UtilisateurRepository ur;
    /**
     * Apelle de la liste des Utilisateurs stockées en base de données
     * @return la liste de tous les utilisateurs
     */
    @GetMapping
    public List<Utilisateur> getAllUtilisateurs() {
        return (List<Utilisateur>) ur.findAll();
    }

    @PostMapping("/authentification")
    public Utilisateur authentification(@RequestBody Utilisateur user, HttpServletResponse response) throws NoSuchAlgorithmException, InvalidKeySpecException, IOException {
        Utilisateur utilisateur = findByEmail(user.getMail());
        if(utilisateur!=null){
            if(utilisateur.getMdp().equals(user.getMdp())) {
                utilisateur.setMdp("");
                return utilisateur;
            }
            response.setStatus(403);
            response.getWriter().write("mot de passe incorrect");
            response.getWriter().close();

            return null;
        }
        response.getWriter().write("email inconnu");
        response.getWriter().close();
        response.setStatus(403);
        return null;
    }

    private Utilisateur findByEmail(String email){
        Iterable<Utilisateur> allUsers = ur.findAll();
        for (Utilisateur user:allUsers) {
            if(user.getMail().equals(email)) return user;
        }
        return null;
    }
}
