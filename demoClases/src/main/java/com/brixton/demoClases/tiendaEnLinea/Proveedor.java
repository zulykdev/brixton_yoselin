package com.brixton.demoClases.tiendaEnLinea;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter

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
