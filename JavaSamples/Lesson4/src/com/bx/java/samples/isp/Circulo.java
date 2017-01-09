package com.bx.java.samples.isp;


/**
 * Created by pjohnson on 9/01/17.
 */
public class Circulo implements Figura {

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

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularVolumen() {
        //TODO:I dont know what to do =(
        return 0;
    }
}
