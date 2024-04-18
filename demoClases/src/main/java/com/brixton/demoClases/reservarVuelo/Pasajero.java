package com.brixton.demoClases.reservarVuelo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pasajero {
    private String nombre;
    private String apellido;
    private DocumentoDeIdentificacion DocIdentificacion;
    private String email;
    private Aerolinea empresa;

    public void reservaVuelo(DocumentoDeIdentificacion identificacion, String email){

    }
}
