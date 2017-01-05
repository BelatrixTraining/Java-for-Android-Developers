package com.bx.java.samples.decorator;

/**
 * Created by eduardomedina on 5/01/17.
 */
public class Mocha extends BebidaDecorator{

    private final  Bebida bebida;

    public Mocha(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public double cost() {

        return 1.50+bebida.cost();
    }

    @Override
    public String getDesc() {
        return bebida.getDesc()+ " Mocha";
    }
}
