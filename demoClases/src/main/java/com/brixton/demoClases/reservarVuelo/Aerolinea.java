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
    private Map<Politica> politicasVuelo;

    public boolean isValidDestination(String destino) {
        //Destino que ingrese debe buscarse o compararse con la lista de Destinos Disponibles de la aerolinea
        //Si es un destino valido, retornas true, isValidDestination
        //Si es un destino invalido, retornas false, isValidDestination 
        
    }

    public boolean isAvailableSit(String destino, LocalDateTime fechaIda, LocalDateTime fechaRetorno) {
        //busca en los vuelos existentes de esa fecha y revisa los asientos. 
    }

    

    public Oferta ofertaDescuento(List<String> lugareDeDestino){
        return 0.0;
    }
}
