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

        ArrayList<Crop> tempCrop = cropRow.getCropRow();
        for(Crop crop: tempCrop){
            if(crop instanceof Edible){
            theHarvest.add(crop);}
        }return theHarvest;
    }
}

