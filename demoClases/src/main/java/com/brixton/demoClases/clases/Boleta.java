package com.brixton.demoClases.clases;
// lOMBOK ES PARA REDUCIR CODIGO
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//ANOTACIONES VAN CON @.....
@Setter
@Getter
public class Boleta {


    private String rucEmisor;
    private String nombreEmpresaEmisor;
    private String nroSerie;
    private String nroBoleta;
    private Client cliente;
    private List<LineaVenta> lineas;
    private double montoTotal;



}

