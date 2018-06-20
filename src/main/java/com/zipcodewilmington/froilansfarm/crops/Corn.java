package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Corn extends Crop {
    public Edible yield() {
        Edible corn = new Corn();
        return corn;
    }

    public boolean isEdible() {
        return false;
    }

}
