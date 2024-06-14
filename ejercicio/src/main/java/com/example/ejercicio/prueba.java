package com.example.ejercicio;

public class prueba {
    public static void main(String[] args) {
        String sCadena1 = new String("Avila");
        String sCadena2 = new String("Salamanca");
        String sCadena3 = new String("AVILA");

        if (sCadena1.equalsIgnoreCase(sCadena2))
            System.out.println(sCadena1 + " y " + sCadena2 + " son IGUALES");
        else
            System.out.println(sCadena1 + " y " + sCadena2 + " son DIFERENTES");

        if (sCadena1.equalsIgnoreCase(sCadena3))
            System.out.println(sCadena1 + " y " + sCadena3 + " son IGUALES");
        else
            System.out.println(sCadena1 + " y " + sCadena3 + " son DIFERENTES");
    }
}
