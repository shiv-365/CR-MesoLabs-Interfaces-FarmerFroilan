package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import static org.junit.jupiter.api.Assertions.*;

class CoopTest {



    @org.junit.jupiter.api.Test
    public void testgetChicken() {
        Coop c = new Coop("thecoop");
        Chicken c1 = new Chicken("billy");
        Chicken c2 = new Chicken("booby");
        //c.setName(c1.getName());
        c.addChicken(c1);
        c.addChicken(c2);

        //String name = "booby";
        String actual = c2.getNameChicken();
        String expected = "booby";
        assertEquals(expected,actual);





    }

    @org.junit.jupiter.api.Test
    public void testaddChicken() {
        Coop c = new Coop("billy1");


    }

}