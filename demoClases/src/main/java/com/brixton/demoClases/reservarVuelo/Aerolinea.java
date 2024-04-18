package com.brixton.demoClases.reservarVuelo;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Aerolinea {
    private String nombreEmpresa;
    private List<String> lugarDeDestino;
    private List<Vuelo> fechaDisponible;

    public double isValidDestination(String destino){
        //Destino que ingrese
        return 0;
    }

    public double ofertaDescuento(List<String> lugareDeDestino){

        return 0.0;
    }
}
