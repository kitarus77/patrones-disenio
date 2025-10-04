package com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod;

public class PagoTarjeta implements Pago{
    @Override
    public void procesar() {
        System.out.println("Pago con tarjeta");
    }
}
