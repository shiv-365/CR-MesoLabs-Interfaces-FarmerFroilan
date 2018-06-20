package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.Flyable;

public abstract class Aircraft extends Vehicle implements Flyable {

    boolean flying;
    boolean hasPilot;

    public Aircraft() {
        super.isRidden = false;
        this.flying = false;
        this.hasPilot = false;
    }

    public String makeNoise(){
        return "NYRRRRRRRRRRMMMMMMMMMMM";
    }
}
