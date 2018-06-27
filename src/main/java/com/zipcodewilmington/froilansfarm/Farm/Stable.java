package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;
import java.util.TreeMap;

public class Stable {
    private String name;
    private TreeMap<String,Horse> horseList = new TreeMap<String,Horse>();

    public Stable(String name, Horse horse){
        this.name = name;
    }

    public Horse getHorse(String horseName){
        return horseList.get(horseName);
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){

        return name;
    }

    public void addHorse(Horse horse){

        horseList.put(horse.getName(), horse);
    }




}
