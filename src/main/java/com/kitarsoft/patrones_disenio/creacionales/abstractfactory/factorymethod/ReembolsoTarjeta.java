package com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod;

public class ReembolsoTarjeta implements Reembolso{
    @Override
    public void procesar() {
        System.out.println("Reembolso con tarjeta emitido");
    }
}
