package com.brixton.demoClases.gestionEmpleado;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
public class Empleado {

    private Empleado jefeDirecto;
    private String nombre;
    private String apellido;
    private String codigo;
    private LocalDate fechaNacimiento;
    private String gradoAcademico;
    private LocalDate fechaIngreso;
    private Contrato contrato;
    private Departamento departamento;
    private boolean activo;

    public Integer calcularEdad(){
        return 0;
    }

    public Integer tiempoLaboralEnDias(){
        return 0;
    }

}
