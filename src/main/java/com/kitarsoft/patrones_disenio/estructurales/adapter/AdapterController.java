package com.kitarsoft.patrones_disenio.estructurales.adapter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adapter")
public class AdapterController {

    private final VLCAdapter vlcAdapter;

    public AdapterController(VLCAdapter vlcAdapter) {
        this.vlcAdapter = vlcAdapter;
    }

    // Desde el navegador poner la URL: http://localhost:8080/adapter
    @GetMapping
    public String reproducirVLC() {
        String archivo = "Cancion_1.vlc";
        this.vlcAdapter.reproducir(archivo);
        return String.format("Reproduciendo con VLC la canción %s ...", archivo);
    }
}
