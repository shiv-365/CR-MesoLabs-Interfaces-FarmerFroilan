package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle {

    boolean operate;

    public Tractor() {
        super.isRidden = false;
        this.operate = false;
    }

    public void operate() {
        this.operate = true;
    }

    public String makeNoise() {
        return "VROOOMMMM VRRRRROOOOOOMMMMM";
    }

    public void ridden() {
        super.isRidden = true;
    }

    public ArrayList<Edible> harvest(CropRow cropRow) {
        ArrayList<Edible> theHarvest = new ArrayList<Edible>();


        for (Crop c : cropRow) {
            if (c instanceof Edible) {
                theHarvest.add(c);
            }
        }
        return theHarvest;
    }
}

