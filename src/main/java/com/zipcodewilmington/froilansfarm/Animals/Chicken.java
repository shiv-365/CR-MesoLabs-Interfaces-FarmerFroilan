package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce {

    private boolean hasBeenFertilized;
    private String nameChicken;

    public Chicken(String name) {
        super(name);
        this.nameChicken = name;
        this.hasBeenFertilized = false;
    }
    public Chicken(){

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

    public void setNameChicken(String nameChicken){
        this.nameChicken = nameChicken;
    }
    public String getNameChicken(){

        return nameChicken;
    }


}
