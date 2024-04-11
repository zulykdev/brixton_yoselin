package com.brixton.demoClases.viajeTuristico;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Reserva {

    private PaqueteTuristico reservarPaquete;
    private LocalDate fechaReserva;

    public void reservarViaje(LocalDate fechaViaje){

    }
}
