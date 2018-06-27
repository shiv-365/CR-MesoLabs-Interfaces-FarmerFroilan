package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoopTest {
    Coop test = new Coop("Chicken City");
    Chicken chicken1 = new Chicken("Chicken 1", test);
    Chicken chicken2 = new Chicken("Chicken 2", test);


    @Test
    public void getChicken() {
        test.addChicken(chicken1);
        test.addChicken(chicken2);
        Chicken tester = test.getChicken("Chicken 1");
        assertTrue(tester == chicken1);
    }

    @Test
    public void setGetName() {
        test.setName("NEW CHICKEN CITY");
        assertTrue(test.getName() == "NEW CHICKEN CITY");
    }

}