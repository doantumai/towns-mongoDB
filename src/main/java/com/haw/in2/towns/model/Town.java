package com.haw.in2.towns.model;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "towns") //annotation helps us override the collection name by “towns”.
@AllArgsConstructor
public class Town {

    @Id
    public String id;

    public String name;
    public String population;
    public String lastCensus;
    public String[] famousFor;
    public Mayor mayor;


    /**
     * The method prints out the details of the town
     * @return Details of the town
     */
//    @Override
//    public String toString() {
//        return "Town{" +
//                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", population='" + population + '\'' +
//                ", lastCensus='" + lastCensus + '\'' +
//                ", famousFor=" + famousFor +
//                ", mayor= { name: " + mayor.getName() + ", party :" + mayor.getParty() +
//                '}';
//    }
}
