package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Farm.Stable;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {
    Pilot testPilot = new Pilot("The Vulture");

    @Test
    public void fly() {
        CropDuster testDuster = new CropDuster();
        testPilot.fly(testDuster);
        assertTrue(testPilot.isFlying());
    }

    @Test
    public void stopFlying() {
        CropDuster testDuster = new CropDuster();
        testPilot.fly(testDuster);
        testPilot.stopFlying(testDuster);
        assertTrue(testPilot.isFlying() == false);
    }

//    @Test
//    public void ride() {
//
//    }
//
//    @Test
//    public void getOutOfRide() {
//    }

    @Test
    public void makeNoise() {
        assertTrue(testPilot.makeNoise() == "To The Big Blue Yonder!");
    }

    @Test
    public void mount() {
        Stable testStable = new Stable("HorseTown");
        Horse testHorse = new Horse("Mr. Ed", testStable);
        testPilot.mount(testHorse);
        assertTrue(testPilot.isMounted());
    }

    @Test
    public void dismount() {
        Stable testStable = new Stable("HorseTown");
        Horse testHorse = new Horse("Mr. Ed", testStable);
        testPilot.mount(testHorse);
        testPilot.dismount(testHorse);
        assertTrue(testPilot.isMounted() == false);
    }
}