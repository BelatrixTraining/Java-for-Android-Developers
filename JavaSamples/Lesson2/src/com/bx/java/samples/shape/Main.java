package com.bx.java.samples.shape;

/**
 * Created by pjohnson on 4/01/17.
 */
public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(10, 5);
        Rectangulo rectangulo = new Rectangulo(10, 20);

        triangulo.unMetodoMas();

        System.out.println("El area del triangulo es " + triangulo.calcularArea());
        System.out.println("El area del rectangulo es " + rectangulo.calcularArea());
    }
}
