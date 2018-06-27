package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Test;

import static org.junit.Assert.*;

public class CucumberTest {

    Cucumber test = new Cucumber();
    @Test
    public void yield() {
        test.fertilized();
        Cucumber babyCuke = test.yield();
        assertTrue(test != babyCuke);
    }

    @Test
    public void isEdible() {
        assertTrue(test instanceof Edible);
    }
}