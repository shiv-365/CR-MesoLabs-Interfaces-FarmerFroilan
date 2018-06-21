package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Farmer extends Person  implements Botanist, Rider {
    private boolean riding;
    private boolean mounted;

    public Farmer(String name) {
        super(name);
        this.riding = false;
    }

    public void plantCrop(Object c){ //replace Object with Crop

    }

    public void ride(Rideable r){

        riding = true;

    }

    public void mount(Rideable r){

        mounted = true;

    }
    public void dismount(Rideable r){
        mounted = false;

    }


    public String makeNoise(){
        return "I'm a farmer, I farm!";
    }

}
