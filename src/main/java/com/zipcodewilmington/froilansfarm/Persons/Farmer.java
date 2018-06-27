package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Vehicles.Vehicle;
import com.zipcodewilmington.froilansfarm.crops.Crop;


public class Farmer extends Person  implements Botanist, Rider {
    private boolean riding;
    private boolean mounted;
    private Rideable currentRide;

    public Farmer(String name) {
        super(name);
        this.riding = false;
        this.mounted = false;
        this.currentRide = null;
    }


    public String easeThePain(){ //need beer class
        return "And I drank until I felt compelled to contact all of my exes on facebook...";

    }

    public void plantCrop(Crop crop, CropRow cropRow) {
        cropRow.plantCrop(crop);
    }

    public void mount(Rideable ride) {
        if(ride instanceof Vehicle){
            System.out.println("You can't mount");
        } else {
            if(this.mounted == true || this.riding == true){
                System.out.println("Already mounted!");
            } else {
                ride.ridden(this);
                this.mounted = true;
                this.currentRide = ride;
            }
        }
    }

    public void dismount(Rideable ride) {
       if(this.mounted == false){
           System.out.println("Not currently mounted on anything!");
       }
       else {
           ride.notRidden();
           this.mounted = false;
           this.currentRide = null;
       }
    }

    public String makeNoise(){
        return "I'm a farmer, I farm!";
    }

    public void ride(Rideable ride) {
        if(this.riding == true || this.mounted == true){
            System.out.println("Already riding something!!");
        } else {
            if (ride instanceof Animal) {
                System.out.println("You cant ride a Horse! You mount a Horse!");
            } else {
                ride.ridden(this);
                this.currentRide = ride;
                this.riding = true;
            }
        }
    }

    public void getOutOfRide(Rideable ride){
        if(this.riding == false){
            System.out.println("Not riding anything!");
        } else {
            ride.notRidden();
            this.riding = false;
            this.currentRide = null;
        }
    }

}
