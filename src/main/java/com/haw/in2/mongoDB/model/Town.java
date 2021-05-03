package com.haw.in2.mongoDB.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Town {

    @Id
    public String id;

    public String name;
    public String population;
    public String lastCensus;
    public List<String> famousFor;
    //public List<String> mayor;
    public Mayor mayor;

    public Town() {
    }

    public Town(String name, String population, String lastCensus, List<String> famousFor, Mayor mayor) {
        this.name = name;
        this.population = population;
        this.lastCensus = lastCensus;
        this.famousFor = famousFor;
        this.mayor = mayor;
    }

    /**
     * The method prints out the details of the town
     * @return Details of the town
     */
    @Override
    public String toString() {
        return "Town{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", population='" + population + '\'' +
                ", lastCensus='" + lastCensus + '\'' +
                ", famousFor=" + famousFor +
                ", mayor= { name: " + mayor.getName() + ", party :" + mayor.getParty() +
                '}';
    }
}
