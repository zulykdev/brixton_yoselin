package com.brixton.demoClases.juegoDePregunta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Respuesta {
    private int respuestaId;
    private Jugador codigoJugador;
    private String respuestaElegida;
    private int puntajeObtenido;

    public void evaluarRespuesta(String respuestaCorrecta, int puntaje ){

    }


}
