package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Potato extends Crop {
    public Edible yield() {
        Edible potato = new Potato();
        return potato;
    }

    public boolean isEdible() {
        return false;
    }

}
