package com.brixton.demoClases.biblioteca;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Autor {
    private String id;
    private String nombre;
    private String apellido;
    private List<Libro> relatedBock;

    public Autor(){

    }
    public Autor(String numeracion, String nombre, String apellido, List<Libro> libros ){
        setId(numeracion);
        setNombre(nombre);
        setApellido(apellido);
        setRelatedBock(libros);
    }
}
