package com.bx.java.samples.srp;

/**
 * Created by pjohnson on 9/01/17.
 */
public class Cuadrado implements Figura{

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
