package com.zipcodewilmington.froilansfarm;

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

    public void easeThePain(Object b){ //replace Object with Beer


    }

}
