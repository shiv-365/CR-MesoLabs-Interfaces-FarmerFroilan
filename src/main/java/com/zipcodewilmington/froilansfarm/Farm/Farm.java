package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;
import java.util.TreeMap;

public class Farm {
    Farmhouse saison = new Farmhouse();
    TreeMap<Crop, CropRow> field = new TreeMap<Crop, CropRow>();
    ArrayList<stable> horseyFarm = new ArrayList<stable>();
    ArrayList<chickenCoop> chickenCity = new ArrayList<chickenCoop>();

}
