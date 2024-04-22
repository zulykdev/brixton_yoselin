package com.brixton.demoClases.biblioteca;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Registro {

    private String fecha;
    private Integer hora;
    private Integer diasPrestamoLibro;
    private Usuario usuario;

}
