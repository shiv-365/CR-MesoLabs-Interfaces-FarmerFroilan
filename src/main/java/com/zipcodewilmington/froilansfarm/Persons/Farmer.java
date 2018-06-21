package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.crops.Crop;

public class Farmer extends Person  implements Botanist, Rider {
    private boolean riding;

    public Farmer(String name) {
        super(name);
        this.riding = false;
    }


    public String easeThePain(){ //need beer class
        return "And I drank until I felt compelled to contact all of my exes on facebook...";

    }

    public void plantCrop(Crop crop) {

    }

    public void mount(Rideable ride) {

    }

    public void dismount(Rideable ride) {

    }

    public void ride(Rideable ride) {

    }
}
