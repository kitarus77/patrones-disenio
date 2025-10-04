package com.kitarsoft.patrones_disenio.creacionales.factorymethod;

import org.springframework.stereotype.Service;

@Service
public class PagoTarjeta implements Pago{
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con Tarjeta");
    }
}
