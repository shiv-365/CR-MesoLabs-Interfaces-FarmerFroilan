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

    public boolean eat(Object[] e){
        boolean wasItTasty = false;
        for(Object o: e) {
            if (o instanceof Edible) {
                System.out.println("NOM NOM NOM");
                wasItTasty = true;
            } else System.out.println("THIS IS NOT FOOD!");
        }
        return wasItTasty;
    }

    public String makeNoise() {
        return "I'm Batman";
    }

}
