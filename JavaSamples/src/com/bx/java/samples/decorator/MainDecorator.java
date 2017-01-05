package com.bx.java.samples.decorator;

/**
 * Created by eduardomedina on 5/01/17.
 */
public class MainDecorator {

    public static void main(String[] args) {
        System.out.println("Hello Decorator Pattern");

        Bebida bebida= new Espresso();
        System.out.println(bebida.getDesc()+ " S/. "+bebida.cost());

        Bebida frapuccino= new Frappuccino();
        System.out.println(frapuccino.getDesc()+ " S/. "+frapuccino.cost());

        frapuccino= new Mocha(frapuccino);
        System.out.println(frapuccino.getDesc()+ " S/. "+frapuccino.cost());

    }
}
