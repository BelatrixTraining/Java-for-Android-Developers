package com.bx.java.samples.lsp;

/**
 * Created by pjohnson on 9/01/17.
 */
public class Rectangulo {
    protected final double ancho;
    protected final double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public double calcularArea() {
        return ancho * alto;
    }
}
