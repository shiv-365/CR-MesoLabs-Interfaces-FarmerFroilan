package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

import java.security.PublicKey;

public abstract class Animal implements Eater, NoiseMaker {

   private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public void eat(Object[] e){
        for(Object o: e) {
            if (o instanceof Edible) {
                System.out.println("NOM NOM NOM");
            } else System.out.println("THIS IS NOT FOOD!");
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
