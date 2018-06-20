package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Tomato extends Crop {
    public Edible yield() {
        Edible tomato = new Tomato();
        return tomato;
    }

    public boolean isEdible() {
        return false;
    }

    public Object yield(com.zipcodewilmington.froilansfarm.Interfaces.Edible e) {
        return null;
    }
}
