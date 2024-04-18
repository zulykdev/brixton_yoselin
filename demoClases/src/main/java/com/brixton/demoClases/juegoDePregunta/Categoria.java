package com.brixton.demoClases.juegoDePregunta;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Categoria {
    private List<Categoria> categoriaList;
    private List<String> nivelDificultad;


    public String seleccionCategria(List<Categoria> categoriaList,
                                    List<String> nivelDificultad){
        return toString();
    }
}
