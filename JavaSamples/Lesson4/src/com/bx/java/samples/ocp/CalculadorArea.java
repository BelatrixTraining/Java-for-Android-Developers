package com.bx.java.samples.ocp;


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
        double sumaTotal = 0;
        for (Figura figura : figuras) {
            sumaTotal += figura.calcularArea();
        }
        return sumaTotal;
    }
}
