package com.kitarsoft.patrones_disenio.creacionales.abstractfactory;

import com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod.Pago;
import com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod.PagoPaypal;
import com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod.Reembolso;
import com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod.ReembolsoPaypal;

public class PaypalFactory implements PagoFactory{
    @Override
    public Pago crearPago() {
        return new PagoPaypal();
    }

    @Override
    public Reembolso crearReembolso() {
        return new ReembolsoPaypal();
    }
}
