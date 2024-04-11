package com.brixton.demoClases.gestionEmpleado;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class Empleado {

    private Empleado jefeDirecto;
    private String nombre;
    private String apellido;
    private String codigo;
    private LocalDate fechaNacimiento;
    private String gradoAcademico;
    private LocalDate fechaIngreso;

    public Integer calcularEdad(){
        return 0;
    }

    public Integer tiempoLaboralEnDias(){
        return 0;
    }

}
