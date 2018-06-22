package com.zipcodewilmington.froilansfarm.Animals;

import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {
    Horse testHorse = new Horse("Sea Biscuit");

    @Test
    public void makeNoise() {
        assertTrue(testHorse.makeNoise() == "Nay Nay");
    }

    @Test
    public void ridden() {
        testHorse.ridden();
        assertTrue(testHorse.isRidden == true);
    }

    @Test
    public void notRidden() {

        assertFalse(testHorse.isRidden == true);
    }
}