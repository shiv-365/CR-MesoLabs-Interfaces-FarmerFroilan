package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.crops.Corn;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;

public class CropDusterTest {
    CropDuster superPlane = new CropDuster();
    Pilot testPilot = new Pilot("woooooo");

    @Test
    public void ridden() {
        superPlane.ridden(testPilot);
        assertTrue(superPlane.isRidden == true);
    }

    @Test
    public void fly() {
        superPlane.fly(testPilot);
        assertTrue(superPlane.flying == true);
        assertTrue(superPlane.isRidden == true);
        assertTrue(superPlane.operating == true);
        assertTrue(testPilot.getName() == "woooooo");

    }

    @Test
    public void operate() {
        superPlane.operate(testPilot);
        assertTrue(superPlane.operating == true);
    }

    @Test
    public void fertilize() {
        Farm testFarm = new Farm();
        Farmer testFarmer = new Farmer("Froilan");
        testFarm.fieldSetup();
        testFarmer.plantCrop(new Corn(), testFarm.getCropRowFromField("Corn"));
        CropRow corn = testFarm.getField().get("Corn");

        superPlane.fly(testPilot);
        superPlane.fertilize(corn);

        assertTrue(testFarm.getCropRowFromField("Corn").getCropFromRow(0).isHasBeenFertilized());
    }
}