package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.Persons.Pilot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Farmhouse {
    TreeMap<String, Person> residents = new TreeMap<String, Person>();
    HashMap<String, ArrayList<Edible>> fridge= new HashMap<String, ArrayList<Edible>>();
    Person froilan= new Farmer("Froilan");
    Person froilanda= new Pilot("Froilanda");
    public Farmhouse() {


        fridge.put("Eggs", new ArrayList<Edible>());
        fridge.put("Corn", new ArrayList<Edible>());
        fridge.put("Cucumbers", new ArrayList<Edible>());
        fridge.put("SoyBeans", new ArrayList<Edible>());
        fridge.put("Tomatoes", new ArrayList<Edible>());
        fridge.put("Potatoes", new ArrayList<Edible>());

        residents.put("Froilan", froilan);
        residents.put("Froilanda", froilanda);
    }

    public Person getPerson(String name){
        return residents.get(name);
    }

    public void setPerson(String name, Person p){
        residents.put(name, p);
    }

    public void removePerson(String name){
        residents.remove(name);
    }

    public Edible getEdible(String name){
        return fridge.get(name);
    }

    public void setEdible(String name, Person p){
        fridge.put(name, p);
    }

    public void removeEdible(String name){
        fridge.remove(name);
    }



}
