package com.brixton.demoClases.tiendaEnLinea;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Categoria {

    private List<String> listaCategoria;
    private List<Producto> listaProducto;

    public List<Categoria> productoPorCategoria(List<String> listaCategoria){

        return new ArrayList<>();
    }
}
