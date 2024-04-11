package com.brixton.demoClases.reservarVuelo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pasajero {
    private String nombre;
    private String apellido;
    private List<String> tipoDocumentoIdentidad;
    private String numerodocumento;
    private String email;

    public void reservaVuelo(String numerodocumento, String email){

    }
}
