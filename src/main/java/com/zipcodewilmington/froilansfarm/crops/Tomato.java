package com.zipcodewilmington.froilansfarm.crops;

public class Tomato extends Crop {
    public void Edible<E> yield() {
        Edible tomato = (Edible) new Tomato();
    }
}
