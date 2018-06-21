package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;

public class Stable {
    private Horse horseys;
    private ArrayList<Horse> oneStable = new ArrayList<Horse>();

    public Stable(Horse horse){

        this.horse = horse;

    }

    public Horse getHorse(){

        return horseys;
    }

    public void addHorse(){


        oneStable.add(horseys);
    }


}
