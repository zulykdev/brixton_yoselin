package com.brixton.demoClases.exception;

import java.util.Scanner;

public class SumaIterativa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String continuar = "y";
        while (continuar.equals("y")) {
            try {
                System.out.println("Ingrese el primer valor: ");
                double num1 = input.nextDouble();

                System.out.println("Ingrese el segundo valor: ");
                double num2 = input.nextDouble();

                double suma = num1 + num2;

                System.out.println("El resultado de la suma es : " + suma);
            } catch (Exception e) {
                System.out.println("Solo se permite valor numérico: " + e.getMessage());
            }

            System.out.println("Desea continuar? : y/n");
            continuar = input.next();

        }
    }
}

