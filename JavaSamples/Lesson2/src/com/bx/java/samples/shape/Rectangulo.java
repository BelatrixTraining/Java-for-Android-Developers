package com.bx.java.samples.shape;

/**
 * Created by pjohnson on 4/01/17.
 */
public class Rectangulo extends Forma {

    public Rectangulo(double ancho, double alto) {
        super(ancho, alto);
    }

    public double calcularArea() {
        return ancho * alto;
    }
}