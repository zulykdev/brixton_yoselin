package com.brixton.demoClases.musicaEnLinea;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Usuario {
    private String Password;
    private String email;
    private String nombreUsuario;
    private List<ListaReproduccion> listaReproduccion;

    public List<Cancion> crearListaReproduccion(Cancion musicaSelecionada, Artista artistaSeleccionado) {

        return new ArrayList<>();
    }

}
