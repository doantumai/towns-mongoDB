package com.haw.in2.mongoDB.repository;

import com.haw.in2.mongoDB.model.Town;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "towns", path = "towns")
public interface TownRepository extends MongoRepository<Town, String> {

    List<Town> findByName(String name);

    Optional<Town> findByFamousFor(String famousFor);

    @Query(value ="{ famousFor : 'food' }", fields = "{ id : 0, name : 1, famousFor : 1, mayor : 1}")
    List<Town> findByFamousForFood();

    @Query(value ="{ famousFor : '/MOMA/' }", fields = "{ id : 0, name : 1, famousFor : 1 , mayor : 1}")
    List<Town> findByFamousForMoma();

    @Query(value ="{ famousFor : { $all : ['food', 'beer'] } }", fields = "{ id : 0, name : 1, famousFor : 1}")
    List<Town> findByFamousForFoodAndBeer();

    @Query(value ="{ famousFor : { $nin : ['food', 'beer'] } }", fields = "{ id : 0, name : 1, famousFor : 1 }")
    List<Town> findByFamousForNotConsistingFoodAndBeer();

    @Query(value ="{ 'mayor.party' : 'D' }", fields = "{ id : 0, name : 1, mayor : 1 }")
    List<Town> findByMayorParty();
}
