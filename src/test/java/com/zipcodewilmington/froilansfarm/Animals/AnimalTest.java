package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Farm.Stable;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
    Stable testStable = new Stable("Test Stable");
    Animal testHorse = new Horse("Mr. Ed", testStable);
    Object[] tastyGoodness = new Object[]{new Egg(), new Egg()};
    Object[] noBueno = new Object[] {1,2,3};


    @Test
    public void goodEats() {
       assertTrue(testHorse.eat(tastyGoodness));
    }

    @Test
    public void badEats() {
        assertFalse(testHorse.eat(noBueno));
    }

    @Test
    public void getName() {
        String expected = "Mr. Ed";
        String actual = testHorse.getName();
        assertEquals(expected,actual);
    }

    @Test
    public void setName() {
        testHorse.setName("SeaBiscuit");
        String expected = "SeaBiscuit";
        String actual = testHorse.getName();
        assertEquals(expected,actual);
    }
}