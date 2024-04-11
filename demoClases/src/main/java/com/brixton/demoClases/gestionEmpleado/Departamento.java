package com.brixton.demoClases.gestionEmpleado;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Departamento {
    private List<Requisito> listaRequisitos;
    private List<Empleado> personal;
    private String codigo;
    private Empleado jefe;

    public void incluirPersonal(Empleado empleadoNuevo){
    }
    public void personalEnRetiro(Empleado empleadoRetirar){
    }
    public void rotarPersonal(Empleado personalSalida, Empleado personalEntrante){
    }
    public void iniciarEvaluacion360(){
    }



}
