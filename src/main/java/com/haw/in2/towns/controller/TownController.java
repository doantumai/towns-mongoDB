package com.haw.in2.towns.controller;

import com.haw.in2.towns.model.Town;
import com.haw.in2.towns.repository.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api/")
public class TownController {

    @Autowired
    TownRepository townRepository;

    @GetMapping("towns")
    public List<Town> getTowns(){
        return this.townRepository.findAll();
    }

    @GetMapping("famousforfood")
    public List<Town> getFamousForFood(){
        return this.townRepository.findByFamousForFood();
    }

    @GetMapping("famousformoma")
    public List<Town> getFamousForMoma(){
        return this.townRepository.findByFamousForMoma();
    }

    @GetMapping("famousforfoodandbeer")
    public List<Town> getFamousForFoodAndBeer(){ return this.townRepository.findByFamousForFoodAndBeer();}

    @GetMapping("famousfornotfoodandbeer")
    public List<Town> getByFamousForNotConsistingFoodAndBeer(){
        return this.townRepository.findByFamousForNotConsistingFoodAndBeer();
    }

    @GetMapping("mayorparty")
    public List<Town> getByMayorParty(){
        return this.townRepository.findByMayorParty();
    }
}
