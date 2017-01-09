package com.bx.java.samples.lsp;

/**
 * Created by pjohnson on 9/01/17.
 */
public class Cuadrado extends Rectangulo {

    @Override
    public void setAncho(double ancho) {
        this.ancho = ancho;
        this.alto = ancho;
    }

    @Override
    public void setAlto(double alto) {
        this.alto = alto;
        this.ancho = alto;
    }
}
