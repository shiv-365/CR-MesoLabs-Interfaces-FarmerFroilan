package com.zipcodewilmington.froilansfarm.Farm;

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
    HashMap<String, ArrayList<Object>> fridge= new HashMap<String, ArrayList<Object>>();
    Person froilan= new Farmer("Froilan");
    Person froilanda= new Pilot("Froilanda");
    public Farmhouse() {


        fridge.put("Eggs", new ArrayList<Object>());
        fridge.put("Corn", new ArrayList<Object>());
        fridge.put("Cucumbers", new ArrayList<Object>());
        fridge.put("SoyBeans", new ArrayList<Object>());
        fridge.put("Tomatoes", new ArrayList<Object>());
        fridge.put("Potatoes", new ArrayList<Object>());

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

    public Object getEdible(String name, int numberOf){
        ArrayList<Object> tempFood = fridge.get(name);
        Object[] eatMe = new Object[numberOf];
        for(int i = 0; i < numberOf; i++) {
           eatMe[i] = tempFood.get(i);
           tempFood.remove(i);
       }

        return eatMe;
    }

    public void setEdible(String name, Object o){
        ArrayList<Object> tempFood = fridge.get(name);
        tempFood.add(o);
    }

    public void removeEdible(String name){
        fridge.remove(name);
    }



}