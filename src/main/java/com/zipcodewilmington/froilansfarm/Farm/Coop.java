package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;
import java.util.TreeMap;

public class Coop {
    private Chicken chick;
    private String name;
    private TreeMap<String,Chicken> oneCoop = new TreeMap<String,Chicken>();
    public Coop(String name){

        //this.chick = chick;
        this.name = name;

    }
    public Coop(){}

    public Chicken getChicken(){

        return chick;
    }


    public void setName(String name){

        this.name = name;

    }

    public String getName(){
        return name;

    }
    public void addChicken(Chicken chick){

        oneCoop.put(name,chick);
    }


}
