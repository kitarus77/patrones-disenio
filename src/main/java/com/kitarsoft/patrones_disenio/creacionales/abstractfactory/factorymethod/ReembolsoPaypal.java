package com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod;

public class ReembolsoPaypal implements Reembolso{
    @Override
    public void procesar() {
        System.out.println("Reembolso con Paypal emitido");
    }
}
