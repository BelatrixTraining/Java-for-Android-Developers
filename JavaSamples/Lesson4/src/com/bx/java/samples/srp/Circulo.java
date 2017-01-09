package com.bx.java.samples.srp;

/**
 * Created by pjohnson on 9/01/17.
 */
public class Circulo implements Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
