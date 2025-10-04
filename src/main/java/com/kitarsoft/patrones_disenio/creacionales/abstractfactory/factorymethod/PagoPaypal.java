package com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod;

public class PagoPaypal implements Pago{
    @Override
    public void procesar() {
        System.out.println("Pago con Paypal");
    }
}
