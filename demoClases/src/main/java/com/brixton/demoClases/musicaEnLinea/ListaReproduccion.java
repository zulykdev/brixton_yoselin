package com.brixton.demoClases.musicaEnLinea;

import com.brixton.demoClases.biblioteca.Usuario;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ListaReproduccion {
    private String nombrelista;
    private Usuario usuario;
    private List<Cancion> cancion;

    public void agregarCancion(Cancion cancion) {

    }
    public void agregarArtista(Artista artistaPreferido){

    }
}
