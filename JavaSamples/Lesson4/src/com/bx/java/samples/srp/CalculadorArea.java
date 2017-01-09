package com.bx.java.samples.srp;

import java.util.List;

/**
 * Created by pjohnson on 9/01/17.
 */
public class CalculadorArea {

    private List<Figura> figuras;

    public CalculadorArea(List<Figura> figuras) {
        this.figuras = figuras;
    }

    public double sumarAreas() {
        return 0;
    }

    public void output() {
        System.out.println("La suma total de todas las áreas es: " + sumarAreas());
    }
}
