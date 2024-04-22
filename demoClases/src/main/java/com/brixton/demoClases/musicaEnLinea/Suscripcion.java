package com.brixton.demoClases.musicaEnLinea;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Suscripcion {

    private LocalDate fechaInicio;
    private boolean isActivo;
}
