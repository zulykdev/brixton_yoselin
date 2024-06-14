package com.brixton.gestionUsuario.model.role;

public enum TypeRole {
    ADMINISTRADOR("ADMINISTRADOR"),
    EDITOR("EDITOR"),
    INVITED("INVITED");

    private String status;
    TypeRole(String status){
        this.status= status;
    }
    String getStatus(){
        return  this.status;
    }

}
