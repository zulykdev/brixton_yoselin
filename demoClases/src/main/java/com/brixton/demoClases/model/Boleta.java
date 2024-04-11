package com.brixton.demoClases.model;

// lOMBOK ES PARA REDUCIR CODIGO
import com.brixton.demoClases.clases.Client;
import com.brixton.demoClases.clases.LineaVenta;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

//ANOTACIONES VAN CON @.....
@Setter
@Getter
public class Boleta {

    //ATRIBUTOS DE LA CLASE
    //ACCESO | TIPO DE DATO | NOMBRE VARIABLE
    /** Aplican a atributos y metodos
     * PUBLIC -  Cualquiera puede utilizar esos metodos
     * private - solo puede usarse por la clase
     * protected - solo puede ser utilizado por la cclase o superclase
     * package (no se espeicfica) - solo puede ser utilizado por el paquete(es por defecto)
     */
    private String rucEmisor;
    private String nombreEmpresaEmisor;
    private String nroSerie;
    private String nroBoleta;
    private Client cliente;
    private List<LineaVenta> lineas;
    private double montoTotal;


    public void imprimir(){
//operacion para imprimir el comprobante
    }
    public void aplicarIGV(){
//
    }
    public void calcularSubTotal(){
// operaciones para calcular el subtotal
    }
    /*public Double getSubTotal(){

    }*/
    public void addProduct(String producto, int cantidad, double precio){

    }





    //set <- Asignacion , siempre son de tipo void
    //[ACCESO]tipo de dato de retorno[nombre metodo] (parentesis)
    //void [nombre metodo] ([parametro])


    //GET <- muestra valor o retorna uno
    //tipo de dato de retorno[nombre metodo] (parentesis)


    //DEFINICION DE VARIABLES
    //Nombre de variable : camelCase
    //DEFINICION DE CLASES: Inicia en mayuscula
    //Sustantivo en singular --> Kardex, CatastroProducto
    //DEFINICION DE NOMBRE METODO: camelcase
    //DEFINICION DE PARAMETROS:camelCase




}


