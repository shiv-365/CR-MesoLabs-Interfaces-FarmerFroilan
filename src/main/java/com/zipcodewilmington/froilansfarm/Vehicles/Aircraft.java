package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.Flyable;
import com.zipcodewilmington.froilansfarm.Persons.Person;

public abstract class Aircraft extends Vehicle implements Flyable {

    boolean flying;
    Person pilot;

    public Aircraft() {
        super.isRidden = false;
        this.flying = false;
        this.pilot = null;
    }

    public String makeNoise(){
        String noise = null;
        if(this.pilot != null && this.flying == true) {
            noise = "NYRRRRRRRRRRMMMMMMMMMMM";
        } else { noise = "whoomp whoomp";}
        return noise;
    }

    public void fly(Person person){
        super.isRidden = true;
        this.flying = true;
        this.pilot = person;
    }

    public void land(){
        super.isRidden = false;
        this.flying = false;
        this.pilot = null;
    }
}
