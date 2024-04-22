package com.brixton.demoClases.citaMedica;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Paciente extends Persona {

    private LocalDate fechaNacimiento;
    private String telefono;
    private String email;
    private double peso;
    private double talla;
}
