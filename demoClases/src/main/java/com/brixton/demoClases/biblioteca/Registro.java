package com.brixton.demoClases.biblioteca;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Registro {

    private String fecha;
    private Integer hora;
    private Integer diasPrestamoLibro;
    private Usuario usuario;

}
