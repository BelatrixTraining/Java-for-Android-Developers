package com.bx.java.samples.isp;



/**
 * Created by pjohnson on 9/01/17.
 */
public class Cuadrado implements FiguraPlana {

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
}
