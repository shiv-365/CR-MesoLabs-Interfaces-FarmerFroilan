package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public abstract class Crop implements Produce, Edible {

    boolean hasBeenFertilized = false;

    public void fertilized() {

        hasBeenFertilized = true;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }
}
