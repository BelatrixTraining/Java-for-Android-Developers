package com.bx.java.samples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pjohnson on 4/01/17.
 */
public class Main {
    public static void main(String[] args) {
        List<Trabajador> trabajadores = new ArrayList<>();
        TrabajadorCocina trabajadorCocina = new TrabajadorCocina();
        TrabajadorLimpieza trabajadorLimpieza = new TrabajadorLimpieza();
        trabajadores.add(trabajadorCocina);
        trabajadores.add(trabajadorLimpieza);

        //for (int i=0; i<trabajadores.size(); i++)
        for (Trabajador trabajador : trabajadores) {
            System.out.println(trabajador.trabajar());
        }
    }
}
