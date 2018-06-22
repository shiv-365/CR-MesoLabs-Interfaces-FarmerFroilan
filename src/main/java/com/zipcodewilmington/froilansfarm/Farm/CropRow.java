package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;

public class CropRow {

  Crop[] cropRow;

    public CropRow() {
        this.cropRow = new Crop[15];
    }

    public Crop[] getCropRow() {
        return cropRow;
    }

    public void setCropRow(Crop[] cropRow) {
        this.cropRow = cropRow;
    }

//    public void plantCrop(Crop crop){
//        for(int i = 0; i < 15; i++) {
//            cropRow[i] = crop;
//        }
//    }
}
