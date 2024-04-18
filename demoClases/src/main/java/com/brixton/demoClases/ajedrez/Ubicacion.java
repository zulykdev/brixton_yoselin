package com.brixton.demoClases.ajedrez;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ubicacion {
    private String codHori;
    private String codVert;

    public Ubicacion(String codHori, String codVert){
        setCodHori(codHori);
        setCodVert(codVert);
    }
}
