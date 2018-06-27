package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.TreeMap;

public class Coop {
    private String name;
    private TreeMap<String,Chicken> chickenList = new TreeMap<String,Chicken>();

    public Coop(String name) {
        this.name = name;
    }

    public Chicken getChicken(String name) {

        return chickenList.get(name);
    }

    public void setName(String name){ //coop name

        this.name = name;

    }

    public String getName(){ //coop name
        return name;
    }

    public void addChicken(Chicken chicken) {

        chickenList.put(chicken.getName(), chicken);
    }

}
