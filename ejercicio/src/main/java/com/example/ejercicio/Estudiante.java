package com.example.ejercicio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Estudiante {

    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad){
        setNombre(nombre);
        setEdad(edad);

    }
}
