package com.brixton.demoClases.viajeTuristico;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Reserva {

    private PaqueteTuristico reservarPaquete;
    private LocalDate fechaReserva;
    private Cliente cliente;

    public void reservarViaje(LocalDate fechaViaje){

    }
}
