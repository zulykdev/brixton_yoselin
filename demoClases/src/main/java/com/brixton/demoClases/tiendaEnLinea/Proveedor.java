package com.brixton.demoClases.tiendaEnLinea;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Proveedor {

    private String nombreProveedor;
    private String descripcionEmpresa;
    private List<Producto> productoNovedoso;
    private double precioPorMayor;
    private double precioPorUnidad;


    private double descuentoPorMayor(List<Producto> productoVenta){
        return 0.0;
    }

}
