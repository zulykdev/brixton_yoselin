package com.brixton.demoClases.biblioteca;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Libro {
    private String isbn;
    private Integer cantidadPagina;
    private String genero;
    private String titulo;
    private List<Autor> autores;
    private  Registro codigoRegistro;

    public Libro(){

    }



}
