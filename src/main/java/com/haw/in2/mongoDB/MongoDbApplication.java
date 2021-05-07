package com.haw.in2.mongoDB;

import com.haw.in2.mongoDB.model.Mayor;
import com.haw.in2.mongoDB.model.Town;
import com.haw.in2.mongoDB.repository.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class MongoDbApplication implements CommandLineRunner {

	@Autowired
	public TownRepository townRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	}

	public void run(String... args){
		townRepository.deleteAll();

		// save towns
		townRepository.save(new Town("Washinton D.C", "7.615.000", "ISODate("+"2019-01-01"+")", Collections.singletonList("White House"), new Mayor("Muriel Bowser", "D")));
		townRepository.save(new Town("New York", "22.200.000", "ISODate("+"2016-07-01"+")", Collections.singletonList("the MOMA, food, Derek Jeter"), new Mayor("Bill de Blasio", "D")));
		townRepository.save(new Town("Los Angeles", "3.967.000", "ISODate("+"2019-01-01"+")", Collections.singletonList("Hollywood Sign, the Getty Center"), new Mayor("Eric Garcetti", "D")));townRepository.save(new Town("Los Angeles", "3.967.000", "ISODate("+"2019-01-01"+")", Collections.singletonList("Hollywood Sign, the Getty Center"), new Mayor("Eric Garcetti", "D")));
		townRepository.save(new Town("Long Island", "7.647.000", "ISODate("+"2019-01-01"+")", Collections.singletonList("Gold Coast Mansions"), new Mayor("Laura Curran", "D")));
		townRepository.save(new Town("Miami", "454.279", "ISODate("+"2019-01-01"+")", Collections.singletonList("Gorgeous Beaches"), new Mayor("Francis X. Suarez", "R")));

		System.out.println("Towns found with findAll():");
		System.out.println("-------------------------------");
		for (Town town : townRepository.findAll()) {
			System.out.println(town);
		}
		System.out.println();

		// fetch an individual town
		System.out.println("Town found with findByName('New York'):");
		System.out.println("--------------------------------");
		System.out.println(townRepository.findByName("New York"));
		System.out.println("Town found with findByName('Miami'):");
		System.out.println("--------------------------------");
		System.out.println(townRepository.findByName("Miami"));


		System.out.println("Town found with findByName('famousFor'):");
		System.out.println("--------------------------------");
		System.out.println(townRepository.findByFamousFor("food"));
		System.out.println("Town found with findByName('famousFor'):");
		System.out.println("--------------------------------");
		System.out.println(townRepository.findByFamousFor("White House"));
	}
}
