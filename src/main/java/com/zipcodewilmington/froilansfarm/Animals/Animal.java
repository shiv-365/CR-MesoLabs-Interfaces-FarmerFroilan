package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public abstract class Animal implements Eater, NoiseMaker {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(Edible e) {

    }
}
