package com.brixton.demoClases.musicaEnLinea;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Artista {
    private String nombre;
    private List<Album> albums;
    private List<Cancion> cancions;

    // Constructor, Getters y Setters

    // Método para agregar un álbum al artista
    public void agregarAlbum(Album album) {

    }
}
