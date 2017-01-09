package com.bx.java.samples.dip;

/**
 * Created by pjohnson on 9/01/17.
 */
public class CarritoCompras {

    public void comprar(Compra compra) {
        BaseDeDatos baseDeDatos = new BaseDeDatos();
        baseDeDatos.guardar(compra);

        TarjetaCredito tarjetaCredito = new TarjetaCredito();
        tarjetaCredito.pagar(compra);

    }
}
