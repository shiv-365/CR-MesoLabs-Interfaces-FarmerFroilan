package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import static org.junit.jupiter.api.Assertions.*;

class CoopTest {



    /*@org.junit.jupiter.api.Test
    public void testgetChicken() {
        Coop c = new Coop();
        Chicken c1 = new Chicken("chicken1");
        c.setName("chicken1");
        c.addChicken(c1);
        Chicken actual = c.getChicken();
        Chicken expected = c1;
        assertEquals(expected,actual);

//    }

    @org.junit.jupiter.api.Test
<<<<<<< HEAD
    public void testaddChicken() {
        Coop c = new Coop();


    }*/
=======
    public void addChicken() {
        Chicken c1 = new Chicken("joker");
        Chicken c2 = new Chicken("riddler");

        c.addChicken(c1);
        c.addChicken(c2);

        assertNotNull(c);


    }
>>>>>>> coopstable
}