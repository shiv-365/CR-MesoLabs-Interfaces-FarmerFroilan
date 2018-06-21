package com.zipcodewilmington.froilansfarm.Persons;

public class Farmer extends Person /* implements Botanist, Rider */ {
    private boolean riding;

    public Farmer(String name) {
        super(name);
        this.riding = false;
    }

    public void plantCrop(Object c){ //replace Object with Crop

    }

    public void ride(Object r){ //replace Object with Rideable

        riding = false;

    }

    public String easeThePain(Object b){
        return "And I drank until I felt compelled to contact all of my exes on facebook...";

    }

}
