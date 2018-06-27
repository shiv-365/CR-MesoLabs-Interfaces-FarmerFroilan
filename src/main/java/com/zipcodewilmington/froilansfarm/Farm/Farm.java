package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Persons.Farmer;
import com.zipcodewilmington.froilansfarm.Persons.Person;
import com.zipcodewilmington.froilansfarm.crops.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Farm {

    Farmhouse saison = new Farmhouse();
    TreeMap<String, CropRow> field = new TreeMap<String, CropRow>();
    TreeMap<String ,Stable> horseyFarm = new TreeMap<>();
    TreeMap<String ,Coop> chickenCity = new TreeMap<>();

    public Farmhouse getSaison() {
        return saison;
    }

    public TreeMap<String, CropRow> getField() {
        return field;
    }

    public Person getFarmer(){
            return saison.froilan;
    }

    public void setField(TreeMap<String, CropRow> field) {
        this.field = field;
    }

    public TreeMap<String ,Stable> getHorseyFarm() {
        return horseyFarm;
    }

    public TreeMap<String ,Coop> getChickenCity() {
        return chickenCity;
    }

    public Coop getCoop (String coopName) {
        return chickenCity.get(coopName);
    }

    public Stable getStable (String stableName) {
        return horseyFarm.get(stableName);
    }

    public void addCoop(Coop coop) {
        chickenCity.put(coop.getName(), coop);
    }

    public void addStable(Stable stable) {
        horseyFarm.put(stable.getName(), stable);
    }

    public void fieldSetup() {
        field.put("Corn" , new CropRow(new Corn()));
        field.put("Tomato" , new CropRow(new Tomato()));
        field.put("Potato" , new CropRow(new Potato()));
        field.put("Cucumber" , new CropRow(new Cucumber()));
        field.put("Soy Bean" , new CropRow(new SoyBean()));
    }

    public CropRow getCropRowFromField(String cropName){
        return field.get(cropName);
    }
}
