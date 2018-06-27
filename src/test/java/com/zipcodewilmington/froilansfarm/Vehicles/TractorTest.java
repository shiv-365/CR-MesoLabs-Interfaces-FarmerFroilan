package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.crops.Corn;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TractorTest {
    Tractor testTractor = new Tractor();
    Farmer testFarmer = new Farmer("Froilan");

    @Test
    public void operate() {
        testTractor.operate(testFarmer);
        assertTrue(testTractor.operate == true);
    }

    @Test
    public void stopOperate() {
        testTractor.operate(testFarmer);
        testTractor.stopOperate();
        assertTrue(testTractor.operate == false);
    }

    @Test
    public void makeNoise() {
        testTractor.operate(testFarmer);
        assertTrue(testTractor.makeNoise() == "VROOOMMMM VRRRRROOOOOOMMMMM");
    }

    @Test
    public void ridden() {
        testTractor.ridden(testFarmer);
        assertTrue(testTractor.isRidden == true);
    }

    @Test
    public void notRidden() {
        testTractor.ridden(testFarmer);
        testTractor.notRidden();
        assertTrue( testTractor.isRidden == false);
    }

    @Test
    public void harvest() {
        CropRow testRow = new CropRow(new Corn());
        testFarmer.plantCrop(new Corn(), testRow);
        for(int i = 0; i < testRow.getCropRowSize(); i++){
            testRow.getCropFromRow(i).fertilized();
        }

        testTractor.operate(testFarmer);
        ArrayList<Object> harvest = testTractor.harvest(testRow);

        assertTrue(harvest.get(0) instanceof Edible);
    }
}