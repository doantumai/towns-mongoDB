package com.haw.in2.towns.repository;

import com.haw.in2.towns.TownsApplication;
import com.haw.in2.towns.model.Town;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = TownsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ExtendWith(SpringExtension.class)
class TownRepositoryTest {

    @Autowired
    private TownRepository townRepository;

    @Test
    public void findByFamousForFoodTest(){
        List<Town> towns = townRepository.findByFamousForFood();

        Optional<Town> temp = townRepository.findByFamousFor("food");

        assertTrue(temp.isPresent());
        assertThat(towns.contains(temp));
    }

    @Test
    public void findByFamousForMomaTest(){
        List<Town> towns = townRepository.findByFamousForMoma();

        Optional<Town> temp = townRepository.findByFamousFor("the MOMA");

        assertTrue(temp.isPresent());
        assertThat(towns.contains(temp));
    }

    @Test
    public void findByFamousForFoodAndBeerTest(){
        List<Town> towns = townRepository.findByFamousForFoodAndBeer();
        assertTrue(towns.size()==0);
    }

    @Test
    public void findByMayorPartyTest(){
        List<Town> towns = townRepository.findByMayorParty();

       List<Town> tmp = townRepository.findByMayorParty("D");

       assertTrue(towns.size() == tmp.size());
    }

    @Test
    public void findByFamousForNotConsistingFoodAndBeerTest(){
        List<Town> towns = townRepository.findByFamousForNotConsistingFoodAndBeer();

        Optional<Town> town = townRepository.findByFamousFor("White House");

        assertTrue(town.isPresent());
        assertThat(towns.contains(town));
    }
}