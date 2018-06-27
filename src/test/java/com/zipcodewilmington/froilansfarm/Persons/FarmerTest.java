package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Stable;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import com.zipcodewilmington.froilansfarm.crops.Corn;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    Farmer testFarmer = new Farmer("Billy");

    @Test
    public void easeThePain() {
        assertTrue(testFarmer.easeThePain() == "And I drank until I felt compelled to contact all of my exes on facebook...");
    }

    @Test
    public void plantCrop() {
        CropRow testRow = new CropRow(new Corn());
        testFarmer.plantCrop(new Corn(), testRow);
        assertTrue(testRow.getCropFromRow(0) instanceof Corn);
    }

    @Test
    public void mount() {
        Stable testStable = new Stable("Horseville");
        Horse testHorse = new Horse("SeaBiscuit", testStable);

        testFarmer.mount(testHorse);
        assertTrue(testFarmer.isMounted());
    }

    @Test
    public void dismount() {
        Stable testStable = new Stable("Horseville");
        Horse testHorse = new Horse("SeaBiscuit", testStable);

        testFarmer.mount(testHorse);
        testFarmer.dismount(testHorse);
        assertTrue(testFarmer.isMounted() == false);
    }

    @Test
    public void makeNoise() {
        assertTrue(testFarmer.makeNoise() == "I'm a farmer, I farm!");
    }

    @Test
    public void ride() {
        Tractor testTractor = new Tractor();
        testFarmer.ride(testTractor);
        assertTrue(testFarmer.isRiding());
    }

    @Test
    public void getOutOfRide() {
        Tractor testTractor = new Tractor();
        testFarmer.ride(testTractor);
        testFarmer.getOutOfRide(testTractor);
        assertTrue(testFarmer.isRiding() == false);
    }
}