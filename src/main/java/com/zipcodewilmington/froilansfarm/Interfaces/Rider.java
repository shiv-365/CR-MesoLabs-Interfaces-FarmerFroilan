package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Rider {
    void mount(Rideable r);
    void dismount(Rideable r);
    void ride(Rideable r);
    void getOutOfRide(Rideable r);
}
