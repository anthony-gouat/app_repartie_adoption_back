package com.licence.app_repartie_adoption_back;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalerieController {

    @GetMapping("/api/getAnimals")
    public List<Animal> getListAnimal() {

    }
}
