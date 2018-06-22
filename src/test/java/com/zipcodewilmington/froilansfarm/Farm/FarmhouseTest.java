package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.crops.Corn;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class FarmhouseTest {

    @org.junit.jupiter.api.Test
    void getPerson() {
        Farmhouse f = new Farmhouse();
        Object actual = f.getPerson(0);
        assertTrue(actual instanceof Person);
    }

    @org.junit.jupiter.api.Test
    void setPerson() {
        Farmhouse f = new Farmhouse();
        Person p = new Person("person1");
        f.setPerson(p);
        Object actual = f.getPerson(2);
        Object expected = p;
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void removePerson() {
        Farmhouse f = new Farmhouse();
        Person p = new Person("person1");
        f.setPerson(p);
        f.removePerson(p);
        int actual = f.getResidentSize();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void getEdible() {
        Farmhouse f = new Farmhouse();

    }

    @org.junit.jupiter.api.Test
    void setEdible() {
        Farmhouse f = new Farmhouse();
        f.setEdible("Corn", new Corn());
        Object actual = f.getEdible("Corn", 0);
        assertTrue(actual instanceof Edible);

    }

    @org.junit.jupiter.api.Test
    void removeEdible() {
    }
}
