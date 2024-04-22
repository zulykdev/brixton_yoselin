package com.brixton.demoClases.musicaEnLinea;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Usuario {
    private String Password;
    private String email;
    private String nombreUsuario;
    private List<ListaReproduccion> listaReproduccion;

    public List<Cancion> crearListaReproduccion(Cancion musicaSelecionada, Artista artistaSeleccionado) {

        return new ArrayList<>();
    }

}
