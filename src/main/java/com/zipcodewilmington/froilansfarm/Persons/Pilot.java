package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Interfaces.Flys;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;

public class Pilot extends Person implements Flys, Rider {
    private boolean riding;
    private boolean flying;

    public Pilot(String name) {
        super(name);
        this.flying = false;
        this.riding = false;
    }


    public void fly(Aircraft a) { //replace Object with Aircraft object


    }

    public void flying() {

    }


    public void stopFlying(Object a) {
        flying = false;

    }

    public void stopRiding(Object a) {
        flying = false;

    }

    public String makeNoise() {
        return "Vroom Vroom!";
    }

    public void mount(Rideable ride) {

    }

    public void dismount(Rideable ride) {

    }

    public void ride(Rideable ride) {

    }
}
