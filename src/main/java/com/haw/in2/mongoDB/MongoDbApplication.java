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

	public void run(String... args) {
		townRepository.deleteAll();

		// save towns
		townRepository.save(new Town("1", "Washinton D.C", "7.615.000", "ISODate(" + "2019-01-01" + ")", new String[]{"White House"}, new Mayor("Muriel Bowser", "D")));
		townRepository.save(new Town("2", "New York", "22.200.000", "ISODate(" + "2016-07-01" + ")", new String[]{"the MOMA", "food", "Derek Jeter"}, new Mayor("Bill de Blasio", "D")));
		townRepository.save(new Town("3", "Los Angeles", "3.967.000", "ISODate(" + "2019-01-01" + ")", new String[]{"Hollywood Sign", "the Getty Center"}, new Mayor("Eric Garcetti", "D")));
		townRepository.save(new Town("4", "Long Island", "7.647.000", "ISODate(" + "2019-01-01" + ")", new String[]{"Gold Coast Mansions"}, new Mayor("Laura Curran", "D")));
		townRepository.save(new Town("5", "Miami", "454.279", "ISODate(" + "2019-01-01" + ")", new String[]{"Gorgeous Beaches"}, new Mayor("Francis X. Suarez", "R")));
	}
}


