package com.bx.java.samples.dip;

/**
 * Created by pjohnson on 9/01/17.
 */
public class Main {
    public static void main(String[] args) {
        CarritoCompras carritoCompras = new CarritoCompras(new BaseDatosServidor(), new PagoEfectivo());
        carritoCompras.comprar(new Compra());
    }
}
