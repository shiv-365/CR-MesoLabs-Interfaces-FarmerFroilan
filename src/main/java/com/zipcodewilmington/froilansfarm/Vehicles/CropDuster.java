package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeMap;

public class CropDuster extends Aircraft implements FarmVehicle {

    boolean operating;

    public CropDuster() {
        super.isRidden = false;
        this.operating = false;
        super.flying = false;
        super.hasPilot = false;
    }

    public void ridden(){
        if(this.isRidden == false){
            this.isRidden = true;
        } else System.out.println( "Sorry this CropDuster is currently unavailable to fly");
    }

    public void fly() {
        operate();
        this.flying = true;
        this.hasPilot = true;
        ridden();
        super.makeNoise();
    }

    public void operate(){
        this.operating = true;
    }

    public void fertilize(TreeMap<Crop, CropRow> field){
        Collection<CropRow> crops = field.values();
        for(CropRow c : crops){
             Crop[] tempCrop = c.getCropRow();
             for(Crop crop: tempCrop){
                 crop.fertilized();
             }
        }
    }
}
