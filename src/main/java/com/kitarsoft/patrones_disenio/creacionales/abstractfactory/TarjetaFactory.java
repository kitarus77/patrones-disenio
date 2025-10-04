package com.kitarsoft.patrones_disenio.creacionales.abstractfactory;

import com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod.Pago;
import com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod.PagoTarjeta;
import com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod.Reembolso;
import com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod.ReembolsoTarjeta;

public class TarjetaFactory implements PagoFactory{
    @Override
    public Pago crearPago() {
        return new PagoTarjeta();
    }

    @Override
    public Reembolso crearReembolso() {
        return new ReembolsoTarjeta();
    }
}
