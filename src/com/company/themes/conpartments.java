package com.company.themes;

import com.company.RuntimeMechanics;

public class conpartments {
    public static int ranNum;
    public void rusticCity(){
        String[] randomCompartment = {"Random compartment 1", "Random compartment 1", "Random compartment 1", "Random compartment 1"};
        System.out.println(randomCompartment[RuntimeMechanics.randomNumber(4)]);
    }
}
