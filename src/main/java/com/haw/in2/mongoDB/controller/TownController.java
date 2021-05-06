package com.haw.in2.mongoDB.controller;

import com.haw.in2.mongoDB.model.Town;
import com.haw.in2.mongoDB.repository.TownRepository;
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
}
