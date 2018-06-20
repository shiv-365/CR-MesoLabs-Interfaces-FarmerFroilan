package com.zipcodewilmington.froilansfarm.crops;

public abstract class Crop implements Produce, Edible {

    boolean hasBeenFertilized = false;

    public boolean fertilized() {
        return hasBeenFertilized;
    }

}
