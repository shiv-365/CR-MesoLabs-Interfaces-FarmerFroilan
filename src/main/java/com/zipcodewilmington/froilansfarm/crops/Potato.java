package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Potato extends Crop {
    public Potato yield() {
        Potato potato = new Potato();
        return potato;
    }

    public boolean isEdible() {
        return false;
    }

}
