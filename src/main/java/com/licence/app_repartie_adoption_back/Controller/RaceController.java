package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.Model.Race;
import com.licence.app_repartie_adoption_back.Model.Type;
import com.licence.app_repartie_adoption_back.Repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/race")
public class RaceController {

    @Autowired
    RaceRepository rr;
    /**
     * Apelle de la liste des Races stockées en base de données
     * @return la liste des toutes les races
     */
    @GetMapping
    public List<Race> getAllRaces() {
        return (List<Race>) rr.findAll();
    }

    /**
     * Ajoute une race à la base
     * @param race
     * @return
     */
    @PostMapping
    public Race addType(@Validated @RequestBody Race race) {
        return rr.save(race);
    }

}
