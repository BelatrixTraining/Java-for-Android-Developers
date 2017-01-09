package com.bx.java.samples.ocp;

import com.bx.java.samples.srp.Circulo;
import com.bx.java.samples.srp.Cuadrado;
import com.bx.java.samples.srp.Figura;

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
            if (figura instanceof Cuadrado) {
                sumaTotal += ((Cuadrado) figura).getLado() * ((Cuadrado) figura).getLado();
            } else if (figura instanceof Circulo) {
                sumaTotal += Math.PI * ((Circulo) figura).getRadio() * ((Circulo) figura).getRadio();
            }
        }
        return sumaTotal;
    }
}
