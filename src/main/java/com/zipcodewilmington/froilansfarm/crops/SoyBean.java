package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class SoyBean extends Crop {
    public Edible yield() {
        Edible soyBean = new SoyBean();
        return soyBean;
    }

    public boolean isEdible() {
        return false;
    }


    public Object yield(Edible e) {
        return null;
    }
}
