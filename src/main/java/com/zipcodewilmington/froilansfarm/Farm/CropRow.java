package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;

public class CropRow {

  ArrayList<Crop> cropRow;

    public CropRow(ArrayList<Crop> cropRow) {
        this.cropRow = cropRow;
    }

    public ArrayList<Crop> getCropRow() {
        return cropRow;
    }

    public void setCropRow(ArrayList<Crop> cropRow) {
        this.cropRow = cropRow;
    }


}
