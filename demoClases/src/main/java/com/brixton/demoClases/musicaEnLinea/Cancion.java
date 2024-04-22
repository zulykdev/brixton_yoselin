package com.brixton.demoClases.musicaEnLinea;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cancion {
    private int cancionId;
    private String titulo;
    private double duracion;
    private Album albumDondePertenece;
    private Artista artistaAlQuePertenece;

    public void reproducir() {

    }
}
