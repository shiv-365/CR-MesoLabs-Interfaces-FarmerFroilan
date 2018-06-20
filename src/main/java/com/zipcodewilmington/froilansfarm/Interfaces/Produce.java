package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public interface Produce {
    Object yield(Edible e);
    void fertilized();
}
