package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import org.junit.Test;

import static org.junit.Assert.*;

public class AircraftTest {

    Aircraft test = new CropDuster();
    Pilot testPilot = new Pilot("Ace");

    @Test
    public void makeNoise() {
        test.fly(testPilot);
        assertTrue(test.makeNoise() == "NYRRRRRRRRRRMMMMMMMMMMM");
    }

    @Test
    public void fly() {
        test.fly(testPilot);
        assertTrue(test.flying == true);
    }

    @Test
    public void land() {
        test.fly(testPilot);
        test.land();
        assertTrue(test.flying == false);
    }
}