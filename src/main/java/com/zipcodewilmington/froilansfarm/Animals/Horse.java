package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    boolean isRidden;


    public Horse(String name) {
        super(name);
        this.isRidden = false;
    }

    public String makeNoise() {

        return "Nay Nay";
    }

    public void ridden(){
        if(this.isRidden == false){
            this.isRidden = true;
        } else System.out.println( "Sorry this horse is currently unavailable to ride");
    }

    public void eat(Object e){
        if(e instanceof Edible){
            System.out.println("NOM NOM NOM");
        } else System.out.println("THIS IS NOT FOOD!");
    }
}
