package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Farm.Stable;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Persons.Person;

public class Horse extends Animal implements Rideable {

    boolean isRidden;
    Person rider;
    Stable home;

    public Horse(String name, Stable stable) {
        super(name);
        this.isRidden = false;
        rider = null;
        this.home = stable;
    }

    public String makeNoise() {

        return "Nay Nay";
    }

    public void ridden(Person person){
        if(this.isRidden == false){
            this.isRidden = true;
            this.rider = person;
        } else System.out.println( "Sorry this horse is currently unavailable to ride");
    }

    public void notRidden(){
        if(this.isRidden == true){
            this.isRidden = false;
            this.rider = null;
            System.out.println("This Horse is free to be ridden by someone else.");
        } else System.out.println("This Horse is free to be ridden by someone else.");
    }
}
