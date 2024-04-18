package com.brixton.demoClases.ajedrez;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@Slf4j
public class Jugador {

    private String nombreJugador;
    private String colorEquipo;

    public Jugador(String nombreJugador, String colorEquipo) {
        setNombreJugador(nombreJugador);
        setColorEquipo(colorEquipo);
    }
    public void mostrarInfoJugadores(){
        log.info("Nombre de Jugador: " + getNombreJugador());
        log.info("Color de Piezas: " + getColorEquipo());
    }
}
