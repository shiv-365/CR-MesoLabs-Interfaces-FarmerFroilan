package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.*;

public class CropDuster extends Aircraft implements FarmVehicle {

    boolean operating;

    public CropDuster() {
        super.isRidden = false;
        this.operating = false;
        super.flying = false;
        super.pilot = null;
    }

    public void ridden(Person p){
        if(this.isRidden == false){
            this.isRidden = true;
        } else System.out.println( "Sorry this CropDuster is currently unavailable to fly");
    }

    public void notRidden(){
        this.isRidden = false;
    }

    public void fly(Person p) {
       if(p instanceof Pilot) {
           operate(p);
           ridden(p);
           super.pilot = p;
           this.flying = true;
           super.makeNoise();
       }
    }

    public void land(){
        notRidden();
        stopOperate();
        this.pilot = null;
        this.flying = false;
    }

    public void operate(Person p){
        this.operating = true;
    }
    public void stopOperate() {this.operating = false;}

    public void fertilize(CropRow cropRow){
            for(int i = 0; i < cropRow.getCropRowSize(); i++)
                cropRow.getCropFromRow(i).fertilized();
          }

}
