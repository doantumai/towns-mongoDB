package com.haw.in2.towns.model;

public class Mayor {

    public String name;
    public String party;

    public Mayor(String name, String party){
        this.name = name;
        this.party = party;
    }

    public String getName() {
        return name;
    }

    public String getParty() {
        return party;
    }
}
