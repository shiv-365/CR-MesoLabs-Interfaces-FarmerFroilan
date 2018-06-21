package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;
import java.util.TreeMap;

public class Farm {
    FarmHouse saison = new FarmHouse();
    TreeMap<Crop, CropRow> field = new TreeMap<Crop, CropRow>();
    ArrayList<stable> horseyFarm = new ArrayList<stable>();
    ArrayList<chickenCoop> chickenCity = new ArrayList<chickenCoop>();

}
