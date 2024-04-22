package com.brixton.demoClases.ajedrez;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Juego {

    private Jugador ganador;
    private Tablero tablero;
    private Pieza pieza;

}
