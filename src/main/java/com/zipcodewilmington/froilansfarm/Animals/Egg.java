package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Egg implements Edible {
    boolean edible = true;

    public Egg() {

    }

    public boolean isEdible() {
        return true;
    }
}
