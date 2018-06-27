package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class SoyBean extends Crop {
    public SoyBean yield() {
        SoyBean soyBean = new SoyBean();
        return soyBean;
    }

    public boolean isEdible() {
        return false;
    }

}
