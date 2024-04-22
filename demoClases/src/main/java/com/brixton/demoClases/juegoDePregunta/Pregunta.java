package com.brixton.demoClases.juegoDePregunta;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Pregunta {
    private int preguntaId;
    private String textoPregunta;
    private List<Respuesta> opcionesDeRespuesta;
    private Respuesta respuestaCorrecta;
    private Respuesta respuestaElegida;
    private double puntaje;
    private Categoria categoria;






}
