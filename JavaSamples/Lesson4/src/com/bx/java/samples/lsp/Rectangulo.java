package com.bx.java.samples.lsp;

/**
 * Created by pjohnson on 9/01/17.
 */
public class Rectangulo {
    protected double ancho;
    protected double alto;

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }
}
