package com.brixton.demoClases.biblioteca;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Autor {
    private String id;
    private String nombre;
    private String apellido;
    private List<Libro> relatedBock;
}
