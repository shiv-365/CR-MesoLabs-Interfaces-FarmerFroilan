package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

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
        this.isRidden = true;
        super.makeNoise();
    }

    public void operate(){
        this.operating = true;
    }

    public void fertilize( Farm.field){


        for(CropRow cR : ){

        }

    }
}
