package com.bx.java.samples.isp;



/**
 * Created by pjohnson on 9/01/17.
 */
public class Cuadrado implements Figura {

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

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularVolumen() {
        //TODO: What do i do here??
        return 0;
    }
}
