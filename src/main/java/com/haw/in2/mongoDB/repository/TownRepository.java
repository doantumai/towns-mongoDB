package com.haw.in2.mongoDB.repository;

import com.haw.in2.mongoDB.model.Town;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "towns", path = "towns")
public interface TownRepository extends MongoRepository<Town, String> {
    <Optional> Town findByName(String name);

    //Town findByFamousFor(String famousFor);
}
