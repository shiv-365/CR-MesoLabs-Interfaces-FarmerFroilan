package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {

    private boolean hasBeenFertilized;

    public Chicken(String name) {
        super(name);
        this.hasBeenFertilized = false;
    }

    public String makeNoise(){
        return "Cluck Cluck Cluck";
    }

    public Edible yield(){
        if(hasBeenFertilized != true) {
            Edible egg = new Egg();
            return egg;
        }

        return null;
    }

    public void fertilized(){
        hasBeenFertilized = true;
    }

}
