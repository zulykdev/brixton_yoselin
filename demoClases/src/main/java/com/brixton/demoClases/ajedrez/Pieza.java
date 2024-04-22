package com.brixton.demoClases.ajedrez;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Pieza {
    private String color;
    private String nombre;
    private Posicion ubicacion;
    public Pieza(String color, String nombre, Posicion ubicacion){
        setColor(color);
        setNombre(nombre);
        setUbicacion(ubicacion);
    }


}
