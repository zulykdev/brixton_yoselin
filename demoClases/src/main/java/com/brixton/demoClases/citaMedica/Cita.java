package com.brixton.demoClases.citaMedica;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Cita {
    private LocalDate fecha;
    private Medico medico;
    private Paciente pacente;
    private EstadoCita estado;
}
