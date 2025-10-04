package com.kitarsoft.patrones_disenio.creacionales.abstractfactory;

import com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod.Pago;
import com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod.Reembolso;

public interface PagoFactory {
    Pago crearPago();
    Reembolso crearReembolso();
}
