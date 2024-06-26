package com.brixton.demoClases.viajeTuristico;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String ciudad;
    private String pais;
    private TipoDocumento identificacion;
    private String numeroDocumento;

}
