package com.bx.java.samples.isp;

/**
 * Created by pjohnson on 9/01/17.
 */
public class Cubo implements FiguraPlana, FiguraSolida{

    private final double lado;

    public Cubo(double lado){
        this.lado=lado;
    }
    
    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularVolumen() {
        return 0;
    }
}
