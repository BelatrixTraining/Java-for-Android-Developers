package com.bx.java.samples.ocp;

/**
 * Created by pjohnson on 9/01/17.
 */
public class Triangulo implements Figura {

    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }
}
