package com.kitarsoft.patrones_disenio.creacionales.factorymethod;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factory-method")
public class FactoryMethodController {

    private final PagoFactory pagoFactory;

    public FactoryMethodController(PagoFactory pagoFactory) {
        this.pagoFactory = pagoFactory;
    }

    // Desde el navegador poner la URL: http://localhost:8080/factory-method?tipo=paypal
    // o http://localhost:8080/factory-method?tipo=tarjeta
    // Probar con un tipo no soportado, por ejemplo: http://localhost:8080/factory-method?tipo=bitcoin
    @GetMapping
    public String procesarPago(@RequestParam("tipo") String tipo) {
        Pago pago = pagoFactory.crearPago(tipo);
        pago.procesarPago();
        return "Pago procesado con " + tipo;
    }
}
