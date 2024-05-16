package com.brixton.demoClases.exception;

import java.util.Scanner;

public class Excepcion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");

        try {
            int edad = input.nextInt();
            System.out.println("edad ingresada:" + edad);
        } catch (Exception e) {
            System.out.println("error, dato incorrecto: " + e.getMessage());
        }
    }
}
