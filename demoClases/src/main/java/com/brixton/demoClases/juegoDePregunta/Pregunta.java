package com.brixton.demoClases.juegoDePregunta;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Pregunta {
    private int preguntaId;
    private String textoPregunta;
    private List<Respuesta> opcionesDeRespuesta;
    public List<Respuesta> getRespuestaCorrecta(List<Respuesta>opcionesDeRespuesta){

        return new ArrayList<>();
    }
}
