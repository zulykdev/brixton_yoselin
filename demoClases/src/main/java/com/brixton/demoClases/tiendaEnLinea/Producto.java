package com.brixton.demoClases.tiendaEnLinea;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Producto {

    private int productoId;
    private String descripcion;
    private LocalDate fechaRegistro;
    private String nombre;
    private double precio;
    private int stock;

    public void buscarProducto(String nombreProducto){

    }
}
