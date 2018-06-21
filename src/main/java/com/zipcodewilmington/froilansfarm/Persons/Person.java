package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public class Person implements Eater, NoiseMaker {
   private String name;


    public Person(String name){
        this.name = name;

    }

    public String makesNoise(){

        return "I'm Batman";
    }


    public void eat(Edible e) {

    }

    public String makeNoise() {
        return null;
    }
}
