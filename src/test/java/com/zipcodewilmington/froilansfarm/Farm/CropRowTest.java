package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.crops.Corn;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropRowTest {

    CropRow testRow = new CropRow();
    Crop[] newTestRow = new Crop[0];

    @Test
    public void getCropRow() {
        testRow.setCropRow(newTestRow);
        assertTrue(testRow.getCropRow() == newTestRow);
    }

    @Test
    public void plantCropTest(){
        Corn testcrop = new Corn();
        testRow.plantCrop(testcrop);
        for(Crop crop: testRow.getCropRow()){
            assertTrue(crop instanceof Corn);
        }
    }
}