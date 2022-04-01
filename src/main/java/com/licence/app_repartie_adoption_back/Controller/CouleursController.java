package com.licence.app_repartie_adoption_back.Controller;

import com.licence.app_repartie_adoption_back.Model.Couleurs;
import com.licence.app_repartie_adoption_back.Repository.CouleursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/couleurs")
public class CouleursController {

    @Autowired
    private CouleursRepository cr;


}
