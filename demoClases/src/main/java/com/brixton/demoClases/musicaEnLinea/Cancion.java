package com.brixton.demoClases.musicaEnLinea;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cancion {
    private int cancionId;
    private String titulo;
    private double duracion;
    private Album albumDondePertenece;
    private Artista artistaAlQuePertenece;

    public void reproducir() {

    }
}
