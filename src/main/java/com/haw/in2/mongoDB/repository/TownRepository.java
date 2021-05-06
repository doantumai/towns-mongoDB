package com.haw.in2.mongoDB.repository;

import com.haw.in2.mongoDB.model.Town;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "towns", path = "towns")
public interface TownRepository extends MongoRepository<Town, String> {
    List<Town> findByName(String name);

    List<Town> findByFamousFor(String famousFor);
}
