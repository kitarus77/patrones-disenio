package com.kitarsoft.patrones_disenio.estructurales.adapter;

// Implementación existente en mi sistema
public class ReproductorMP3 implements MediaPlayer{
    @Override
    public void reproducir(String archivo) {
        System.out.printf("Reproduciendo MP3: %s%n", archivo);
    }
}
