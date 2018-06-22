package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.TreeMap;

public class Coop extends Chicken {
    private Chicken chick;
    private String coopname;
    public TreeMap<String,Chicken> oneCoop = new TreeMap<String,Chicken>();
    private String Chickenname;

    public Coop (String name){
        super(name);

        this.coopname = name;
    }
    public Coop(){

    }


    public void setName(String name){ //coop name

        this.coopname = name;

    }

    public String getName(){ //coop name
        return coopname;

    }

    public void addChicken(Chicken c){ //add chicken c to coop

        oneCoop.put(getNameChicken(),c);
    }
    public Chicken getChicken(String name) {

              return oneCoop.get(name);
    }

}
