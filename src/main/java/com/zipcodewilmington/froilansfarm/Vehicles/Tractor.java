package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle {

    boolean operate;
    Person rider;

    public Tractor() {
        super.isRidden = false;
        this.operate = false;
        this.rider = null;
    }

    public void operate(Person p) {
        if(p instanceof Rider) {
            ridden(p);
            this.operate = true;
        }
    }

    public void stopOperate(){
        if(operate == false){
            System.out.println("Not Currently Operating!");
        } else{
            notRidden();
            this.operate = false;
        }
    }

    public String makeNoise() {
        String noise = null;
        if(operate == true) {
            noise = "VROOOMMMM VRRRRROOOOOOMMMMM";
        }
        return noise;
    }

    public void ridden(Person p) {
        this.rider = p;
        super.isRidden = true;
    }

    public void notRidden(){
        this.rider = null;
        super.isRidden = false;
    }

    public ArrayList<Object> harvest(CropRow cropRow) {
        ArrayList<Object> theHarvest = new ArrayList<Object>();

        if(this.operate == true) {
            Crop[] tempCrop = cropRow.getCropRow();
            for (Crop c : tempCrop) {
                if (c instanceof Edible) {
                    theHarvest.add(c);
                }
            }
        } return theHarvest;
    }
}

