package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Animals.Egg;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    Person testPerson = new Person("Billy");
    Object[] tastyGoodness = new Object[]{new Egg(), new Egg()};
    Object[] noBueno = new Object[] {1,2,3};

    @Test
    public void getName() {
        assertTrue(testPerson.getName() == "Billy");
    }

    @Test
    public void goodEats() {
        assertTrue(testPerson.eat(tastyGoodness));
    }

    @Test
    public void badEats() {
        assertFalse(testPerson.eat(noBueno));
    }

    @Test
    public void makeNoise() { assertTrue(testPerson.makeNoise() == "I'm Batman");
    }
}