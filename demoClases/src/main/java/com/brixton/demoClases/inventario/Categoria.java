package com.brixton.demoClases.inventario;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Categoria {
    private String nombre;
    private List<Producto> productos;
}
