package com.brixton.demoClases.biblioteca;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Prestamo {
    //LocalDate -> fecha
    //LocalDateTime -> fecha y hora
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Usuario usuarioOperacion;
    private Usuario bibliotecario;
    private List<Libro> libros;

    public void agregarLibro(Libro libro){
        //operacion para pretar libro
    }

    public void retirarLibro(Libro libro){
        // operaciones para
    }

    public void devolverLibro(Libro libro){

    }
    public void banearUsuario(){

    }
}
