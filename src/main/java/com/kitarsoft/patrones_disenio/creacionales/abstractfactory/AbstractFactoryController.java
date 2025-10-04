package com.kitarsoft.patrones_disenio.creacionales.abstractfactory;


import com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod.Pago;
import com.kitarsoft.patrones_disenio.creacionales.abstractfactory.factorymethod.Reembolso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abstract-factory")
public class AbstractFactoryController {

    // Desde el navegador poner la URL: http://localhost:8080/abstract-factory?tipo=tarjeta
    // o http://localhost:8080/abstract-factory?tipo=paypal
    // o http://localhost:8080/abstract-factory?tipo=otro
    @GetMapping
    public String procesarPago(@RequestParam("tipo") String tipo) {
        PagoFactory factory;
        Pago pago;
        Reembolso reembolso;

        switch (tipo.toLowerCase()) {
            case "paypal" -> factory = new PaypalFactory();
            case "tarjeta" -> factory = new TarjetaFactory();
            default -> throw new IllegalArgumentException("Tipo de pago no soportado");
        };
        pago = factory.crearPago();
        pago.procesar();
        reembolso = factory.crearReembolso();
        reembolso.procesar();

        return String.format("Pago realizado con %s", tipo);
    }
}
