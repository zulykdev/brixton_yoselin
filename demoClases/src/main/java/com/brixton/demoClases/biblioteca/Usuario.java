package com.brixton.demoClases.biblioteca;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Usuario {
    private String id;
    private String categoria;
    private boolean baneado;
    private String userId;
    private String password;
    private List<Libro> libroPrestado;


    /*private String nombre;
    private String documentoIdentidad;
    private String gradoAcademico;
    private String direccion;*/
}
