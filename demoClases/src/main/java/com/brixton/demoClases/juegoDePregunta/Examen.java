package com.brixton.demoClases.juegoDePregunta;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
public class Examen {
    private List<Pregunta> preguntas;
    private Jugador jugador;
    private double puntaje;
    private LocalDate fecha;

}
