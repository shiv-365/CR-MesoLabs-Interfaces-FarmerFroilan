package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;
import java.util.TreeMap;

public class Stable {
    private String name;
    private Horse horseys;
    private TreeMap<String,Horse> oneStable = new TreeMap<String,Horse>();

    public Stable(String name, Horse horse){

        this.horseys = horse;
        this.name = name;
    }

    public Horse getHorse(){

        return horseys;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){

        return name;
    }

    public void addHorse(){

        oneStable.put(name, horseys);
    }




}
