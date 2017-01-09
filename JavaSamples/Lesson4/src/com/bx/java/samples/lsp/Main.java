package com.bx.java.samples.lsp;

/**
 * Created by pjohnson on 9/01/17.
 */
public class Main {

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAlto(20);
        rectangulo.setAncho(10);
        if (rectangulo.calcularArea() == 200.0) {
            System.out.println("Bien");
        } else {
            System.out.println("Mal");
        }

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setAlto(20);
        cuadrado.setAncho(10);
        if (cuadrado.calcularArea() == 200.0) {
            System.out.println("Bien");
        } else {
            System.out.println("Mal");
        }
    }
}
