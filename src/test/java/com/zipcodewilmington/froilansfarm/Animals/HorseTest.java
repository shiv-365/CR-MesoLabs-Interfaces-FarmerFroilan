package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Farm.Stable;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {
    Stable testStable = new Stable("HorseyLand");
    Horse testHorse = new Horse("Sea Biscuit", testStable);
    Person testPerson = new Person("Billy");

    @Test
    public void makeNoise() {
        assertTrue(testHorse.makeNoise() == "Nay Nay");
    }

    @Test
    public void ridden() {
        testHorse.ridden(testPerson);
        assertTrue(testHorse.isRidden == true);
    }

    @Test
    public void riderTest(){
        testHorse.ridden(testPerson);
        assertTrue(testHorse.rider.equals(testPerson));
    }

    @Test
    public void notRidden() {
        testHorse.ridden(testPerson);
        testHorse.notRidden();
        assertFalse(testHorse.isRidden == true);
    }
}