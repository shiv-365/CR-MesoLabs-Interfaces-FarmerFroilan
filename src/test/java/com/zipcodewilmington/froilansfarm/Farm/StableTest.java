package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import org.junit.Test;

import static org.junit.Assert.*;

public class StableTest {

    Stable test = new Stable("Horsey Town");
    Horse horse1 = new Horse("Mr. Ed", test);
    Horse horse2 = new Horse("SeaBiscuit", test);

    @Test
    public void getAddHorse() {
        test.addHorse(horse1);
        test.addHorse(horse2);
        Horse proofOfConcept = test.getHorse("Mr. Ed");
        assertTrue(proofOfConcept.equals(horse1));
    }

    @Test
    public void setGetName() {
        test.setName("New Horse Town");
        assertTrue(test.getName() == "New Horse Town");
    }
}