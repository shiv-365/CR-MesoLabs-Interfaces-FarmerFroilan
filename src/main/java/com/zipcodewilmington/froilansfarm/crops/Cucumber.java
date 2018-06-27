package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Cucumber extends Crop {
    public Cucumber yield() {
        Cucumber cucumber = new Cucumber();
        return cucumber;
    }

    public boolean isEdible() {
        return false;
    }

}