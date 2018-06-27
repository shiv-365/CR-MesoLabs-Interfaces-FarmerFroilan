package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Farm.Coop;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {

    private boolean hasBeenFertilized;
    Coop home;

    public Chicken(String name, Coop coop) {
        super(name);
        this.hasBeenFertilized = false;
        this.home = coop;
    }

    public String makeNoise(){
        return "Cluck Cluck Cluck";
    }

    public Egg yield(){
        if(hasBeenFertilized != true) {
            Egg egg = new Egg();
            return egg;
        }

        return null;
    }

    public void fertilized(){
        hasBeenFertilized = true;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }
}
