package com.bx.java.samples.decorator;

/**
 * Created by eduardomedina on 5/01/17.
 */
public abstract class Bebida {

    protected String desc= "Bebida";

    public abstract double cost();


    public String getDesc() {
        return desc;
    }
}
