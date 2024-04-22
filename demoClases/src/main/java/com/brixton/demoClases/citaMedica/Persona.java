package com.brixton.demoClases.citaMedica;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Persona {
    private String nombre;
    private String apellido;
    private DocumentoIdentificacion identificacion;

}
