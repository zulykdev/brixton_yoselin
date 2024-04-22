package com.brixton.demoClases.juegoDePregunta;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Categoria {
    private List<Categoria> categoriaList;
    private List<String> nivelDificultad;


    public String seleccionCategria(List<Categoria> categoriaList,
                                    List<String> nivelDificultad){
        return toString();
    }
}
