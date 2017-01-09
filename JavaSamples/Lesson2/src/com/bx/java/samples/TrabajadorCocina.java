package com.bx.java.samples;

/**
 * Created by pjohnson on 4/01/17.
 */

public class TrabajadorCocina extends Trabajador {

    private String plato;
    private String area;

    public TrabajadorCocina(String nombre) {
        super(nombre);
    }

    public TrabajadorCocina(String nombre, String plato, String area) {
        super(nombre);
        this.plato = plato;
        this.area = area;
    }

    public String getPlato() {
        return plato;
    }

    public void setPlato(String plato) {
        this.plato = plato;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String trabajar() {
        return "Me llamo " + name + " y estoy cocinando " + plato + " !!";
    }
}
