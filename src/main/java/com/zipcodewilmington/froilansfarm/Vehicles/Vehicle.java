package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public abstract class Vehicle implements Rideable, NoiseMaker {

    boolean isRidden;

    public Vehicle() {
        this.isRidden = false;
    }

}
