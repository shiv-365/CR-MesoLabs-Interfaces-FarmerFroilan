package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;
import com.zipcodewilmington.froilansfarm.crops.Corn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Farmhouse {
    ArrayList<Person> residents = new ArrayList<Person>();
    HashMap<String, Integer> fridge = new HashMap<String, Integer>();
    Person froilan = new Farmer("Froilan");
    Person froilanda = new Pilot("Froilanda");

    public Farmhouse() {


        fridge.put("Eggs", 0);
        fridge.put("Corn", 0);
        fridge.put("Cucumbers", 0);
        fridge.put("SoyBeans", 0);
        fridge.put("Tomatoes", 0);
        fridge.put("Potatoes", 0);

        residents.add(froilan);
        residents.add(froilanda);
    }

    public Person getPerson(int idx) {
        return residents.get(idx);
    }

    public void setPerson(Person p) {
        residents.add(p);
    }

    public int getResidentSize() {
        return residents.size();
    }

    public void removePerson(Person p) {
        residents.remove(p);
    }


    public int getQuantity(String name) {
        return fridge.get(name);

    }

    public void addEdible(String name, int amount) {
        fridge.replace(name, getQuantity(name) + amount);
    }

    public void getEdible(String name, int amount) {
        if (getQuantity(name) >= amount) {
            fridge.replace(name, (getQuantity(name) - amount));
        } else {
            System.out.println("Not enough available, you only have " + getQuantity(name) + " " + name + " available!");
        }
    }


}
