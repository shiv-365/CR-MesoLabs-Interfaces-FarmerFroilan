package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Test;

import static org.junit.Assert.*;

public class PotatoTest {


    Potato test = new Potato();
    @Test
    public void yield() {
        test.fertilized();
        Potato babyTater = test.yield();
        assertTrue(test != babyTater);
    }

    @Test
    public void isEdible() {
        assertTrue(test instanceof Edible);
    }
}