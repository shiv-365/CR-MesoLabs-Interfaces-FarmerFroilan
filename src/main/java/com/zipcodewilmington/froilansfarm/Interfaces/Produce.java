package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public interface Produce<E> {
    E yield();
    void fertilized();
}
