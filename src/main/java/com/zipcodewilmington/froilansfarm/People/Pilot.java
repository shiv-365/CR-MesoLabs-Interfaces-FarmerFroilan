package com.zipcodewilmington.froilansfarm.People;

public class Pilot extends Person /*implements Flys, Rider*/ {
   private boolean riding;
   private boolean flying;

    public Pilot(String name) {
        super(name);
        this.flying = false;
        this.riding = false;
    }

    public void fly(Object a){ //replace Object with Aircraft object


    }



}
