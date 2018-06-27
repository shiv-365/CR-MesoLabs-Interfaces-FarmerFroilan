package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Farm.Coop;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {
    Coop testCoop = new Coop("SUPER CHICKEN TOWN");
    Chicken chickenLittle = new Chicken("Chicken Little", testCoop);

    @Test
    public void makeNoise() {
        String actual = chickenLittle.makeNoise();
        String expected = "Cluck Cluck Cluck";
        assertEquals(expected,actual);
    }

    @Test
    public void yield() {
        Egg testEgg = chickenLittle.yield();
        assertTrue(testEgg instanceof Edible);
    }

    @Test
    public void badEgg(){
        chickenLittle.fertilized();
        assertTrue(chickenLittle.yield() == null);
    }

    @Test
    public void fertilized() {
        chickenLittle.fertilized();
        assertTrue(chickenLittle.isHasBeenFertilized());
    }
}