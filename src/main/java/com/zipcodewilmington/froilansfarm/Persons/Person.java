package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;


public class Person implements Eater, NoiseMaker {
    private String name;


    public Person(String name) {
        this.name = name;

    }


    public String getName() {
        return name;
    }



//    public void eat(Object e) {
//        fridge.remove(e.getName(), )
//
//
//    }


    public void eat(Edible e) {

    }

    public String makeNoise() {
        return "I'm Batman";
    }

    public void eat(Object e) { //what is this bullshit

    }
}
