package com.bx.java.samples.shape;

/**
 * Created by pjohnson on 4/01/17.
 */
public class Triangulo extends Forma {

    public void unMetodoMas(){

    }

    public Triangulo(double ancho, double alto) {
        super(ancho, alto);
    }

    public double calcularArea() {
        return ancho * alto / 2;
    }
}
