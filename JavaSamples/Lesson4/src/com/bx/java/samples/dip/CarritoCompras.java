package com.bx.java.samples.dip;

/**
 * Created by pjohnson on 9/01/17.
 */
public class CarritoCompras {

    private Persistencia persistencia;
    private MetodoPago metodoPago;

    public CarritoCompras(Persistencia persistencia, MetodoPago metodoPago) {
        this.persistencia = persistencia;
        this.metodoPago = metodoPago;
    }

    public void comprar(Compra compra) {
        persistencia.guardar(compra);
        metodoPago.pagar(compra);
    }
}
