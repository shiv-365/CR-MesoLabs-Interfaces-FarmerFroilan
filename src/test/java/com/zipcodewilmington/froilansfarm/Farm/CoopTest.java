package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import static org.junit.jupiter.api.Assertions.*;

class CoopTest {
    private Coop c = new Coop();

    @org.junit.jupiter.api.Test
    public void getChicken() {
        Chicken c1 = new Chicken("the jokers \"real name\"");

        c.addChicken(c1);
        c.setName("the jokers \"real name\"");
        String actual = c.getName();
        String expected = "the jokers \" real \" name";

        //assertNotNull(c);
        //assertEquals(expected,actual);



    }

    @org.junit.jupiter.api.Test
    public void addChicken() {
        Chicken c1 = new Chicken("joker");
        Chicken c2 = new Chicken("riddler");

        c.addChicken(c1);
        c.addChicken(c2);

        assertNotNull(c);


    }
}