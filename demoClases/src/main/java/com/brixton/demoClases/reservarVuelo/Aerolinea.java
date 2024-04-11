package com.brixton.demoClases.reservarVuelo;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Aerolinea {
    private String nombreEmpresa;
    private List<String> lugareDeDestino;
    private Vuelo fechaDisponible;

    public double ofertaDescuento(List<String> lugareDeDestino){

        return 0.0;
    }
}
