package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Test;

import static org.junit.Assert.*;

public class SoyBeanTest {

    SoyBean test = new SoyBean();
    @Test
    public void yield() {
        test.fertilized();
        SoyBean babySoy = test.yield();
        assertTrue(test != babySoy);
    }

    @Test
    public void isEdible() {
        assertTrue(test instanceof Edible);
    }
}