package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Tomato extends Crop {
    public Tomato yield() {
        Tomato tomato = new Tomato();
        return tomato;
    }

    public boolean isEdible() {
        return false;
    }

}
