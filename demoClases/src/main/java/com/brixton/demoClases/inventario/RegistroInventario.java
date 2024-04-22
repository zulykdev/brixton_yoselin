package com.brixton.demoClases.inventario;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class RegistroInventario {

    private LocalDate fecha;
    private TipoMovimiento movimiento;
    private Producto producto;
    private int cantidad;
    private Proveedor proveedor;

    public void agregarProducto(Producto producto, Categoria categoria){

    }

    public void asociarProductoProveedor(Producto producto){

    }


}
