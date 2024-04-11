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
    private int dificultad;

    public List<Respuesta> getRespuestaCorrecta(){
        return new ArrayList<>();
    }
}
