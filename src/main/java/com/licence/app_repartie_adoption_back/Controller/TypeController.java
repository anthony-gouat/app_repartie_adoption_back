package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.Model.Type;
import com.licence.app_repartie_adoption_back.Repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/type")
public class TypeController {

    @Autowired
    TypeRepository tr;
    /**
     * Apelle de la liste des Types stockées en base de données
     * @return la liste des toutes les types
     */
    @GetMapping
    public List<Type> getAllTypes() {
        return (List<Type>) tr.findAll();
    }
}
