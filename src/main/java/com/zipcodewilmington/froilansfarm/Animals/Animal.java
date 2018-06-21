package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

public abstract class Animal implements Eater, NoiseMaker {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(Object edible) {
        if(edible instanceof Edible){
            System.out.println("NOM NOM NOM");

        } else System.out.println("Can't Eat That!");
    }

    public void eat(Object[] e){
        for(Object o: e) {
            if (o instanceof Edible) {
                System.out.println("NOM NOM NOM");
            } else System.out.println("THIS IS NOT FOOD!");
        }
    }
}
