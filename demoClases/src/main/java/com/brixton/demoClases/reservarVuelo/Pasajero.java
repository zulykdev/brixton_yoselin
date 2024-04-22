package com.brixton.demoClases.reservarVuelo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Pasajero {
    private String nombre;
    private String apellido;
    private TipoDocumento identificacion;
    private String email;
    private Aerolinea empresa;

    public void reservaVuelo(DocumentoDeIdentificacion identificacion, String email){

    }
}
