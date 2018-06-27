package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomatoTest {

    Tomato test = new Tomato();
    @Test
    public void yield() {
        test.fertilized();
        Tomato babyTomato = test.yield();
        assertTrue(test != babyTomato);
    }

    @Test
    public void isEdible() {
        assertTrue(test instanceof Edible);
    }
}