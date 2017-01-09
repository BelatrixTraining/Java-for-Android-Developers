package com.bx.java.samples.lsp;

/**
 * Created by pjohnson on 9/01/17.
 */
public class Main {

    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(20, 10);
        if (rectangulo.calcularArea() == 200.0) {
            System.out.println("Bien");
        } else {
            System.out.println("Mal");
        }

        Cuadrado cuadrado = new Cuadrado(10);
        if (cuadrado.calcularArea() == 100.0) {
            System.out.println("Bien");
        } else {
            System.out.println("Mal");
        }
    }
}
