package com.haw.in2.mongoDB.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Document(collection = "towns") //annotation helps us override the collection name by “towns”.
public class Town {

    @Id
    public String id;

    public String name;
    public String population;
    public String lastCensus;
    public List<String> famousFor;
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
     * Hilfsmethode
     * @return Eintraege als concat-String
     */
    private String getFamousFor(){
        String out = new String();
        for (int i = 0; i < famousFor.size()-1; i++){
            out = famousFor.get(i) + ", ";
        }
        return out + famousFor.get(famousFor.size()-1);
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
                ", famousFor=" + getFamousFor() +
                ", mayor= { name: " + mayor.getName() + ", party :" + mayor.getParty() +
                '}';
    }
}
