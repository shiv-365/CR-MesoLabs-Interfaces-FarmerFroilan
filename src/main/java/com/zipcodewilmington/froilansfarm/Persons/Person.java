package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public class Person implements Eater, NoiseMaker {
    private String name;


    public String getName() {
        return name;
    }


    public Person(String name) {
        this.name = name;

    }

//    public void eat(Object e) {
//        fridge.remove(e.getName(), )
//
//
//    }

    public String makesNoise() { //not same as NoiseMaker implementation

        return "I'm Batman";
    }

    public void dismount() {
        riding = false;
    }
}
