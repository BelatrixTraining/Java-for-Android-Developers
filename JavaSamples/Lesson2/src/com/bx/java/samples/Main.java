package com.bx.java.samples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pjohnson on 4/01/17.
 */
public class Main {
    public static void main(String[] args) {
        List<Trabajador> trabajadoresLista = new ArrayList<>();
        TrabajadorCocina trabajadorCocina = new TrabajadorCocina("Pablo");
        trabajadorCocina.setPlato("Tacutacu");
        TrabajadorCocina trabajadorCocina2 = new TrabajadorCocina("Eduardo", "asado", "parrilla");
        TrabajadorLimpieza trabajadorLimpieza = new TrabajadorLimpieza("Carlos");
        trabajadoresLista.add(trabajadorCocina);
        trabajadoresLista.add(trabajadorLimpieza);
        trabajadoresLista.add(trabajadorCocina2);
        trabajadorCocina.setName("Alberto");


        //for (int i=0; i<trabajadoresLista.size(); i++){
        // System.out.println(trabajadoresLista.get(i).trabajar());
        //}
        for (Trabajador trabajador : trabajadoresLista) {
            System.out.println(trabajador.trabajar());
        }
    }
}
