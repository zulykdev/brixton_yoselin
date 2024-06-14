package com.example.ejercicio;


import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
@ToString
public class ListaNombre {
    public static void main(String[] args) {
        //Ejercicio 1: Imprimir Nombres de Estudiantes

        List<Estudiante> estudiantes = Arrays.asList(new Estudiante("Pepe", 20),
                new Estudiante("Angel", 15),
                new Estudiante("Juan", 25),
                new Estudiante("Ana", 18));

        for (Estudiante nombre : estudiantes) {
            //System.out.println(nombre.getNombre());
            log.info(nombre.getNombre());
        }

        //Buscar Estudiante por Nombre

        String buscarNombre = "juan";
        for (Estudiante nombre : estudiantes) {
            if (nombre.getNombre().equalsIgnoreCase(buscarNombre)) {
                //System.out.println(nombre.getNombre());
                log.info("Nombre encontrado: " + nombre.getNombre());
            }
            if (nombre.getNombre() != buscarNombre) {
                log.info("no encontrado");
            }
        }


        // Contar Estudiantes con Nombre que Contiene una Subcadena (por ejemplo que inicie el nombre con H)
        String filtro = "p";
        int contador = 0;
        for (Estudiante estudiante : estudiantes){

            if (estudiante.getNombre().toLowerCase().startsWith(filtro.toLowerCase())) {
                contador++;
            }

        }
        log.info("Número de estudiantes cuyo nombre comienza con '" + filtro + "': " + contador);


        //Calcular la Edad Promedio de los Estudiantes
        //Para ello, la edad debe ser un atributo del estudiante.

        double suma = 0;
        for( Estudiante edad : estudiantes){
            suma += edad.getEdad();
        }
        double promedio = suma / estudiantes.size();
        log.info("Promedio de edades: " + promedio);


        // Filtrar Estudiantes por Edad, es decir, debe imprimirse los estudiantes que cumplan el filtro.


        int nivel1 = 0;
        int nivel2 = 0;
        int nivel3 = 0;

        for(Estudiante edades: estudiantes){
            int edad = edades.getEdad();
            if (edad > 10 && edad <= 18) {
                nivel1++;
                log.info("Estudiante: " + edades.getNombre() + ", Edad: " + edad);
            } else if (edad > 18 && edad <= 25) {
                nivel2++;
                log.info("Nivel 2 - Estudiante: " + edades.getNombre() + ", Edad: " + edad);
            } else if (edad > 25 && edad <= 35) {
                nivel3++;
                log.info("Nivel 3 - Estudiante: " + edades.getNombre() + ", Edad: " + edad);
            }

        }
        log.info("Número de estudiantes en Nivel 1 (11-18 años): " + nivel1);
        log.info("Número de estudiantes en Nivel 2 (19-25 años): " + nivel2);
        log.info("Número de estudiantes en Nivel 3 (26-35 años): " + nivel3);


        //Concatenar Nombres de Estudiantes

        String concatenacion = "";
        String espacio = " ";

        for (Estudiante alumnos:estudiantes){
            concatenacion += (alumnos.getNombre() + espacio +  alumnos.getEdad() ) + espacio;
        }

        log.info(concatenacion.toString());
    }
}




