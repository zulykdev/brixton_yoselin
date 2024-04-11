package com.brixton.demoClases.reservarVuelo;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class Vuelo {
    private String lugarDeSalida;
    private String lugarDeLlegada;
    private LocalDate fecha;
    private LocalTime tiempodeVuelo;
    private double precio;
    private int numeroEscala;
    private int numeroPasajero;


    public void buscarVuelo(LocalDate fechaViaje, String lugarOrigen,
                            String lugarDestino){

    }
}
