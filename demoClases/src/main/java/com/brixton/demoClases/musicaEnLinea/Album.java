package com.brixton.demoClases.musicaEnLinea;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
public class Album {
    private String titulo;
    private LocalDate año;
    private Artista artista;
    private List<Cancion> canciones;

    // Constructor, Getters y Setters

    // Método para agregar una canción al álbum
    public void agregarCancion(Cancion cancion) {

    }
}
