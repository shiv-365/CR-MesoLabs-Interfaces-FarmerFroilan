package com.zipcodewilmington.froilansfarm.Animals;

import org.junit.Test;

import static org.junit.Assert.*;

public class EggTest {
    Egg testEgg = new Egg();

    @Test
    public void isEdible() {
        assertTrue(testEgg.isEdible());
    }
}