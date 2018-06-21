package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;
import java.util.TreeMap;

public class Farm {
    Farmhouse saison = new Farmhouse();
    TreeMap<Crop, CropRow> field = new TreeMap<Crop, CropRow>();
    ArrayList<Stable> horseyFarm = new ArrayList<Stable>();
    ArrayList<Coop> chickenCity = new ArrayList<Coop>();

    public Farmhouse getSaison() {
        return saison;
    }

    public TreeMap<Crop, CropRow> getField() {
        return field;
    }

    public void setField(TreeMap<Crop, CropRow> field) {
        this.field = field;
    }

    public ArrayList<Stable> getHorseyFarm() {
        return horseyFarm;
    }

    public void setHorseyFarm(ArrayList<Stable> horseyFarm) {
        this.horseyFarm = horseyFarm;
    }

    public ArrayList<Coop> getChickenCity() {
        return chickenCity;
    }

    public void setChickenCity(ArrayList<Coop> chickenCity) {
        this.chickenCity = chickenCity;
    }
}
