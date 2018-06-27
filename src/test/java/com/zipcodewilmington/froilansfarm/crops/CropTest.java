package com.zipcodewilmington.froilansfarm.crops;

import org.junit.Test;

import static org.junit.Assert.*;

public class CropTest {
    Crop test = new Corn();
    @Test
    public void fertilized() {
        test.fertilized();
        assertTrue(test.hasBeenFertilized);
    }
}