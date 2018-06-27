package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Corn extends Crop {
    public Corn yield() {
        Corn corn = new Corn();
        return corn;
    }

    public boolean isEdible() {
        return false;
    }

}
