package com.brixton.demoClases.ajedrez;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class Pieza {
    private String color;
    private String nombre;
    private Ubicacion ubicacion;
    public Pieza(String color, String nombre, Ubicacion ubicacion){
        setColor(color);
        setNombre(nombre);
        setUbicacion(ubicacion);
    }
    public void MostrarInfoPieza(){
        log.info("Color de Pieza: " + getColor());
        log.info("Nombre de Pieza: " + getNombre());
        log.info("Ubicación de Pieza: " + getUbicacion());
    }
}
