package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.ArrayList;

public class CropRow {
  Crop crop;
  Crop[] cropRow;
  String name;
    public CropRow(Crop crop) {
        this.name = crop.toString();
        this.crop = crop;
        this.cropRow = new Crop[15];
    }

    public Crop[] getCropRow() {
        return cropRow;
    }

    public Crop getCropFromRow(int i ) {return cropRow[i];}

    public int getCropRowSize(){
        return cropRow.length;
    }

    public void setCropRow(Crop[] cropRow) {
        this.cropRow = cropRow;
    }

    public int cropRowSize(){ return cropRow.length;}

    public void plantCrop(Crop crop){
        for(int i = 0; i < 15; i++) {
            cropRow[i] = crop;
        }
    }
}
