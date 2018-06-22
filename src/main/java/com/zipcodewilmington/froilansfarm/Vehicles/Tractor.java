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

    public ArrayList<Object> harvest(CropRow cropRow) {
        ArrayList<Object> theHarvest = new ArrayList<Object>();

        Object[] tempCrop = cropRow.getCropRow();
        for(Object o: tempCrop) {
            if (o instanceof Edible) {
                theHarvest.add(o);
            }
        } return theHarvest;
    }
}

