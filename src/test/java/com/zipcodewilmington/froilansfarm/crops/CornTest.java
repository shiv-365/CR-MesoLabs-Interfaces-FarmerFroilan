package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornTest {
    Corn test = new Corn();
    @Test
    public void yield() {
        test.fertilized();
        Corn babyCorn = test.yield();
        assertTrue(test != babyCorn);
    }

    @Test
    public void isEdible() {
        assertTrue(test instanceof Edible);
    }
}