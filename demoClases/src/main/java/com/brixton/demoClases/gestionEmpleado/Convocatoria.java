package com.brixton.demoClases.gestionEmpleado;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Convocatoria {
    private Departamento solicitante;
    private double salarioMaximo;
    private String especialidad;
    private List<Requisito> requisitos;
}
