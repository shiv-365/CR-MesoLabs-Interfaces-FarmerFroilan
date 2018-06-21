package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import static org.junit.jupiter.api.Assertions.*;

class CoopTest {
    private Coop c = new Coop();

    @org.junit.jupiter.api.Test
    public void getChicken() {
        Chicken c1 = new Chicken("the jokers \"real name\"");
        c.addChicken(c1);
        assertNotNull(c);


    }

    @org.junit.jupiter.api.Test
    public void addChicken() {
    }
}