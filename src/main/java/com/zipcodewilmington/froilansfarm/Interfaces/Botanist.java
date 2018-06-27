package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Farm.CropRow;
import com.zipcodewilmington.froilansfarm.crops.Crop;

public interface Botanist {
    void plantCrop(Crop crop, CropRow cropRow);
}
