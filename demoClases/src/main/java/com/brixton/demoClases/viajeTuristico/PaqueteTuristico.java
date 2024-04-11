package com.brixton.demoClases.viajeTuristico;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class PaqueteTuristico {

    private String descripcion;
    private int diasDeViaje;
    private double precio;
    private List<String> listaLugarTuristico;


    public void buscarPaquetes(int diasViaje,List<String> listaLugarTuristico ,
                            double precio){

    }

    public void elegirLugaresTuristicos(){

    }
}
