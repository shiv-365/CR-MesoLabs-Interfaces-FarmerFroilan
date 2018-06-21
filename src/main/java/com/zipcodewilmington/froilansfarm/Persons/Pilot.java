package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Interfaces.Flys;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Pilot extends Person implements Rider, Flys {
   private boolean riding;
   private boolean flying;

    public Pilot(String name) {
        super(name);
        this.flying = false;
        this.riding = false;
    }

    public void fly(Object a){
        flying = true;

    }

    public void stopFlying(Object a){
        flying = false;

    }
    public void ride(Object a){
        riding = true;

    }    public void stopRiding(Object a){
        flying = false;

    }

    public String makeNoise(){
        return "Vroom Vroom!";
    }

}
