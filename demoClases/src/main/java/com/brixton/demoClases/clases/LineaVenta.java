package com.brixton.demoClases.clases;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LineaVenta {
    private int cantidad;
    private double precio;
    private String nombreProducto;
    private double total;

}
