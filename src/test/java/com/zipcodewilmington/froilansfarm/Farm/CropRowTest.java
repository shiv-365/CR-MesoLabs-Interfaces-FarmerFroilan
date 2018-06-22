package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropRowTest {

    CropRow testRow = new CropRow();
    Crop[] newTestRow = new Crop[];

    @Test
    public void getCropRow() {
        testRow.setCropRow(newTestRow);
        assertTrue(testRow.getCropRow() == );
    }

    @Test
    public void setCropRow() {
    }
}