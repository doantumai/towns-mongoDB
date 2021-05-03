package com.haw.in2.mongoDB;

import com.haw.in2.mongoDB.model.Mayor;
import com.haw.in2.mongoDB.model.Town;
import com.haw.in2.mongoDB.repository.TownRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MongoDbApplication implements CommandLineRunner {

	@Autowired
	public TownRepository townRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
		System.out.println("Moin");
	}

	//@Override
	public void run(String... args) throws Exception{
		townRepository.deleteAll();

		List<String> famousFor = new ArrayList<>();
		famousFor.add("the MOMA");
		famousFor.add("food");
		famousFor.add("Derek Jeter");

//		List<String> mayor = new ArrayList<>();
//		mayor.add("Bill de Blasio");
//		mayor.add("D");

		// save towns
		townRepository.save(new Town("New York", "22200000", "ISODate("+"2016-07-01"+")", famousFor, new Mayor("Bill de Blasio", "D")));

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

		//TODO
		System.out.println("Town found with findByName('famousFor'):");
		System.out.println("--------------------------------");

	}
}
