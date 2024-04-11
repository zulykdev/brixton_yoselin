package com.brixton.demoClases.musicaEnLinea;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Artista {
    private String nombreArtista;
    private List<Album> listaAlbum;
    private List<Cancion> listaCancion;

    // Constructor, Getters y Setters

    // Método para agregar un álbum al artista
    public void agregarAlbum(Album album) {

    }
}
