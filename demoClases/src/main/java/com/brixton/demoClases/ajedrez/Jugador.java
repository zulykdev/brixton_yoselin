package com.brixton.demoClases.ajedrez;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@ToString
@Slf4j
public class Jugador {

    private String nombreJugador;
    private String color;

    public Jugador(String nombreJugador, String colorEquipo) {
        setNombreJugador(nombreJugador);
        setColor(colorEquipo);
    }

}
