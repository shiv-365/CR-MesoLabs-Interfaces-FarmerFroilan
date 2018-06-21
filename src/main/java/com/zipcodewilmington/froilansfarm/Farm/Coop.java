package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;

public class Coop {
    private Chicken chick;
    private ArrayList<Chicken> oneCoop = new ArrayList<Chicken>();
    public Coop(Chicken chick){

        //oneCoop = new ArrayList<Chicken>();

        this.chick = chick;


    }
    public Coop(){}

    public Chicken getChicken(){

        return chick;
    }
    public void addChicken(Chicken chick){


        oneCoop.add(chick);
    }

}
