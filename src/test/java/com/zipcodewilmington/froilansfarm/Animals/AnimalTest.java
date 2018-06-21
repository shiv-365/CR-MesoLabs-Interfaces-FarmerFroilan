package com.zipcodewilmington.froilansfarm.Animals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AnimalTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    Animal testAnimal = new Horse("Mr. Ed");
    Object[] goodFood = new Object[]{new Egg()};
    Object[] badFood = new Object[]{new Object()};


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void eat() {
        testAnimal.eat(goodFood);
        assertEquals(outContent.toString(),"NOM NOM NOM");
    }

    @Test
    public void eat1() {
        testAnimal.eat(badFood);
        assertEquals(outContent.toString(),"THIS IS NOT FOOD!");
    }
}