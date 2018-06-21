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

    public void eat(Object[] e){
        for(Object o: e) {
            if (o instanceof Edible) {
                System.out.println("NOM NOM NOM");
            } else System.out.println("THIS IS NOT FOOD!");
        }
    }

    public String makeNoise() {
        return "I'm Batman";
    }

    public void eat(Object e) { //what is this bullshit

    }
}
