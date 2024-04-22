package com.brixton.demoClases.ajedrez;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Posicion {
    private String codHori;
    private String codVert;

    public Posicion(String codHori, String codVert){
        setCodHori(codHori);
        setCodVert(codVert);
    }
}
