package com.brixton.demoClases.musicaEnLinea;

public class Cancion {
    private int cancionId;
    private String titulo;
    private int duracion;
    private Album albumDondePertenece;
    private Artista artistaAlQuePertenece;

    public void reproducir() {
        System.out.println("Reproduciendo " + titulo);
    }
}
