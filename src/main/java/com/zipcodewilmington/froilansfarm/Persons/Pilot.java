package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.*;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicles.Vehicle;

public class Pilot extends Person implements Flys, Rider {

    private boolean flying;
    private boolean riding;
    private boolean mounted;
    private Rideable currentRide;
    private Flyable currentAircraft;

    public Pilot(String name) {
        super(name);
        this.flying = false;
        this.riding = false;
        this.mounted = false;
        this.currentRide = null;
        this.currentAircraft= null;
    }


    public void fly(Aircraft a) {
        if(this.flying == true || this.riding == true || this.mounted == true){
            System.out.println("You're already doing something");
        } else {
            if (a instanceof Aircraft) {
                a.fly(this);
                this.flying = true;
                this.currentAircraft = a;
            } else {
                System.out.println("Not an aircraft!");
            }
        }
    }

    public void stopFlying(Aircraft a) {
        a.land();
        this.currentAircraft = null;
        this.flying = false;
    }

    public void ride(Rideable ride) {
        if(this.riding == true || this.mounted == true){
            System.out.println("Already riding something!!");
        } else {
            if (ride instanceof Animal) {
                System.out.println("You cant ride a Horse! You mount a Horse!");
            } else {
                ride.ridden(this);
                this.currentRide = ride;
                this.riding = true;
            }
        }
    }

    public void getOutOfRide(Rideable ride){
        if(this.riding == false){
            System.out.println("Not riding anything!");
        } else {
            ride.notRidden();
            this.riding = false;
            this.currentRide = null;
        }
    }

    public String makeNoise() {
        return "Vroom Vroom!";
    }

    public void mount(Rideable ride) {
        if(ride instanceof Vehicle){
            System.out.println("You can't mount");
        } else {
            if(this.mounted == true || this.riding == true){
                System.out.println("Already mounted!");
            } else {
                ride.ridden(this);
                this.mounted = true;
                this.currentRide = ride;
            }
        }
    }

    public void dismount(Rideable ride) {
        if(this.mounted == false){
            System.out.println("Not currently mounted on anything!");
        }
        else {
            ride.notRidden();
            this.mounted = false;
            this.currentRide = null;
        }
    }

}
