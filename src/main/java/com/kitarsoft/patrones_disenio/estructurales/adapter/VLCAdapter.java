package com.kitarsoft.patrones_disenio.estructurales.adapter;

import org.springframework.stereotype.Component;

// Creamos este adapter para poder implementar la interfaz MediaPlayer y llamar al reproductor VLC
@Component
public class VLCAdapter implements MediaPlayer{

    private final ReproductorVLC reproductorVLC;

    public VLCAdapter(ReproductorVLC reproductorVLC) {
        this.reproductorVLC = reproductorVLC;
    }

    @Override
    public void reproducir(String archivo) {
        this.reproductorVLC.reproducirVLC(archivo);
    }
}
