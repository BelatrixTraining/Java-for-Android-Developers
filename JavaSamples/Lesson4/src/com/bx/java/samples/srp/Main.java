package com.bx.java.samples.srp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pjohnson on 9/01/17.
 */
public class Main {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        Cuadrado cuadrado = new Cuadrado(5);
        Circulo circulo1 = new Circulo(5);

        List<Figura> figuras = new ArrayList<>();
        figuras.add(circulo);
        figuras.add(cuadrado);
        figuras.add(circulo1);

        CalculadorArea calculadorArea = new CalculadorArea(figuras);
        OutputDataManager outputDataManager = new OutputDataManager(calculadorArea);
        System.out.println(outputDataManager.outputHtml());
        System.out.println(outputDataManager.outputJson());
        System.out.println(outputDataManager.outputXml());
        outputDataManager.outputInConsole();

    }
}