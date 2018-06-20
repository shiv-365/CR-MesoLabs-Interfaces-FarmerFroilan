package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Cucumber extends Crop {
    public Edible yield() {
        Edible cucumber = new Cucumber();
        return cucumber;
    }

    public boolean isEdible() {
        return false;
    }

}