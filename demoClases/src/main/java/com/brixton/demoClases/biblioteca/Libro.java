package com.brixton.demoClases.biblioteca;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Libro {
    private String isbn;
    private Integer cantidadPagina;
    private String genero;
    private String titulo;
    private List<Autor> autores;
    private  Registro codigoRegistro;

}
