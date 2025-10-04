package com.kitarsoft.patrones_disenio.creacionales.factorymethod;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class PagoFactory {

    private final PagoPaypal pagoPaypal;
    private final PagoTarjeta pagoTarjeta;

    public PagoFactory(PagoPaypal pagoPaypal, PagoTarjeta pagoTarjeta) {
        this.pagoPaypal = pagoPaypal;
        this.pagoTarjeta = pagoTarjeta;
    }

    public Pago crearPago(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "paypal" -> pagoPaypal;
            case "tarjeta" -> pagoTarjeta;
            default -> throw new IllegalArgumentException("Tipo de pago no soportado: " + tipo);
        };
    }

}
