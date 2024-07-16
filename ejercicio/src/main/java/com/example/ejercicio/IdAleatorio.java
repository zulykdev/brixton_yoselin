package com.example.ejercicio;

import java.util.UUID;

public class IdAleatorio {
    public static void main(String[] args) {

        // Generar un UUID aleatorio (UUID4)
        UUID uuid4 = UUID.randomUUID();
        System.out.println("UUID4: " + uuid4.toString());

        // Obtener los bits más y menos significativos
        long mostSigBits = uuid4.getMostSignificantBits();
        long leastSigBits = uuid4.getLeastSignificantBits();
        System.out.println("Most Significant Bits: " + mostSigBits);
        System.out.println("Least Significant Bits: " + leastSigBits);

        // Obtener la versión y el variante
        int version = uuid4.version();
        int variant = uuid4.variant();
        System.out.println("Version: " + version);
        System.out.println("Variant: " + variant);
        System.out.println("Version1: " + version);
        System.out.println("Variant1: " + variant);
    }

}
