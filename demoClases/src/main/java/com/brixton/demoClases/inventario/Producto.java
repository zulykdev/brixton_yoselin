package com.brixton.demoClases.inventario;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
public class Producto {
    private String nombre;
    private String codigo;
    private Categoria categoria;
    private LocalDate fechaVencimiento;
    private int stock;


}
