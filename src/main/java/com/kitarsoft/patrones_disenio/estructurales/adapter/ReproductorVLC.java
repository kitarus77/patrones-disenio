package com.kitarsoft.patrones_disenio.estructurales.adapter;

import org.springframework.stereotype.Component;

// Clase existente externa para reproducir VLC y no implementa MediaPlayer
@Component
public class ReproductorVLC {

    public void reproducirVLC(String archivo) {
        System.out.printf("Reproduciendo VLC: %s%n", archivo);
    }
}
