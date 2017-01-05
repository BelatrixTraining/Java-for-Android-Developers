package com.bx.java.samples.decorator;

/**
 * Created by eduardomedina on 5/01/17.
 */
public class Frappuccino extends Bebida {

    public Frappuccino() {
        desc= "Bebida Frappuccino";
    }

    @Override
    public double cost() {
        return 12.00;
    }
}
