package com.zipcodewilmington.froilansfarm.Farm;


import com.zipcodewilmington.froilansfarm.Persons.Person;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

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
    void addEdible() {
        Farmhouse f = new Farmhouse();
        f.addEdible("Corn", 100);
        f.addEdible("Corn", 100);
        int actual = f.getQuantity("Corn");
        int expected = 200;
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void getEdible() {
        Farmhouse f = new Farmhouse();
        f.addEdible("Eggs", 100);
        f.getEdible("Eggs", 50);
        int actual = f.getQuantity("Eggs");
        int expected = 50;
        assertEquals(expected, actual);
    }
}
