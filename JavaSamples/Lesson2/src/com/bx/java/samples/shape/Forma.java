package com.bx.java.samples.shape;

/**
 * Created by pjohnson on 4/01/17.
 */
public abstract class Forma {

    protected double ancho;
    protected double alto;

    public Forma(double ancho, double alto)  {
        this.ancho = ancho;
        this.alto = alto;
    }

    public abstract double calcularArea();
}
